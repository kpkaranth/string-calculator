package com.incubyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCal {

    public int add(String numbersStr) {
        if (numbersStr == null || numbersStr.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";
        if (numbersStr.startsWith("//")) {
            int index = numbersStr.indexOf("\n");
            delimiter = numbersStr.substring(2, index) + "|\n";
            numbersStr = numbersStr.substring(index + 1);
        }

        String[] arrNumber = numbersStr.split(delimiter);
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();
        for (String numberStr : arrNumber) {
            try {
                int number = Integer.parseInt(numberStr.trim());
                if (number < 0) {
                    negativeNumbers.add(number);
                } else {
                    sum += number;
                }
            } catch (NumberFormatException e) {
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IncubyteException("negative numbers not allowed :" + negativeNumbers);
        }

        return sum;
    }
}
