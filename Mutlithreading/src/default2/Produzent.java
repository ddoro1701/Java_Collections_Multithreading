package default2;

import java.util.List;
import java.util.Random;

public class Produzent extends Thread {
	private List<Integer> l1;
	private int zaehler;

	public Produzent(List<Integer> l) {
		super("Produzent");
		this.l1 = l;
	}

	@Override
	public void run() {
		Random r = new Random();
		while (true) {
			this.l1.add(zaehler++);

			try {
				Thread.sleep(r.nextInt(1000, 3000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

	}
}
