import java.util.Iterator;

public class Waiter extends Thread {

	Object obj;

	public Waiter(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			synchronized (this.obj) {
				System.out.println(this.getName() + " Wartet " + i + " mal");
				try {
					this.obj.wait(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
					Thread.currentThread().interrupt();
				}
				System.out.println(this.getName() + " " + i + " legt wieder los");
			}
		}
	}
}
