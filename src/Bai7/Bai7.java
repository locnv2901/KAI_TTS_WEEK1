package Bai7;

import java.util.Scanner;

public class Bai7 {
    public static void distributeMoney(int totalAmount) {
        int count = 1;
        for (int num1000 = 0; num1000 <= totalAmount / 1000; num1000++) {
            for (int num2000 = 0; num2000 <= (totalAmount - num1000 * 1000) / 2000; num2000++) {
                int remainingAmount = totalAmount - num1000 * 1000 - num2000 * 2000;
                if (remainingAmount % 5000 == 0) {
                    int num5000 = remainingAmount / 5000;
                    System.out.println("PA " + count + " ( " + num1000 + " * 1000; " + num2000 + " * 2000; " + num5000 + " * 5000 )");
                    count++;
                }
            }
        }
    }

    public static int getNumber(Scanner sc) {
        int number;
        while(true) {
            System.out.print("Enter Number: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number <= 0) {
                    System.out.println("Invalid Number");
                } else {
                    return number;
                }
            } else {
                System.out.println("Invalid Number");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = getNumber(sc);
        distributeMoney(totalAmount);
        sc.close();
    }
}
