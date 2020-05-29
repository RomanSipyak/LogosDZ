package ShablonDecorator;

public class DecoratorApp {

	public static void main(String[] args) {
		PrinterInterface printer = new Printer("GoGo");
		PrinterInterface printer2 = new QoutesDecorator(printer);
		PrinterInterface printer3 = new LeftBrecetsDecorator(printer);
		PrinterInterface printer4 = new LeftBrecetsDecorator(new RightBrecetsDecorator(printer));
		PrinterInterface printer5 = new  QoutesDecorator(new LeftBrecetsDecorator(new RightBrecetsDecorator(printer)));
		printer.print();
		printer2.print();
		printer3.print();
		printer4.print();
		printer5.print();
	}

}
interface PrinterInterface{
	void print();
}
class Printer implements PrinterInterface{
	String value;
	public Printer(String value){
		this.value=value;
	}
	@Override
	public void print() {
		System.out.print(value);
	}
	
}
abstract class Decorator implements PrinterInterface{
	PrinterInterface component;
	Decorator(PrinterInterface component){
		this.component=component;
	}
}
class QoutesDecorator extends Decorator{
	public QoutesDecorator(PrinterInterface component){super(component);}
	@Override
	public void print() {
		System.out.print("\"");
		component.print();
		System.out.print("\"");
	}
}
class LeftBrecetsDecorator extends Decorator{
	public LeftBrecetsDecorator(PrinterInterface component){super(component);}
	@Override
	public void print() {
		System.out.print("[");
		component.print();
		
	}
}
class RightBrecetsDecorator extends Decorator{
	public RightBrecetsDecorator(PrinterInterface component){super(component);}
	@Override
	public void print() {
		component.print();
		System.out.print("]");
		
	}
}
//class QoutesDecorator implements PrinterInterface{
//	PrinterInterface component;
//	public QoutesDecorator(PrinterInterface component){this.component= component;}
//	@Override
//	public void print() {
//		System.out.print("\"");
//		component.print();
//		System.out.print("\"");
//	}
//}
//class LeftBrecetsDecorator implements PrinterInterface{
//	PrinterInterface component;
//	public LeftBrecetsDecorator(PrinterInterface component){this.component= component;}
//	@Override
//	public void print() {
//		System.out.print("[");
//		component.print();
//		
//	}
//}
//class RightBrecetsDecorator implements PrinterInterface{
//	PrinterInterface component;
//	public RightBrecetsDecorator(PrinterInterface component){this.component= component;}
//	@Override
//	public void print() {
//		component.print();
//		System.out.print("]");
//		
//	}
//}