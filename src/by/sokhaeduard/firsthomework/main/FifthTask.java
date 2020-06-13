package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.console.ForIdealNumber;
import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.NumberLogic;

public class FifthTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();

		int number = readIn.enter("enter number");

		boolean flag = new NumberLogic().getIdealNumber(number);

		ForIdealNumber forIdealNumber = new ForIdealNumber();
		forIdealNumber.printResult(flag);

		readIn.scClose();
	}

}
