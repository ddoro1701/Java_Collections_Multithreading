package philosophen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hauptprogramm {

	public static void main(String[] args) {
		List<Philosoph> l1 = new ArrayList<>();

		for(int i = 0; i<4;i++) {
			l1.add(new Philosoph());
		}
		
		for(int i = 0; i<3;i++) {
			l1.get(i).setNachbar(l1.get(i+1));;
		}
		l1.get(3).setNachbar(l1.get(0));
		for(Philosoph p : l1){
			new Thread(p).start();
		}
		
		System.out.println(l1);
	
	}

}
