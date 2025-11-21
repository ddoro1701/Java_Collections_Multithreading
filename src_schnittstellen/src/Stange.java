public class Stange {
	private int laenge;

	public Stange(int laenge) {
		this.laenge = laenge;
	}

	public double berechneVolumen(Profil profil) {
		return profil.flaeche() * laenge;
	}
	
	public static void main(String[] args) {
		Dreieck d = new Dreieck(2,1);
		Stange s = new Stange(10);
		System.out.println(s.berechneVolumen(d));
	}
}
