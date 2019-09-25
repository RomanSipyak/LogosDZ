package Hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("hello world");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("ROk");
		}
	}
}
