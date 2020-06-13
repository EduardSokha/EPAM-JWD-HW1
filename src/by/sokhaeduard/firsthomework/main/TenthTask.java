package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.FunctionLogic;

public class TenthTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();

		int a = readIn.enter("enter a");
		int b = readIn.enter("enter b");
		int h = readIn.enter("enter h");

		FunctionLogic function = new FunctionLogic();

		function.getValuesForFuntion(a, b, h);

		readIn.scClose();
	}

}
