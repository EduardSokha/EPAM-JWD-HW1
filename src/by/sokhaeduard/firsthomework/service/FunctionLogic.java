package by.sokhaeduard.firsthomework.service;

public class FunctionLogic {

	public void getFunctionValue(int x) {
		double f;
		if (x >= 3) {
			f = (-x) * (-x) + 3 * (-x) + 9;
			System.out.println(" f = (-x)*(-x)+3*(-x)+9 = " + f);
		} else if (x < 3) {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println(" f = 1 / (Math.pow(x, 3) - 6) = " + f);
		}
	}

	public void getValuesForFuntion(double a, double b, double h) {
		double y = 0;

		System.out.println("+---------------+---------------+");

		for (double i = a; i <= b; i += h) {
			y = Math.tan(i);
			System.out.printf("%s %12.3f %s %+12.5f %s %n", "|", i, " | ", y, "|");
			System.out.println("+---------------+---------------+");
		}
	}

}
