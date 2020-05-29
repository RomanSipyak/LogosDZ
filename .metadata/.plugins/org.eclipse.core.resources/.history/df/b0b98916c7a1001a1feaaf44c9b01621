package core.dz802;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
//Реалізовуємо програму з консольним меню. Використати Scanner. Створити клас Commodity.Описати даний клас трьома - чотирма полями. Створити функціональний клас, в якому описати наступні методи для роботи з лістом об'єктів:
//
//1. Додати товар в ліст.
//
//2. Видалити товар з ліста (вказати або всі необіхідні параметри, або по якомусь критерію).
//
//3. Замінити товар в лісті.
//
//4. Посортувати по всьому (при натисканні повинне випасти меню, яке запропонує по якому полю посортувати. Після вибору поля обрати напрям сортування). Створити усі необхідні компаратори.
//
//0. Вихід з програми.

public class Controller {
	private static final Scanner sc = new Scanner(System.in);
	private final List<Commodity> Commodities = new ArrayList<>();

	public Controller() {
		Commodities.add(new Commodity("Fork", 1, 5, 9, 13));
		Commodities.add(new Commodity("Spoon", 2, 6, 10, 14));
		Commodities.add(new Commodity("Late", 3, 7, 11, 15));
		Commodities.add(new Commodity("Botlle", 4, 8, 12, 16));

	}

	public List<Commodity> AddYourCommodity() {
		String name = sc.next();
		double prise = sc.nextDouble();
		double weight = sc.nextDouble();
		int height = sc.nextInt();
		int width = sc.nextInt();
		List<Commodity> list = new ArrayList<>();
		for (Commodity commodity : Commodities) {
			list.add(commodity);
		}
		list.add(new Commodity(name, prise, weight, height, width));
		return list;

	}

	public List<Commodity> DeleteByPoints() {
		System.out.println("po all");
		System.out.println("po name");
		System.out.println("po prise");
		System.out.println("po weight");
		System.out.println("po height");
		System.out.println("po width");
		String a = sc.next();
		switch (a) {
		case "1":
			String name = sc.next();
			double prise = sc.nextDouble();
			double weight = sc.nextDouble();
			int height = sc.nextInt();
			int width = sc.nextInt();
			return Commodities.stream()
					.filter(commodity -> !(commodity.getName().equals(name)))
					.filter(commodity -> commodity.getPrise() != prise)
					.filter(commodity -> commodity.getWeight() != weight)
					.filter(commodity -> commodity.getHeight() != height)
					.filter(commodity -> commodity.getWidth() != width)
					.collect(toList());
		case "2":
			String name1 = sc.next();
			return Commodities.stream()
					.filter(commodity -> !(commodity.getName().equals(name1)))
					.collect(toList());

		case "3":

			double prise1 = sc.nextDouble();
			return Commodities.stream()
					.filter(commodity -> commodity.getPrise() != prise1)
					.collect(toList());

		case "4":
			double weight1 = sc.nextDouble();
			return Commodities.stream()
					.filter(commodity -> commodity.getWeight() != weight1)
					.collect(toList());
		case "5":
			double height1 = sc.nextDouble();
			return Commodities.stream()
					.filter(commodity -> commodity.getHeight() != height1)
					.collect(toList());

		case "6":
			int width1 = sc.nextInt();
			return Commodities.stream()
					.filter(commodity -> commodity.getWidth() != width1)
					.collect(toList());

		default:
			return Commodities;
		}

	}

	public List<Commodity> ReplaseCommody(Commodity c) {
		System.out.println("Enter position");
		int position = sc.nextInt();
		List<Commodity> list = new ArrayList<>();
		for (Commodity com : Commodities) {
				list.add(com);
			}
		for (Commodity com : Commodities) {
			if (Commodities.indexOf(com) == position) {
				list.set(position, c);
			}
		}

		return list;

	}

	public Stream<Commodity> Sorted() {
		System.out.println("Asc or Desc");
		String a = sc.next();
		switch (a) {
		case "Asc":
			System.out.println("1-po all");
			System.out.println("2-po name");
			System.out.println("3-po prise");
			System.out.println("4-po weight");
			System.out.println("5-po height");
			System.out.println("6-po width");
			String b = sc.next();
			switch (b) {
			case "1":

				return Commodities.stream().sorted(
						comparing(Commodity::getName)
						.thenComparing(comparingDouble(Commodity::getPrise))
						.thenComparing(comparingDouble(Commodity::getWeight))
						.thenComparing(comparingInt(Commodity::getHeight))
						.thenComparing(comparingInt(Commodity::getWidth)));
			case "2":

				return Commodities.stream().sorted(comparing(Commodity::getName));
			case "3":

				return Commodities.stream().sorted(comparingDouble(Commodity::getPrise));
			case "4":

				return Commodities.stream().sorted(comparingDouble(Commodity::getWeight));
			case "5":

				return Commodities.stream().sorted(comparing(Commodity::getHeight));
			case "6":
				
				return Commodities.stream().sorted(comparing(Commodity::getWidth));

			default:
				return Commodities.stream();
			}
		case "Desc":
			System.out.println("1-po all");
			System.out.println("2-po name");
			System.out.println("3-po prise");
			System.out.println("4-po weight");
			System.out.println("5-po height");
			System.out.println("6-po width");
			String c = sc.next();
			switch (c) {
			case "1":

				return Commodities.stream().sorted(
						comparing(Commodity::getName)
						.thenComparing(comparingDouble(Commodity::getPrise).reversed())
						.thenComparing(comparingDouble(Commodity::getWeight).reversed())
						.thenComparing(comparingInt(Commodity::getHeight).reversed())
						.thenComparing(comparingInt(Commodity::getWidth).reversed()));
			case "2":

				return Commodities.stream().sorted(comparing(Commodity::getName).reversed());
			case "3":

				return Commodities.stream().sorted(comparingDouble(Commodity::getPrise).reversed());
			case "4":

				return Commodities.stream().sorted(comparingDouble(Commodity::getWeight).reversed());
			case "5":

				return Commodities.stream().sorted(comparing(Commodity::getHeight).reversed());
			case "6":
				
				return Commodities.stream().sorted(comparing(Commodity::getWidth).reversed());

			default:
				return Commodities.stream();
			}
		default:
			return Commodities.stream();
		}
	}
}
