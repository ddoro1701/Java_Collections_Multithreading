
public class Notifier {

	public static void main(String[] args) {

		Object obj1 = new Object();

		Waiter[] waiters = new Waiter[5];
		for (int i = 0; i < waiters.length; i++) {
			waiters[i] = new Waiter(obj1);
			waiters[i].start();
		}
		for (int i = 0; i < 5; i++) {
			try {
				Thread.currentThread().sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (obj1) {
				obj1.notifyAll();
				//Alle die um den Monitor konkurieren blockiert werden können und der 
				//Notifier kann auch konkurieren und wenn der abgeschossen wird gibts keinen mehr
				//Dann sind alle im scheduler und es gibt kein runnable mehr
			}
		}

	}

}
