import java.util.Scanner;

public class Main {

    static Scanner stdin = new Scanner(System.in);

    public static void main(String args[]) {
        String profilForm ;
        int laenge;
        System.out.print("Stangenlaenge? ");
        laenge = stdin.nextInt();
        stdin.nextLine();
        do {
            System.out.print("Profil-Form? ");
            profilForm = stdin.nextLine().trim();
            System.out.print("Profil-Parameter? ");
            String[] profilParamter = stdin.nextLine().trim().split(",");
            double[] parameter = new double[profilParamter.length];
            for (int i=0; i < parameter.length; i++) {
               try {
                 parameter[i] = Double.parseDouble(profilParamter[i]);
               } catch (NumberFormatException nfe) {};
                
            } 
            Profil p = ProfilFactory.getProfil(profilForm, parameter);
            if (p != null) {
                Stange stange = new Stange(laenge);
 
                System.out.println("Volumen: " + stange.berechneVolumen(p));
            } else {
                System.out.println("Profil nicht vorhanden");
            }
        } while (true);

    }

}
