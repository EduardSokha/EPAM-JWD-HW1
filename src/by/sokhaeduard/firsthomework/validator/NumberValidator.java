package by.sokhaeduard.firsthomework.validator;

import by.sokhaeduard.firsthomework.reader.ReadIn;

public class NumberValidator {
	public boolean isPositiveValue(int value) {
		return value > 0;
	}

	public int getValue(int number) {
		ReadIn readIn = new ReadIn();
		if (!isPositiveValue(number)) {
			while (!isPositiveValue(number)) {
				number = readIn.enter("Число должно быть больше нуля, введите число");
			}
		}
		return number;
	}
}
