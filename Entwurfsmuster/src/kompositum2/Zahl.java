package kompositum2;

public class Zahl extends Term {
	int zahl;

	public Zahl(int zahl) {
		super();
		this.zahl = zahl;
	}

	@Override
	public int wert() {
		return zahl;
	}

	@Override
	public String toString() {
		return "Zahl [zahl=" + zahl + "]";
	}

}
