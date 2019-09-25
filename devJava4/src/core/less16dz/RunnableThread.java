package core.less16dz;

import java.util.Scanner;

public class RunnableThread implements Runnable{

	public RunnableThread() {
		start();
	}

	private void start() {
		run();
		
	}

	@Override
	public void run() {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
		int[]array  = new int[m];
		if (m == 0) {
			return;
		}
		int a = 1;
		int b = 1;
		int sum_fib=0;
		for (int i = 0; i < m; i++) {
			if(i==0||i==1){
				array[array.length-1-i]=1;
			}else{
				sum_fib = a + b;
				a = b;
				b = sum_fib;
			array[array.length-1-i]=sum_fib; }}
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j]+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	
}

