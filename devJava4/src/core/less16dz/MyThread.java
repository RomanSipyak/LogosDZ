package core.less16dz;

import java.util.Scanner;

public class MyThread extends Thread {

	public MyThread() {
		start();
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if (m == 0) {
			return;
		}
		int a = 1;
		int b = 1;
		int sum_fib = 0;
		for (int i = 0; i < m; i++) {
			if (i == 0 || i == 1) {
				System.out.print(" 1 ");
			} else {
				sum_fib = a + b;
				a = b;
				b = sum_fib;
				System.out.print(sum_fib + " ");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
