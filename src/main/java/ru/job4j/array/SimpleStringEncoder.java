package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i) && input.length() - 1 != i) {
                result += symbol;
                if (counter > 1) {
                    result += counter;
                }
                symbol = input.charAt(i);
                counter = 1;
            } else if (input.length() - 1 == i) {
                if (symbol == input.charAt(i)) {
                    result += input.charAt(input.length() - 1);
                    result += counter + 1;
                } else {
                    result += symbol;
                    if (counter > 1) {
                        result += counter;
                    }
                    result += input.charAt(input.length() - 1);
                }
            } else {
                counter++;
            }
        }
        return result;
    }
}