package core.dz6;

import java.util.Scanner;

import core.less6.Season;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Group[] group = Group.values();
		while (true) {
			System.out.println("Enter 1 to show group by Fakultet");
			System.out.println("Enter 2 to show group by count of people");
			System.out.println("Enter 3 to set count of people for group");
			System.out.println("Enter 4 to the max count of people on fakultet");
			System.out.println("Enter 5 to the min count of people on fakultet");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter name of Fakultet");
				String nameOfFakultet = sc.next();
				for (int i = 0; i < group.length; i++) {
					if (group[i].getFakultet() == Fakultet
							.valueOf(nameOfFakultet.toUpperCase())) {
						System.out.println(group[i]);
					}
				}
				break;
			case "2":
				System.out.println("Enter count of people");
				int count = sc.nextInt();
				for (int i = 0; i < group.length; i++) {
					if (group[i].getCount() == count) {
						System.out.println(group[i]);
					}
				}
				break;
			case "3":
				System.out.println("Enter count of people");
				String nameOfGroup = sc.next();
				int count1 = sc.nextInt();
				for (int i = 0; i < group.length; i++) {
					if (group[i] == Group.valueOf(nameOfGroup.toUpperCase())) {
						group[i].setCount(count1);
					}
				}
				break;
			case "4":
				System.out.println("the max count of people on fakultet");
				String nameOfGroup1 = sc.next();
				int max = 0;
				int IndexMax = 0;
				for (int i = 0; i < group.length; i++) {
					if (group[i].getFakultet() == Fakultet.valueOf(nameOfGroup1
							.toUpperCase())) {
						if (max < group[i].getCount()) {
							max = group[i].getCount();
							IndexMax = i;
						}

					}

				}
				System.out.println(group[IndexMax]);
				break;
			case "5":
				System.out.println("the min count of people on fakultet");
				String nameOfGroup11 = sc.next();
				int min = 0;
				int IndexMin = 0;
				for (int i = 0; i < group.length; i++) {
					if (group[i].getFakultet() == Fakultet.valueOf(nameOfGroup11.toUpperCase())) {
						if (min > group[i].getCount()) {
							min = group[i].getCount();
							IndexMin = i;
						}

					}

				}
				System.out.println(group[IndexMin]);
				break;
			default:
				sc.close();
				return;
			}

		}

	}
}
