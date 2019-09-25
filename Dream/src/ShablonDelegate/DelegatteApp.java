package ShablonDelegate;

public class DelegatteApp {

	public static void main(String[] args) {
		A a = new A();
		a.f();
		Painter painter = new Painter();
		painter.setGraphics(new Square());
		painter.draw();
		painter.setGraphics(new Circle());
		painter.draw();
	}
}
	class A {

		void f() {
			System.out.println("f()");
		}
	}

	class B {
		A a = new A();

		void f() {
			a.f();
		}
	}
interface Graphics{
		void draw();
		
}
class Triangle implements Graphics{
	@Override
	public void draw() {
		System.out.println("Draw triangle");
		
	}
	
}
class Square implements Graphics{

	@Override
	public void draw() {
		System.out.println("Draw Square");
		
	}
	
}
class Circle implements Graphics{

	@Override
	public void draw() {
		System.out.println("Draw Circle");
		
	}
	
}
class Painter{
	Graphics graphic;
	void setGraphics(Graphics graphics){
		this.graphic=graphics;
	}
	void draw(){
		graphic.draw();
	}
}