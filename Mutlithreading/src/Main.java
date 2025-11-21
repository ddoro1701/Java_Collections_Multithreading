
public class Main {

	public static void main(String[] args) {
	    Lager lager = new Lager(100);
	    ProThread pt = new ProThread(lager);
	    KonThread kt = new KonThread(lager);

	    pt.start();
	    kt.start();
	}


}
