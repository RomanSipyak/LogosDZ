package dz2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a;
		do {
			System.out.println("enter number");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			metod9(a);
		} while (a < 8 && a > 0);
		return ;
	}

	static int metod1() {
		int i = 1000;
		while (i <= 1015) {
			System.out.println(i);
			i = i + 3;
		}
		return 0;
	}

	static int metod2() {
		int j = 1;
		for (int i = 0; i < 55; i++) {
			System.out.println("a" + (i + 1) + "=" + j);
			j = j + 2;
		}
		return 0;
	}

	static int metod3() {
		for (int i = 90; i >= 0; i = i - 5) {
			System.out.println(i);
		}
		return 0;
	}

	static int metod4() {
		int j = 2;
		for (int i = 0; i < 20; i++) {
			System.out.println("a" + (i + 1) + "=" + j);
			j = j * 2;
		}
		return 0;
	}

	static int metod5() {
		int a = 2;
		int m = 2 * a - 1;
		while (m < 10000) {
			System.out.println(m);
			a++;
			m = 2 * a - 1;
		}
		return 0;

	}

	static int metod6() {
		int a = -166;
		int m = 2 * a + 200;
		while (m <= -100) {
			a++;
			m = 2 * a + 200;
		}
		while (m < 100 && m > -100) {
			if ((m < 100 && m >= 10) || (m > -100 && m <= -10)) {
				System.out.println(m);
			}
			a++;
			m = 2 * a + 200;
		}
		return 0;

	}

	static int metod7(int a) {
		int n = 1;
		if (a == 0) {
			System.out.println("1");
			return 0;
		} else {
			for (; a >= 1; a--) {
				n = n * (a);
			}
			System.out.println(n);
		}
		return 0;
	}

	static int metod8(int a) {
		int i = 1;
		while (i <= a) {
			if (a % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		return 0;
	}

	static int metod9(int a) {
		Scanner sc = new Scanner(System.in);
		switch (a) {
		case 1:
			metod1();
			return 0;
		case 2:
			metod2();
			return 0;
		case 3:
			metod3();
			return 0;
		case 4:
			metod4();
			return 0;
		case 5:
			metod5();
			return 0;
		case 6:
			metod6();
			return 0;
		case 7:
			int b = sc.nextInt();
			metod7(b);
			return 0;
		case 8:
			int c = sc.nextInt();
			metod8(c);
			return 0;

		default:
			return 0;
		}
	}

}
