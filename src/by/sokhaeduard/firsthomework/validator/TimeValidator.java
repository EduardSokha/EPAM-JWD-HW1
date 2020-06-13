package by.sokhaeduard.firsthomework.validator;

import by.sokhaeduard.firsthomework.reader.ReadIn;

public class TimeValidator {
    public boolean validateYear(int year) {
        return (year > 0);
    }

    public boolean validateMonth(int month) {
        return (month > 0 && month < 13);
    }
    
    public int getValueMonth(int month) {
		ReadIn readIn = new ReadIn();
		if (!validateMonth(month)) {
			while (!validateMonth(month)) {
				month = readIn.enter("month must be less than 13 and greater than zero, enter month");
			}
		}
		return month;
	}
    
    public int getValueYear(int year) {
		ReadIn readIn = new ReadIn();
		if (!validateYear(year)) {
			while (!validateYear(year)) {
				year = readIn.enter("month must be greater than zero, enter year");
			}
		}
		return year;
	}
    
}
