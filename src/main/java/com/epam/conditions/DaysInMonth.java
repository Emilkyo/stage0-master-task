package com.epam.conditions;

public class DaysInMonth {
    private static int year;
    private static int month;

    private boolean isValidDate() {
        if (year < 0) return false;
        return month >= 1 && month <= 12;
    }

    private int daysInMonth() {
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return 29;  // leap year
            else {
                return 28;  // not a leap year
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;  // month with 30 days
        } else {
            return 31;  // month with 31 days
        }
    }

    public void printDays(int year, int month) {
        this.year = year;
        this.month = month;
        if (isValidDate()) {
            System.out.println(daysInMonth());
        } else
            System.out.println("invalid date");
    }
}
