package by.sokhaeduard.firsthomework.service;

import java.util.ArrayList;
import java.util.List;

public class NumberLogic {

    public int getLastDigitOfNumber(int number) {
        int lastDigit = lastDigit(number);
        return lastDigit((int) Math.pow(lastDigit, 2));
    }

    private int lastDigit(int number) {
        return number % 10;
    }

    public boolean checkEven(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count > 1;
    }

    public boolean getIdealNumber(int number) {
        int sum = 0;
        List<Integer> dividers = getParse(number);
        for (Integer i : dividers) {
            sum += i;
        }
        return (sum == number);
    }

    private List<Integer> getParse(int number) {
        List<Integer> dividers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                dividers.add(i);
            }
        }
        return dividers;
    }
    
}
