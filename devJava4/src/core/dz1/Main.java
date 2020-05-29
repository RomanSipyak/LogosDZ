package core.dz1;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangleFirst = new Rectangle();
		System.out.println(rectangleFirst.getHeight() + " " + rectangleFirst.getWidth());
		Rectangle rectangleSecond = new Rectangle(7, 8);
		System.out.println(rectangleSecond.getHeight() + " " + rectangleSecond.getWidth());
		rectangleFirst.printPerimetr();
		rectangleSecond.printPerimetr();
		rectangleFirst.printArea();
		rectangleSecond.printArea();
	}

}
