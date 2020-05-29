package core.dz802;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Controller2 controller = new Controller2();
		while (true) {
			System.out.println("1 AddYourCommodity");
			System.out.println("2 DeleteByPoints");
			System.out.println("3 ReplaseCommody");
			System.out.println("4 Sorted");
			Commodity c = new Commodity("Fork", 1, 5, 9, 13);
			Commodity b = new Commodity("Fork", 1, 6, 9, 13);
			Scanner k = new Scanner(System.in);
			String a = k.next();
			switch (a) {
			case "1":
				controller.AddYourCommodity().forEach(System.out::println);
				break;
			case "2":
				controller.DeleteByPoints().forEach(System.out::println);
				break;
			case "3":
				controller.ReplaseCommody(c).forEach(System.out::println);
				break;
			case "4":
				controller.Sorted().forEach(System.out::println);
				break;
			case "5":
				Controller2.getCommodities().forEach(System.out::println);
				break;
			default:
				k.close();

			}
		}
	}

}
