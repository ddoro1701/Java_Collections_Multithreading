package default2;

import java.util.ArrayList;

public class Anzeigeliste extends ArrayList<Integer> implements Runnable{

	@Override
	public void run() {
		while(true) {
		System.out.println(this);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		}
	}
	
}
