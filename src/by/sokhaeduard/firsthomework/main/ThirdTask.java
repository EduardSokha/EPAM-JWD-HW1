package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.FigureLogic;

public class ThirdTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();

		double area = readIn.enter("enter area");

		FigureLogic figureLogic = new FigureLogic();

		double describedSide = figureLogic.getSquareForSide(area);

		double radius = figureLogic.getRadiusInscribedCircle(describedSide);

		double inscribedSide = figureLogic.getInscribedSquareCircle(radius);

		System.out.println("Area of square = " + figureLogic.getArea(inscribedSide));
		System.out.println(
				"Area described / area inscribed = " + figureLogic.getSquareScale(describedSide, inscribedSide));

		readIn.scClose();
	}

}
