package philosophen;

public class Gabel {
private int id;
private Philosoph nehmer;

public Gabel(int id) {
	super();
	this.id = id;
}


public synchronized boolean nimm(Philosoph p) {
	if (this.nehmer == null) {
		this.nehmer = p;
		return true;
	}
	return false;
}
public synchronized Philosoph ablegen () {
	Philosoph tmp = this.nehmer;
	this.nehmer = null;
	return tmp;
}

public boolean inBenutzung () {
	return this.nehmer!= null;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public Philosoph getNehmer() {
	return nehmer;
}


public void setNehmer(Philosoph nehmer) {
	this.nehmer = nehmer;
}


@Override
public String toString() {
	String tmp = "Gabel [gabelid=" + id;
	if (inBenutzung()) {
		tmp+= ", nehmerid=" + nehmer.getId() + "]";
	}
	return tmp;
}

}
