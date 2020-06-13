package by.sokhaeduard.firsthomework.main;

import by.sokhaeduard.firsthomework.reader.ReadIn;
import by.sokhaeduard.firsthomework.service.NumberLogic;
import by.sokhaeduard.firsthomework.validator.NumberValidator;

public class FirstTaskMain {

	public static void main(String[] args) {
		ReadIn readIn = new ReadIn();
		NumberValidator numberValidator = new NumberValidator();

		int number = readIn.enter("¬ведите целое число");

		number = numberValidator.getValue(number);

		NumberLogic numberLogic = new NumberLogic();
		int lastDigit = numberLogic.getLastDigitOfNumber(number);

		System.out.println("Last digit of the square of the number " + number + " is " + lastDigit);

		readIn.scClose();
	}

}
