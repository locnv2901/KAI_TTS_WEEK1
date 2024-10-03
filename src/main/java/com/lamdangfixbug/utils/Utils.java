package com.lamdangfixbug.utils;

import java.util.Scanner;

public class Utils {
    public static final Scanner scanner = new Scanner(System.in);

    public static String repeatInputWhenInvalid(String label) {
        String input = null;
        while (input == null || input.isBlank()) {
            System.out.print(label);
            input = scanner.nextLine();
        }
        return input;
    }
}
