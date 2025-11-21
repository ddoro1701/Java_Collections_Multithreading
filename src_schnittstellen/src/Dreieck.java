public class Dreieck implements Profil {
  private double a, hoehe;
  public Dreieck(double[] ah) {
      this(ah[0], ah[1]);    
   }
  public Dreieck(double a, double hoehe) { 
    this.a = a;
    this.hoehe = hoehe;
  }
  @Override
  public double flaeche() {
    return a * hoehe / 2;
  }
}
