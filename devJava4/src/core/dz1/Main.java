package core.dz1;

public class Main {

	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		System.out.println(a.getHeight()+" "+a.getWidth());
		Rectangle b = new Rectangle(7,8);	
		System.out.println(b.getHeight()+" "+b.getWidth());
		a.printPerimetr();
		b.printPerimetr();
		a.printArea();
		b.printArea();
	}

}
