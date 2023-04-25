package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }

}
