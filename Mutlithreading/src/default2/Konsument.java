package default2;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Konsument extends Thread {
	private List<Integer> l1;
	private int zaehler;

	public Konsument(List<Integer> l) {
		super("Produzent");
		this.l1 = l;
	}

	@Override
	public void run() {
		Random r = new Random();
		while (true) {
			int z = l1.get(l1.size()-1);
			//for(int i = 0; i<z ;i++)
				if (l1.size()>0) {
					this.l1.remove(l1.get(l1.size()-1));
				}
			
			System.out.println(z);
			
			try {
				Thread.sleep(r.nextInt(1000, 3000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

	}
}
