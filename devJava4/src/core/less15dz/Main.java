package core.less15dz;

public class Main {

	public static void main(String[] args) {
		MyMap<String,Integer> a = new MyMap<>();
		a.put("1",4);
		a.put("2",3);
		a.put("3",2);
		a.put("4",1);
		a.printSetKey();
		a.remove("2");
		a.printListValue();
		a.remuve2(1);
		a.put("1",100);
		a.print3();

	}

}
