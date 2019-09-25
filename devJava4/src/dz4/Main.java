package dz4;

public class Main {

	public static void main(String[] args) {
		met10();
	}

	static void met1() {
		int[] array = new int[10];
		int a = 2;
		for (int i = 0; i < array.length; i++) {
			array[i] = a;
			a += 2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void met2() {
		int[] array = new int[50];
		int a = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = a;
			a += 2;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println("a" + i + "=" + array[i]);
		}
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}

	static void met3() {
		int[] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(0, 9);
		}
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("a" + i + "=" + array[i]);
			if (array[i] % 2 == 0) {
				a++;
			}

		}
		System.out.println("parni=" + a);
	}

	static void met4() {
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(1, 10);
			System.out.print("a" + i + "=" + array[i]);
			if ((i + 1) % 2 != 0) {
				array[i] = 0;
			}
		}
		System.out.println();
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}
	}

	static void met5() {
		int[] array = new int[5];
		int[] array1 = new int[5];
		int a = 0;
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = random(0, 5);
			array1[i] = random(0, 5);
			if (i != array.length - 1) {
				a += array[i];
				b += array1[i];
			} else {
				a = (a + array[i]) / array.length;
				b = (b + array1[i]) / array.length;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		if (a == b) {
			System.out.println("rivni");
		} else {
			if (a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}

	static void met6() {
		int array[] = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(10, 99);
			System.out.println(array[i]);
		}
		for (int i = 0, n = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				n++;
			}

			if (n == array.length - 1) {
				System.out.println("yes");
				System.out.println(n);
			} else {
				System.out.println("no");
			}

		}

	}

	static void met7() {
		int[] array = new int[20];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("a" + i + "=" + array[i]);
		}
	}

	static void met8() {
		int[] array = new int[12];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(-15, 15);
			System.out.println(array[i]);
		}
		int max = array[0];
		int maxindex = 0;
		for (int i = 0; i < array.length; i++) {
			if (max <= array[i]) {
				max = array[i];
				maxindex = i;
			}
		}
		System.out.println(max + " " + maxindex);
	}

	static void met9() {
		/*
		 * ������� ��� ������ � 10 ����� ���������� ����� � ������ [1; 9] �
		 * ����� ����� � 10 ������ �����. ����� ������� � i-�� ��������
		 * �������� ������ ������� ���������� ��������� �������� � �������
		 * ������ � i-�� �������� �� �������� � ������� ������ � i-�� ��������.
		 * ������� �� ��� ������ �� ����� (����� �� �������� �����), ����
		 * ������� ������� ����� �������� � �������� �����.
		 */
		int[] array = new int[10];
		int[] array1 = new int[10];
		double[] array2 = new double[10];
		for (int i = 0; i < array2.length; i++) {
			array[i] = random(1, 9);
			array1[i] = random(1, 9);
			array2[i] = (double) array[i] / (double) array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		int n = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 1 == 0)
				n++;
		}
		System.out.println(n);
	}

	static void met10() {
		/*
		 * ������� ����� � 11 ���������� ����� ����� � ������ [-1; 1],
		 * ������� ����� �� ����� � �����. �������� ���� ������� �����������
		 * � ����� ��������� � ������� ��� �� ����������� �� �����. ���� ���
		 * ������� �������� ������������ �������� ������� ����, �� ��
		 * �������� ������.
		 */
		int[] array = new int[11];
		int[] array1 = new int[11];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(-1, 1);
			array1[i] = 20;
		}
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		for (int i = 0; i < array.length; i++) {
			int k=0;
			for (int j = 0; j < array1.length; j++) {
				if(array[i]==array1[j]){
					k++;
				}
			}
			if(k==0){
				array1[n]=array[i];
			n++;}
		}
		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		int[] array2=new int[11];
		
		for (int i = 0; i < array2.length; i++) {
			int m=0;
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array[j]){
					m++;
				}
			}
			array2[i]=m;
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}int max=0;
		int index=0;
		for (int i = 0; i < array2.length; i++) {
			if(max<array2[i]){
				max=array2[i];
				index=i;
			}
		}int count=0;
		for (int i = 0; i < array2.length; i++) {
			if(max==array2[i]){
				count++;
			}
		}
		if(count==1){
			System.out.println(array1[index]+" �����������="+max);
		}else{
			System.out.println("����");
		}
		

	}

}
