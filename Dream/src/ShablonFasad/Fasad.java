package ShablonFasad;

public class Fasad {

	public static void main(String[] args) {
//		Power power = new Power();
//		power.on();
//		DVDrom dvd = new DVDrom();
//		dvd.load();
//		Hdd hdd = new Hdd();
		Computer comp = new Computer();
		comp.copy();
		

	}
}
class Computer{
	Power power = new Power();
	DVDrom dvd = new DVDrom();
	Hdd hdd = new Hdd();
	void copy(){
		power.on();
		dvd.load();
		hdd.copyFromDVD(dvd);
	}
}
class Power {
	void on() {
		System.out.println("Switch on");
	}

	void off() {
		System.out.println("Switch off");
	}
}

class DVDrom {
	private boolean data = false;

	public boolean hasData() {
		return data;
	}

	void load() {
		System.out.println("write date");
		data = true;
	}

	void unload() {
		System.out.println("syso date");
		data = false;
	}
}

class Hdd {
	void copyFromDVD(DVDrom dvd) {
		if (dvd.hasData()) {
			System.out.println("date load");
		} else {
			System.out.println("enter DVD");
		}
	}
}
