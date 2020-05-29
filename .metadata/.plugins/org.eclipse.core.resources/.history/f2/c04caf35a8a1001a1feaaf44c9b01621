package core.dz7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import core.dz5.Body;
import core.dz5.Car;
import core.dz5.Drive;
import core.dz5.Helm;
import core.dz5.TypeWeels;
import core.dz5.Wheel;

public class Main {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car(new Helm(1), new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(1, 3)));
		list.add(new Car(new Helm(2), new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "red"), new Drive(1, 25)));
		list.add(new Car(new Helm(3), new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "blue"), new Drive(1, 15)));
		list.add(new Car(new Helm(4), new Wheel(TypeWeels.SPRING, 1.32, 3.25),
				new Body(1, 1, "red"), new Drive(0, 15)));
		list.add(new Car(new Helm(5), new Wheel(TypeWeels.SPRING, 1.32, 3.25),
				new Body(1, 1, "black"), new Drive(1, 100)));
		list.add(new Car(new Helm(6), new Wheel(TypeWeels.SUMMER, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(0, 9)));
		list.add(new Car(new Helm(7), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "red"), new Drive(0, 3)));
		list.add(new Car(new Helm(1), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "pinck"), new Drive(1, 12)));
		list.add(new Car(new Helm(9), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "gray"), new Drive(0, 10)));
		list.add(new Car(new Helm(10), new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "blue"), new Drive(1, 2)));
		Scanner sc = new Scanner(System.in);
		// diametrMetod1(sc, list);
		// RadiusColorMetod2(sc,list);
		// SetDriveMetod3(new Drive(100), list);
		// x2DiametrMetod4(list);
		while (true) {

			System.out
					.println("Введіть 1, щоб знайти машини, які мають введений діаметр коліс");

			System.out
					.println("Введіть 2, щоб знайти машини, які мають введений діаметр коліс, "
							+ "та колір кузова");

			System.out.println("Введіть 3, щоб замінити в усіх машинах, "
					+ "які мають червоний колір кузова, кермо на інше");

			System.out.println("Введіть 4, щоб збільшити діаметр коліс вдвічі,"
					+ " якщо кермо має кнопочки");

			System.out
					.println("Введіть 5, щоб замінити усі машини, "
							+ "які мають колеса діаметром менші за введене значення, на інші машини");

			switch (sc.next()) {

			case "1":
				diametrMetod1(sc, list);
				break;

			case "2":
				RadiusColorMetod2(sc, list);
				break;

			case "3":
				SetDriveMetod3(sc, list);
				break;

			case "4":
				x2DiametrMetod4(list);
				break;

			case "5":
				SetWeelsMetod5(sc, list);
				break;
			case "6":
				bodyType(sc, list);
				break;

			case "7":
				bodyColorDelete(sc, list);
				break;

			case "8":
				DiametrOfWeels(sc, list);
				break;

			case "9":
				DdiametrAndBodyTypeDelete(sc, list);
				break;

			case "10":
				
				break;
			default:
				sc.close();
				return;
			}
		}

	}

	public static void diametrMetod1(Scanner a, List<Car> list) {
		int b = a.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRadius() == b)
				System.out.println("car" + i + " ~" + list.get(i));
		}
	}

	public static void RadiusColorMetod2(Scanner a, List<Car> list) {
		int b = a.nextInt();
		String c = a.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRadius() == b
					&& list.get(i).getColor().equals(c)) {
				System.out.println("car" + i + " ~" + list.get(i));
			}
		}
	}

	public static void SetDriveMetod3(Scanner a, List<Car> list) {
		int CountOfButter = a.nextInt();
		int diametr = a.nextInt();
		Drive drive = new Drive(CountOfButter, diametr);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getColor().equals("red")) {
				System.out.print("car" + i + " ~" + list.get(i));
				list.get(i).setDrive(drive);
				System.out.println("Стало->car" + i + " ~" + list.get(i));
			}

		}
	}

	public static void x2DiametrMetod4(List<Car> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDrive().getCountOfButter() != 0) {
				System.out.print("car" + i + " ~" + list.get(i));
				list.get(i).setRadius(list.get(i).getRadius() * 2);
				System.out.println("Стало->car" + i + " ~" + list.get(i));
			}

		}

	}

	public static void SetWeelsMetod5(Scanner a, List<Car> list) {
		int b = a.nextInt();
		int radius = a.nextInt();
		double speed = a.nextDouble();
		double time = a.nextDouble();
		int weight = a.nextInt();
		int height = a.nextInt();
		String color = a.next();
		int countOfButter = a.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRadius() < b) {
				Car car = new Car(new Helm(radius), new Wheel(TypeWeels.WINTER,
						speed, time), new Body(weight, height, color),
						new Drive(countOfButter, 0));
				System.out.print("car" + i + " ~" + list.get(i));
				list.set(i, car);
				System.out.println("Стало->car" + i + " ~" + list.get(i));
			}

		}
	}

	/*
	 * 1) Знайти машини, які використовують введений тип кузова.
	 * 
	 * 2) Видалити з ліста усі машини, які мають введений колір кузова.
	 * 
	 * 3) Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні
	 * шини на зимові.
	 * 
	 * 4) Видалити усі машини, які мають введений тип кузова та введений
	 * діапазон діаметра керма.
	 * 
	 * 5) Запам'ятати індекси машин, які мають введений тип кузова.
	 */
	public static void bodyType(Scanner a, List<Car> list) {
		String color = a.next();
	Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(color)) {
				System.out.println(car);
			}
		}
	}

	public static void bodyColorDelete(Scanner a, List<Car> list) {
		String color = a.next();
		ListIterator<Car> iter = list.listIterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(color)) {
				iter.remove();
			}
		}
	}

	public static void DiametrOfWeels(Scanner a, List<Car> list) {
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
		ListIterator<Car> iter = list.listIterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getDiametrDrive() <= max && car.getDiametrDrive() >= min) {
				car.setTypeWeels(typeWeels1);
			}
			System.out.println(list);
		}
	}

	public static void DdiametrAndBodyTypeDelete(Scanner a, List<Car> list) {
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
		String BodyType = a.next();
		ListIterator<Car> iter = list.listIterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getDiametrDrive() <= max && car.getDiametrDrive() >= min
					&& car.getColor().equals(BodyType)) {
				iter.remove();
			}
		}
		System.out.println(list);

	}

	public static void SaveBodyType(Scanner a, List<Car> list) {
		String BodyType = a.next();
		ListIterator<Car> iter = list.listIterator();
		List<Integer> list2 = new ArrayList<>();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(BodyType)) {
				list2.add(iter.nextIndex()-1);
			}
		}
	}
}
