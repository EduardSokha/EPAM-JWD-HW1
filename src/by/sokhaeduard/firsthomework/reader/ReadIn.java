package by.sokhaeduard.firsthomework.reader;

import java.util.Scanner;

public class ReadIn {
	Scanner sc = new Scanner(System.in);

	public int enter(String message) {
		int number;
		System.out.println(message);

		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("not int");
			System.out.println("enter int");
		}
		number = sc.nextInt();

		return number;
	}

	public void scClose() {
		sc.close();
	}

}
