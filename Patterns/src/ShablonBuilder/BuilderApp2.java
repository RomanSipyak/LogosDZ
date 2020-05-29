package ShablonBuilder;

public class BuilderApp2 {

	public static void main(String[] args) {
		Director director = new Director();
		director.setBuilder(new FordMondeoBuilder());
		Car car =director.BuildCar();
		System.out.println(car);

	}

}

abstract class CarBuilder2{
	Car car;
	void createCar(){car=new Car();}
	
	abstract void buildMake();
	abstract void buildTransmission();
	abstract void buildMaxSpeed();
	
	Car getCar(){return car;}
}
class FordMondeoBuilder extends CarBuilder2{
	@Override
	void buildMake() {car.setMake("Fort");}
	@Override
	void buildTransmission() {car.setTransmission(Transmission.Auto);}
	@Override
	void buildMaxSpeed() {car.setMaxSpeed(160);}
}
class SubaruBuilder extends CarBuilder2{
	@Override
	void buildMake() {car.setMake("Subaru");}
	@Override
	void buildTransmission() {car.setTransmission(Transmission.Auto);}
	@Override
	void buildMaxSpeed() {car.setMaxSpeed(180);}
}
class Director{
	CarBuilder2 builder;
	void setBuilder(CarBuilder2 builder){this.builder=builder;}
	Car BuildCar(){
		builder.createCar();
		builder.buildMake();
		builder.buildMaxSpeed();
		builder.buildTransmission();
		Car car = builder.getCar();
		return car;
	}
}