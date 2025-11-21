import java.lang.reflect.Constructor;

public class ProfilFactory {

    public static Profil getProfil(String name, double[] parameter) {
        return (Profil)newInstance(name, parameter);
    }
    
    private static Object newInstance(String name, double[] parameter) {
        Object o = null;
        try {            
            Constructor c = Class.forName(name).getConstructor(double[].class);            
            o = c.newInstance(parameter);
        } catch (Exception ex) {
            //ex.printStackTrace();
        } 
        return o;
    }
    
    
}
