package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.console.ForSecondTask;
import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.TimeLogic;
import by.sokhaeduard.firsthomework.validator.TimeValidator;

public class SecondTask {
	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();
		TimeValidator timeValidator = new TimeValidator();

		int month = readIn.enter("Enter month");
		month = timeValidator.getValueMonth(month);

		int year = readIn.enter("Enter year");
		year = timeValidator.getValueYear(year);

		TimeLogic timeLogic = new TimeLogic();
		int day = 0;

		day = timeLogic.getDaysInMonth(month, year);
		boolean isLeap = timeLogic.isLeapYear(year);

		ForSecondTask forSecondTask = new ForSecondTask();
		forSecondTask.printResult(year, month, day, isLeap);

		readIn.scClose();
	}

}
