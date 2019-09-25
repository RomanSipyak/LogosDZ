package core.zoo;

public class Pet {

	private String animal;

	private int age;

	public Pet(int age, String animal) {
		this.age = age;
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [animal=" + animal + ", age=" + age + "]";
	}

}

