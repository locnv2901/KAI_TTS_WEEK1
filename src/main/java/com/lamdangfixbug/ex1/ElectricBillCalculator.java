package com.lamdangfixbug.ex1;

import com.lamdangfixbug.utils.Utils;

public class ElectricBillCalculator {
    public static void main(String[] args) {
        getElectricNumberAndPrintBillValue();
    }

    static int calculateBill(int num) {
        if (num > 100) return 50 * 1000 + 50 * 1200 + (num % 100) * 1500;
        if (num > 50) return 50 * 1000 + (num % 50) * 1200;
        return num * 1000;
    }

    public static void getElectricNumberAndPrintBillValue() {
        int num = -1;
        do {
            try {
                num = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter electric number: "));
                if (num < 0) {
                    System.out.println("Invalid number! Please type a number greater or equal to 0.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please type a number!");
            }
        } while (num < 0);
        System.out.printf("Your bill value is: %d VND\n", calculateBill(num));
    }
}
