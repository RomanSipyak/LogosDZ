package dz3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		met20();
		met2();
	}

	static void met1() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b)
			System.out.println(a);
	}

	static void met2() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= a && b >= c) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}

	static void met3() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		if (x == 0 && y == 0) {
			System.out.println("no-ch");
		} else if (x > 0 && y > 0) {
			System.out.println("1-ch");
		} else if (x < 0 && y < 0) {
			System.out.println("3-ch");
		} else if (x < 0 && y > 0) {
			System.out.println("2-ch");
		} else {
			System.out.println("4-ch");
		}

	}

	static void met4() {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		if (s1.equals(s2)) {
			System.out.println(s1 + "=" + s2);
		} else {
			System.out.println(s1 + "!=" + s2);
		}
	}

	static void met5() {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		if (s1.length() == s2.length()) {
			System.out.println("s1.length=s2.length");
		} else {
			System.out.println("s1.length!=s2.length");

		}
	}

	static void met6() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a < c + b && b < c + a && c < a + b) {
			System.out.println("трикутник існує");
		} else {
			System.out.println("не існує");
		}
	}

	static void met7() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
			System.out.println("високосний");
		} else {
			System.out.println("Не високосний");
		}
	}

	static void met8() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a == b && b == c) {
			System.out.println(a + " " + b + " " + c);
		} else if (a == b) {
			System.out.println(a + " " + b);
		} else if (a == c) {
			System.out.println(a + " " + c);
		}
		if (b == c) {
			System.out.println(b + " " + c);
		} else {
			System.out.println("Нема рівних чисел");
		}
	}

	static int met9() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		return a + b * c;
	}

	static void met20() {
		boolean isExit = false;
		while (!isExit) {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			if (isExit == s.equals("exit")) {
				break;
			} else {
				switch (s) {
				case "1":
					met1();
					break;
				case "2":
					met2();
					break;
				case "3":
					met3();
					break;
				case "4":
					met4();
					break;
				case "5":
					met5();
					break;
				case "6":
					met6();
					break;
				case "7":
					met7();
					break;
				case "8":
					met8();
					break;
				case "9":
					met9();
					break;
				case "10":
					met11();
					break;
				case "11":
					met12();
					break;
				case "12":
					met13();
					break;
				case "13":
					met14();
					break;
				case "14":
					met15();
					break;
				case "15":
					met16();
					break;
				default:
					break;
				}
			}
		}
	}

	static int met11() {
		return 0;

	}

	static void met12() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = 0;
		if (a > 0) {
			n += 1;
		}
		if (b > 0) {
			n += 1;
		}
		if (c > 0) {
			n += 1;
		}
		System.out.println("позитивних чисел" + n);
	}

	static void met13() {
		int n = 0;
		int a = 0;
		do {
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();

			if (a > 0) {
				n += 1;
			}
		} while (a != 0);
		System.out.println("позитивних чисел" + n);
	}

	static void met14() {
		int n = 0;
		int a = 0;
		do {
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();

			if (a < 0) {
				n += 1;
			}
		} while (a != 0);
		System.out.println("позитивних чисел" + n);
	}

	static void met15() {
		int m = 0;
		int b = 0;
		int a = 0;
		do {
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();

			if (a < 0) {
				m += 1;
			}else if(a<0){
				b+=1;
			}
		} while (a != 0);
		System.out.println("позитивних чисел" +m+" "+"кількість негативних"+b);
	}

	static int met16() {
		return 0; 
	}

}
