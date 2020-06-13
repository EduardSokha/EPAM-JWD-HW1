package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.NumberLogic;

public class FourthTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();

		char[] chars = new char[] { 'A', 'B', 'C', 'D' };
		int[] array = new int[4];

		for (int i = 0; i < array.length; i++) {
			array[i] = readIn.enter("enter " + chars[i]);
		}

		boolean flag = new NumberLogic().checkEven(array);

		System.out.println(flag);

		readIn.scClose();
	}

}
