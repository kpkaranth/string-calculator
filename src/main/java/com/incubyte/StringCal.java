package com.incubyte;

public class StringCal {

    public int add(String numbersStr) {
        if (numbersStr == null || numbersStr.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        String[] arrNumber = numbersStr.split(delimiter);
        int sum = 0;

        for (String numberStr : arrNumber) {
            try {
                sum +=  Integer.parseInt(numberStr.trim());
            } catch (NumberFormatException e) {
            }
        }

       return sum;
    }
}
