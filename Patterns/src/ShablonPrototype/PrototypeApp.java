package ShablonPrototype;

public class PrototypeApp {

	public static void main(String[] args) {
		Human originalHuman = new Human(10,"Miha");
		Human copy = (Human) originalHuman.copy();
		System.out.println(originalHuman);
		System.out.println(copy);
		HumanFactory factory = new HumanFactory(copy);
		Human h1=factory.makeCopy();
		System.out.println(h1);
		
		factory.setPrototype(new Human(12,"ola"));
		Human h2 = factory.makeCopy();
		System.out.println(h2);
	}

}
interface Copyable{
		Object copy();
		
}
class Human implements Copyable{
	
	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + "]";
	}
	int age;
	String name;
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public Object copy() {
		Human copy = new Human(age,name);
		return copy;
	}
	
}
class HumanFactory{
	Human human;

	public HumanFactory(Human human) {
		setPrototype(human);
	}
	public void setPrototype(Human human){
		this.human= human;
	}
	Human makeCopy(){
		return (Human)human.copy();
	}
}