package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class Main { //AUSWENDIG LERNEN

	public static void main(String[] args){
		
		Path iphiPath = Paths.get("iphigenie.txt");
		//Programmieren gegen Schnittstellen
		SortedMap<String, SortedMap<Integer, SortedSet<Integer>>> mapWoerter = new TreeMap<>();
		Integer counter = 0;
		System.out.println(Files.exists(iphiPath));
		try (BufferedReader br1 = Files.newBufferedReader(iphiPath))
		{
		String zeile;
		while((zeile = br1.readLine()) != null ) {
			zeile = zeile.toLowerCase();
			counter++;
			System.out.println(zeile.toLowerCase());
			String[] woerter = zeile.split("\\P{L}+");
			for (String wort : woerter) {
				mapWoerter.putIfAbsent(wort, new TreeMap<>());
			}
			zeile.indexOf(zeile); //  AUSGEBEN ALLE WÖRTER DER ZEILE INDEX NUMMER
			//STRING DURCHSUCHEN NACH DEN WÖRTERN
		}}
		catch (IOException exception) {
			System.err.print(exception);
		}
		
		
	}
}

//PRÜFUNG ALLE VORKOMMEN IN EINEM STRING
//indexOf
//

/*  ------ ALLES WAS DAZUKAM IST WIEDERHOLUNG COLLECTIONS


package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main { //AUSWENDIG LERNEN

	public static void main(String[] args){
		
		Path iphiPath = Paths.get("iphigenie.txt");
		System.out.println(Files.exists(iphiPath));
		try (BufferedReader br1 = Files.newBufferedReader(iphiPath))
		{
		String zeile;
		while((zeile = br1.readLine()) != null ) {
			System.out.println(zeile);
		}}
		catch (IOException exception) {
			System.err.print(exception);
		}
		
		
	}
}

*/