package by.sokhaeduard.firsthomework.console;

public class ForSecondTask {
	
	public void printResult(int year, int month, int day, boolean flag) {
		System.out.println("Days =" + day + " in month = " + month + " of " + year);
		if (flag) {
			System.out.println(year + " year is leap");
		} else {
			System.out.println(year + " year is not leap");
		}
	}

}
