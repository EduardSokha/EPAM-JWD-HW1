package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.console.ForSeventhTask;
import by.sokhaeduard.firsthomework.entity.Point;
import by.sokhaeduard.firsthomework.service.DotLogic;

public class SeventhTask {
	public static void main(String[] args) {

		Point point1 = new Point(6, 4);
		Point point2 = new Point(8, -5);
		ForSeventhTask forSeventhTask = new ForSeventhTask();

		DotLogic dotServ = new DotLogic();
		int index = dotServ.defineDistance(point1, point2);
		System.out.println(index);

		forSeventhTask.printClosestPoint(point1, point2, index);
	}
}
