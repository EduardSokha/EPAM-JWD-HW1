package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.FigureLogic;

public class NinthTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();

		int radius = readIn.enter("enter radius");

		FigureLogic figure = new FigureLogic();
		figure.getAreaForCircle(radius);

		readIn.scClose();
	}

}
