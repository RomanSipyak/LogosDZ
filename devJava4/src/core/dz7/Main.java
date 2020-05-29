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
		List<Car> carList = new ArrayList<>();
		carList.add(new Car(new Helm(1),
				new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(1, 3)));
		carList.add(new Car(new Helm(2),
				new Wheel(TypeWeels.AUTUMN, 1.32, 3.25), new Body(1, 1, "red"),
				new Drive(1, 25)));
		carList.add(new Car(new Helm(3),
				new Wheel(TypeWeels.AUTUMN, 1.32, 3.25),
				new Body(1, 1, "blue"), new Drive(1, 15)));
		carList.add(new Car(new Helm(4),
				new Wheel(TypeWeels.SPRING, 1.32, 3.25), new Body(1, 1, "red"),
				new Drive(0, 15)));
		carList.add(new Car(new Helm(5),
				new Wheel(TypeWeels.SPRING, 1.32, 3.25),
				new Body(1, 1, "black"), new Drive(1, 100)));
		carList.add(new Car(new Helm(6),
				new Wheel(TypeWeels.SUMMER, 1.32, 3.25),
				new Body(1, 1, "green"), new Drive(0, 9)));
		carList.add(new Car(new Helm(7),
				new Wheel(TypeWeels.WINTER, 1.32, 3.25), new Body(1, 1, "red"),
				new Drive(0, 3)));
		carList.add(new Car(new Helm(1),
				new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "pinck"), new Drive(1, 12)));
		carList.add(new Car(new Helm(9),
				new Wheel(TypeWeels.WINTER, 1.32, 3.25),
				new Body(1, 1, "gray"), new Drive(0, 10)));
		carList.add(new Car(new Helm(10), new Wheel(TypeWeels.WINTER, 1.32,
				3.25), new Body(1, 1, "blue"), new Drive(1, 2)));
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
				diametrMetod1(sc, carList);
				break;

			case "2":
				RadiusColorMetod2(sc, carList);
				break;

			case "3":
				SetDriveMetod3(sc, carList);
				break;

			case "4":
				x2DiametrMetod4(carList);
				break;

			case "5":
				SetWeelsMetod5(sc, carList);
				break;
			case "6":
				bodyType(sc, carList);
				break;

			case "7":
				bodyColorDelete(sc, carList);
				break;

			case "8":
				DiametrOfWeels(sc, carList);
				break;

			case "9":
				DdiametrAndBodyTypeDelete(sc, carList);
				break;

			case "10":

				break;
			default:
				sc.close();
				return;
			}
		}

	}

	public static void diametrMetod1(Scanner scanner, List<Car> carList) {
		int radius = scanner.nextInt();
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getRadius() == radius)
				System.out.println("car" + i + " ~" + carList.get(i));
		}
	}

	public static void RadiusColorMetod2(Scanner scanner, List<Car> carList) {
		int radius = scanner.nextInt();
		String color = scanner.next();
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getRadius() == radius
					&& carList.get(i).getColor().equals(color)) {
				System.out.println("car" + i + " ~" + carList.get(i));
			}
		}
	}

	public static void SetDriveMetod3(Scanner scanner, List<Car> carList) {
		int countOfButtons = scanner.nextInt();
		int diametr = scanner.nextInt();
		Drive drive = new Drive(countOfButtons, diametr);
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getColor().equals("red")) {
				System.out.print("car" + i + " ~" + carList.get(i));
				carList.get(i).setDrive(drive);
				System.out.println("Стало->car" + i + " ~" + carList.get(i));
			}

		}
	}

	public static void x2DiametrMetod4(List<Car> carList) {
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getDrive().getCountOfButter() != 0) {
				System.out.print("car" + i + " ~" + carList.get(i));
				carList.get(i).setRadius(carList.get(i).getRadius() * 2);
				System.out.println("Стало->car" + i + " ~" + carList.get(i));
			}

		}

	}

	public static void SetWeelsMetod5(Scanner scanner, List<Car> carList) {
		int searchRadius = scanner.nextInt();
		int radius = scanner.nextInt();
		double speed = scanner.nextDouble();
		double time = scanner.nextDouble();
		int weight = scanner.nextInt();
		int height = scanner.nextInt();
		String color = scanner.next();
		int countOfButter = scanner.nextInt();
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getRadius() < searchRadius) {
				Car car = new Car(new Helm(radius), new Wheel(TypeWeels.WINTER,
						speed, time), new Body(weight, height, color),
						new Drive(countOfButter, 0));
				System.out.print("car" + i + " ~" + carList.get(i));
				carList.set(i, car);
				System.out.println("Стало->car" + i + " ~" + carList.get(i));
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
	public static void bodyType(Scanner scanner, List<Car> carList) {
		String color = scanner.next();
		Iterator<Car> iter = carList.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(color)) {
				System.out.println(car);
			}
		}
	}

	public static void bodyColorDelete(Scanner scanner, List<Car> carList) {
		String color = scanner.next();
		ListIterator<Car> iter = carList.listIterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(color)) {
				iter.remove();
			}
		}
	}

	public static void DiametrOfWeels(Scanner scanner, List<Car> carList) {
		int radius1 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		int max;
		int min;
		if (radius1 > radius2) {
			max = radius1;
			min = radius2;
		} else {
			max = radius2;
			min = radius1;
		}
		String typeWeels = scanner.next();
		TypeWeels typeWeels1 = TypeWeels.valueOf(typeWeels.toUpperCase());
		ListIterator<Car> iter = carList.listIterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getDiametrDrive() <= max && car.getDiametrDrive() >= min) {
				car.setTypeWeels(typeWeels1);
			}
			System.out.println(carList);
		}
	}

	public static void DdiametrAndBodyTypeDelete(Scanner scanner, List<Car> carList) {
		int radius1 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		int max;
		int min;
		if (radius1 > radius2) {
			max = radius1;
			min = radius2;
		} else {
			max = radius2;
			min = radius1;
		}
		String BodyType = scanner.next();
		ListIterator<Car> iter = carList.listIterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getDiametrDrive() <= max && car.getDiametrDrive() >= min
					&& car.getColor().equals(BodyType)) {
				iter.remove();
			}
		}
		System.out.println(carList);

	}

	public static void SaveBodyType(Scanner scanner, List<Car> carList) {
		String BodyType = scanner.next();
		ListIterator<Car> iter = carList.listIterator();
		List<Integer> list2 = new ArrayList<>();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(BodyType)) {
				list2.add(iter.nextIndex() - 1);
			}
		}
	}
}
