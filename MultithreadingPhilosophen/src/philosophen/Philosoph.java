package philosophen;

public class Philosoph implements Runnable {
	static private int zaehler;
	private int id;
	Gabel g;
	Philosoph Nachbar;

	public Philosoph() {
		id = ++zaehler;
		this.g = new Gabel(id);
	}

	public void essen() {
		if (this.g.nimm(this)) {
			System.out.println(this.id + "--> genommen-->" + this.g);
			System.out.println(this + "am essen");
			if (this.Nachbar.g.nimm(this)) {
				System.out.println(this.id + "--> genommen-->" + this.Nachbar.g);
				try {
					Thread.sleep((int) (Math.random() * 2000 + 1000));

				} catch (InterruptedException e) {
					Thread.currentThread().interrupt(); // andere können mich als thread nicht abschießen, sagen nur
				}

				System.out.println(this.id + "--> abgelegt-->" + this.g);
				this.Nachbar.g.ablegen();
				System.out.println(this.id + "--> abgelegt-->" + this.Nachbar.g);
				System.out.println(this + "essen beendet");
			} else {
				System.out.println(this + ": bleibt hungrig");
			}
		} else {
			System.out.println(this + ": bleibt hungrig");
			this.g.ablegen();
		}

	}

	public void denken() {
		try {
			System.out.println(this + "am denken");
			Thread.sleep((int)(Math.random() * 2000 + 1000));

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // andere können mich als thread nicht abschießen, sagen nur
		}
		System.out.println(this + "denken beendet");
	}

	public static int getZaehler() {
		return zaehler;
	}

	public static void setZaehler(int zaehler) {
		Philosoph.zaehler = zaehler;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gabel getG() {
		return g;
	}

	public void setG(Gabel g) {
		this.g = g;
	}

	public Philosoph getNachbar() {
		return Nachbar;
	}

	public void setNachbar(Philosoph nachbar) {
		Nachbar = nachbar;
	}

	@Override
	public void run() {
		while (true) {
			essen();
			denken();
		}

	}

	@Override
	public String toString() {
		return "Philosophenid " + id + ", g=" + g + "]";
	}

}
