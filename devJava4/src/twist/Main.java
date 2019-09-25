package twist;

public class Main {

	public static void main(String[] args) {
		print(twist(5));

	}
	
 public static int[][] twist(int par){
	 int[][] a = new int[par][par];
	 for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			a[i][j] = 1;
		}
	}
	 return a;
 }
 
 public static void print(int[][] a){
	 for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
 }
}
