package core.dz4;

public class MounyhSalary implements Salary{
	public double stavka;
	public MounyhSalary(double stavka){
		this.stavka=stavka;
	}
	@Override
	public double sal() {
		return stavka;
	}

}
