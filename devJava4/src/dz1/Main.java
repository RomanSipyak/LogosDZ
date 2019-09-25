package dz1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("enter k");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if (k == 0) {
			System.out.println("ni parne ni neparne");
		} else {
			if (k % 2 == 0) {
				System.out.println("k-parne");
			} else {
				System.out.println("k-neparne");
			}
		}
		System.out.println("enter m");
		float m = sc.nextFloat();
		System.out.println("enter n");
		float n = sc.nextFloat();
		if (m == n) {
			System.out.println("similar");
		} else {
			if (m - 10 < 0) {
				m = (m - 10) * (-1);
			} else {
				m = m - 10;
			}
			if (n - 10 < 0) {
				n = (n - 10) * -1;
			} else {
				n = n - 10;
			}
			if (m > n) {
				System.out.println("near n");
			} else {
				System.out.println("near m");
			}
		}
	}
}
