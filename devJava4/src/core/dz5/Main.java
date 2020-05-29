package core.dz5;

public class Main {
	public static void main(String[] args) {
		Car car = (new Car(new Helm(1),
				new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(1, 3)));
		System.out.println(car);
		car.addradius(5);
		System.out.println(car.countOFkm());
		car.pickUP();
		System.out.println(car);
	}

}
