package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = number % 10 * 100;
        number /= 10;
        reversedNumber += number % 10 * 10;
        reversedNumber += number / 10;
        System.out.println(reversedNumber);
    }
}
