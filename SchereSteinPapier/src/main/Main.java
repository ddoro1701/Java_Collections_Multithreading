package main;

import static schnick_schnack.Symbol.*;

import schnick_schnack.Symbol;
import schnick_schnack.Taktgeber;

public class Main {

	public static void main(String[] args) {
		boolean ergebnis;
		Symbol schere1 = SCHERE;
		
		System.out.println(BRUNNEN.vergleich(SCHERE));
		System.out.println(PAPIER.vergleich(PAPIER));
		System.out.println(PAPIER.vergleich(SCHERE));
		
		
		Taktgeber taktgeber = new Taktgeber(new String[] {"A", "B","C","D","E"});
		taktgeber.start();
		
	}
}
