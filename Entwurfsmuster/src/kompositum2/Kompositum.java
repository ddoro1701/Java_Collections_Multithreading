package kompositum2;

import java.util.Arrays;

public class Kompositum extends Term {
	public enum Operation {
		PLUS, MINUS, MAL;
	}

	private Term[] terme;
	private Operation op;

	public Kompositum(Operation operator, Term[] terme) {
		this.terme = terme;
		this.op = operator;
	}

	@Override
	public int wert() {
		int ergebnis;
		switch (this.op) {
		case PLUS: {
			ergebnis = 0;
			for (Term t : terme) {
				ergebnis += t.wert();
			}
			break;
		}
		case MINUS: {
			ergebnis = terme[0].wert();
			for (int i = 1; i < terme.length; i++) {
				ergebnis -= terme[i].wert();
			}
			break;
		}
		case MAL: {
			ergebnis = 1;
			for (Term t : terme) {
				ergebnis *= t.wert();
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.op);
		}

		return ergebnis;
	}

	@Override
	public String toString() {
		return "Kompositum [terme=" + Arrays.toString(terme) + "]";
	}

	public static void main(String[] args) {
		Term[] terme = new Term[] { new Zahl(3), new Zahl(5) };
		Kompositum kompositum1 = new Kompositum(Operation.PLUS, terme);
		Term[] terme2 = new Term[] { new Zahl(3), kompositum1 };
		Kompositum kompositum2 = new Kompositum(Operation.MAL, terme2);
		System.out.println(kompositum2.wert());
	}
}
