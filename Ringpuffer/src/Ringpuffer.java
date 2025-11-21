import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ringpuffer extends Thread{
	Collections
	private ArrayList<Integer> buffer;
	private int head;
	private int tail;
	private int size;
	
	public Ringpuffer() {
		super();
		this.buffer = new ArrayList<>(16);
		this.head = 0;
		this.tail = 0;
		this.size = 0;
	}
	
	public synchronized void insert(int zahl) {
		if (size  == 16) {
			head = (head + 1) % 16;
			buffer.set(head, zahl);
		}
		else {
			buffer.add(zahl);
			size++;
		}
		tail = (tail + 1) % 16;
	}
	
	public synchronized int extract() {
		if (size == 0) {
			throw new IllegalStateException("Ringpuffer ist leer");
		}
		int extrahierteZahl = buffer.get(head);
		head = (head + 1) % 16;
		size--;
		return extrahierteZahl;
	}

	public synchronized int getSize() {
		return size;
	}
	
	@Override
	public void run() {
		super.run();
		
		for(int i = 0; i < 30;i++) {
			this.insert(i);
		}
		while (this.getSize() > 0) {
			System.out.println("Extrahiert: " + this.extract());
		}
	}
	
	
}
