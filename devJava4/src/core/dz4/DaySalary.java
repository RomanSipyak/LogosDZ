package core.dz4;

public class DaySalary implements Salary {
	public double stavka;
	public double godinu;

	public DaySalary(double stavka, double godinu) {
		this.stavka = stavka;
		this.godinu = godinu;
	}

	@Override
	public double sal() {
		return stavka * godinu;
	}

}
