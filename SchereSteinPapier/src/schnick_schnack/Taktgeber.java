package schnick_schnack;

import java.util.ArrayList;
import java.util.List;

public class Taktgeber extends Thread {
		private List<Spieler> listSpieler = new ArrayList<>();
		
		
		public Taktgeber(String[] listeSpieler) {
			for(String i : listeSpieler) {
				Spieler tmp = new Spieler(i);
				listSpieler.add(tmp);
				tmp.start();
			}
		}
	
		public void run() {
			while(true) {
				Spieler spieler1 = listSpieler.get((int)(Math.random()*this.listSpieler.size()));
				Spieler spieler2 = null;
				do {
					spieler2 = listSpieler.get((int)(Math.random()*this.listSpieler.size()));
				} while (spieler1==spieler2);
				int ergebnis = spieler1.getSymbol().vergleich(spieler2.getSymbol());
				System.out.println(ergebnis);
				if (ergebnis == 0) {
					spieler1.notify();
					spieler2.notify();
				}
			}
		}
	

}
