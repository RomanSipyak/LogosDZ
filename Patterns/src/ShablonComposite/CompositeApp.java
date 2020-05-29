package ShablonComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {
	public static void main(String Args[]) {
		Shape square1 = new Square();
		Shape square2 = new Square();
		Shape triangle1 = new Triangle();
		Shape square3 = new Square();
		Shape circle1 = new Circle();
		Shape circle2 = new Circle();
		Shape circle3 = new Circle();

		Composite composit = new Composite();
		Composite composit1 = new Composite();
		Composite composit2 = new Composite();

		composit1.addComponets(square1);
		composit1.addComponets(square2);
		composit1.addComponets(triangle1);

		composit2.addComponets(square3);
		composit2.addComponets(circle1);
		composit2.addComponets(circle2);
		composit2.addComponets(circle3);

		composit.addComponets(composit1);
		composit.addComponets(composit2);
		composit.draw();
	}
}
	interface Shape {
		void draw();
	}

	class Square implements Shape {
		public void draw() {
			System.out.println("Hi i Square");
		}
	}

	class Triangle implements Shape {
		public void draw() {
			System.out.println("Hi i  Triangle");
		}
	}

	class Circle implements Shape {
		public void draw() {
			System.out.println("Hi i Circle");
		}
	}

	class Composite implements Shape {
		private List<Shape> components = new ArrayList<>();

		public void addComponets(Shape component) {
			this.components.add(component);
		}

		public void removeComponent(Shape component) {
			components.remove(component);
		}

		public void draw() {
			for (Shape component : components) {
				component.draw();
			}
		}
	}
	
