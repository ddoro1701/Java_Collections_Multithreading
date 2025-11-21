package default2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> l1 = new Anzeigeliste();
		l1.add(2);
		Thread t1 = new Thread((Runnable)l1, "Anzeigethread");
		Produzent p1 = new Produzent(l1);
		Konsument k1 = new Konsument(l1);
		t1.start();
		p1.start();
		k1.start();
		
	}

}
