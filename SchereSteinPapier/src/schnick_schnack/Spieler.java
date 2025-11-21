package schnick_schnack;
import static schnick_schnack.Symbol.*; //

public class Spieler extends Thread {
	private Symbol symbol;
	
	public Spieler(String name) {
		super(name);
	}
	//MONITOR,EIN REFERENZOBJEKT, FÜHRT DIELISTE WER GERADE WARTET, DADRAUF MUSS MAN SICH ENIGEN WER WARTET GERADE
	//

	public void run() {
		synchronized (this) {
			this.symbol = Symbol.values().clone()[(int)(Math.random()*Symbol.values().length)];
			System.out.println(this);
			try {
				wait();   //MIT NOTIFY (AUFGABE DER MODERATORS) MUSS 2 nennen
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

	}
	
	
	
	public Symbol getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return "Spieler [symbol=" + symbol + ", toString()=" + super.toString() + "]";
	}
	
}
