package core.less.dz3;

public class MyMath {
	private static final double p = 3.14;
	private static final double g = 9.8;
	public final static double PI = 3.141592653;
	public final static double E = 2.718281828;

	public static double ploshch(double a) {
		return a = a * p;
	}

	public static double sqr(final double a) {
		return a * a;
	}

	public static double P(final double a) {
		return a * g;
	}

	public static double stepin(final double a, final int b) {
		if (b == 0)
			return 1;
		return stepin(a, b - 1) * a;
	}

	public static long pow(int a, int b) {
		if (b < 1) {
			if (b == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		long res = a;
		for (int i = 1; i < b; i++) {
			res *= a;
		}
		return res;
	}

	public static double abs(double a) {
		return a > 0 ? a : a * -1;
	}
}
