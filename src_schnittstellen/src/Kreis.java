public class Kreis implements Profil {
    private double r;
    
    public Kreis(double[] r) {
       this(r[0]);    
    }
    
    public Kreis(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Kreis{" + "r=" + r + '}';
    }

    public double getR() {
        return r;
    }

    public double umfang() {
        return 2*Math.PI * this.r;
    }

    @Override
    public double flaeche() {
        return Math.PI * this.r * this.r;
    }

    
}
