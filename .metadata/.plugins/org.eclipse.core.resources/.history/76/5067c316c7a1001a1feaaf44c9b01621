package core.dz8;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import core.dz5.Body;
import core.dz5.Car;
import core.dz5.Drive;
import core.dz5.Helm;
import core.dz5.TypeWeels;
import core.dz5.Wheel;

public class Main {
	public static void main(String[] args) {
		Set<Car> set=  new LinkedHashSet<>();
		set.add(new Car(new Helm(1), new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(1, 3)));
		set.add(new Car(new Helm(2), new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "red"), new Drive(1, 25)));
		set.add(new Car(new Helm(3), new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "blue"), new Drive(1, 15)));
		set.add(new Car(new Helm(4), new Wheel(TypeWeels.SPRING, 1.32, 3.25),
				new Body(1, 1, "red"), new Drive(0, 15)));
		set.add(new Car(new Helm(5), new Wheel(TypeWeels.SPRING, 1.32, 3.25),
				new Body(1, 1, "black"), new Drive(1, 100)));
		set.add(new Car(new Helm(6), new Wheel(TypeWeels.SUMMER, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(0, 9)));
		set.add(new Car(new Helm(7), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "red"), new Drive(0, 3)));
		set.add(new Car(new Helm(1), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "pinck"), new Drive(1, 12)));
		set.add(new Car(new Helm(9), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "gray"), new Drive(0, 10)));
		set.add(new Car(new Helm(10), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "blue"), new Drive(1, 2)));

		
		
	}
	/*1. Машинам, які мають вказаний колір кузова та вказаний діаметр колеса, змінити тип шин на вказаний.

	2. Видалити машини, діаметр колес яких попадає у вказаний діапазон.

	3. Знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний*/
	public static void DdiametrAndBodyTypeDelete(Scanner a, Set<Car> set) {
		int radius1 = a.nextInt();
		int radius2 = a.nextInt();
		int max;
		int min;
		if (radius1 > radius2) {
			max = radius1;
			min = radius2;
		} else {
			max = radius2;
			min = radius1;
		}
		
		Iterator<Car> iter = set.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getRadius() <= max && car.getRadius() >= min) {
				iter.remove();
			}
		}
		System.out.println(set);

	}
	
	public static void DiametrOfWeels(Scanner a, Set<Car> set) {
		int radius1 = a.nextInt();
		int radius2 = a.nextInt();
		int max;
		int min;
		if (radius1 > radius2) {
			max = radius1;
			min = radius2;
		} else {
			max = radius2;
			min = radius1;
		}
		String color = a.next();
		String typeWeels = a.next();
		TypeWeels typeWeels1 = TypeWeels.valueOf(typeWeels.toUpperCase());
		Iterator<Car> iter = set.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getRadius() <= max && car.getRadius() >= min&&car.getColor().equals(color)) {
				car.setTypeWeels(typeWeels1);
			}
		
		}
		System.out.println(set);
	}
	public static void TypeOfWeels(Scanner a, Set<Car> set) {
		int radius1 = a.nextInt();
		int radius2 = a.nextInt();
		int max;
		int min;
		if (radius1 > radius2) {
			max = radius1;
			min = radius2;
		} else {
			max = radius2;
			min = radius1;
		}
		String typeWeels = a.next();
		TypeWeels typeWeels1 = TypeWeels.valueOf(typeWeels.toUpperCase());
		Iterator<Car> iter = set.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getRadius() <= max && car.getRadius() >= min&&car.getTypeWeels()==typeWeels1) {
				System.out.println(car);;
			}
		
		}
		System.out.println(set);
	}

}
