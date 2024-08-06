package com.incubyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCal {

    public int add(String numbersStr) {
        if (numbersStr == null || numbersStr.isEmpty()) {
            return 0;
        }

        String delimiter = ",\n";
        if (numbersStr.startsWith("//")) {
            int index = numbersStr.indexOf("\n");
            delimiter = numbersStr.substring(2, index);
            numbersStr = numbersStr.substring(index + 1);
        }

        String[] arrNumber = getNumbers(numbersStr, delimiter);
        int sum = 0;
        for (String numberStr : arrNumber) {
            try {
                sum += Integer.parseInt(numberStr.trim());
            } catch (NumberFormatException e) {
            }
        }

        return sum;
    }

    //    TODO: Explore if there is better way to do things
    public String[] getNumbers(String numbersStr, String delimiterStr) {
        String[] delimiters = delimiterStr.split("");
        List<String> list = new ArrayList<>();

        //Split by ',' or any other delimiter
        String[] arrNumber1 = numbersStr.split(delimiters[0]);
        if (delimiters.length == 2) {
            for (String numbersStr2 : arrNumber1) {
                //Split by '\n'
                String[] arrNumber2 = numbersStr2.split(delimiters[1]);
                list.addAll(new ArrayList<>(Arrays.asList(arrNumber2)));
            }
        } else {
            list = new ArrayList<>(new ArrayList<>(Arrays.asList(arrNumber1)));
        }

        return list.toArray(new String[0]);
    }
}
