package by.sokhaeduard.firsthomework.service;

import java.util.GregorianCalendar;

public class TimeLogic {

	public int getDaysInMonth(int month, int year) {
		if (month == 2) {
			return 28;
		}
		if (month % 2 == 0) {
			return 30;
		} else {
			return 31;
		}
	}

	public boolean isLeapYear(int year) {
		return new GregorianCalendar().isLeapYear(year);
	}

	public int[] parseSecond(int totalSeconds) {

		int[] time = new int[3];
		time[0] = totalSeconds / 3600;
		time[1] = (totalSeconds - (time[0] * 3600)) / 60;
		time[2] = totalSeconds - ((time[0] * 3600) + (time[1] * 60));

		return time;
	}

}
