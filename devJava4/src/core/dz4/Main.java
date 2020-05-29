package core.dz4;

public class Main {

	public static void main(String[] args) {
		Salary salaryFirst = new MounyhSalary(10);
		Salary salarySecond = new DaySalary(2, 45);
		Worcker a = new Worcker("Jon");
		a.Salary(salaryFirst);
		a.Salary(salaryFirst);
	}

}
