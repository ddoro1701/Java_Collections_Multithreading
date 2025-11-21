package schnick_schnack;  //package wie importieren, an welche Stelle und schreibeweise wie hier

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum Symbol {
	SCHERE(new String[] { "PAPIER" }), 
	STEIN(new String[] { "SCHERE" }), 
	PAPIER(new String[] { "STEIN", "BRUNNEN" }),
	BRUNNEN(new String[] { "STEIN", "SCHERE" });

	private Set<String> gewinntGegen;
	
	
	Symbol(String[] gewinntGegen) {
		this.gewinntGegen = new HashSet<>(Arrays.asList(gewinntGegen)) {
		};
	}

	public int vergleich(Symbol s) {
		if (this == s) {
			return 0;
		}
		if (this.gewinntGegen.contains(s.name())) {
			return 1;
		}
		return -1;
	}
}
