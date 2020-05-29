package core.dz2;

public class Main {

	public static void main(String[] args) {
		CoffeeRobot coffeeRobot = new CoffeeRobot();
		Robot robot = new Robot();
		RobotCook robotCook = new RobotCook();
		RobotDancer roborDancer = new RobotDancer();
		Robot robotSecond = new CoffeeRobot();
		coffeeRobot.work();
		robot.work();
		robotCook.work();
		roborDancer.work();
		robotSecond.work();

	}

}
