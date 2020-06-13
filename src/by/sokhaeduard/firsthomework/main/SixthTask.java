package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.TimeLogic;

public class SixthTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();
		int totalSeconds = readIn.enter("enter seconds");

		int[] time = new TimeLogic().parseSecond(totalSeconds);

		System.out.println("Hours = " + time[0] + ", minutes = " + time[1] + ", seconds = " + time[2]);

		readIn.scClose();
	}

}
