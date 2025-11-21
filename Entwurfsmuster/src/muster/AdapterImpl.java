package muster;

public class AdapterImpl extends MacherClass implements AdapterInterface {

	@Override
    public void machAnderes() {
        System.out.println("Mach etwas:");
        machEtwas();
	}

}
