package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.FunctionLogic;

public class EighthTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();
		int number = readIn.enter("enter x");

		FunctionLogic function = new FunctionLogic();
		function.getFunctionValue(number);

		readIn.scClose();
	}

}
