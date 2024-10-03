package Bai3;

import java.util.Scanner;

import static Bai2.Bai2.checkNumber;

public class Bai3 {
    static Scanner scanner = new Scanner(System.in);
    public static void reserveNumber(int n){
        StringBuilder result = new StringBuilder();
        int temp;

        while (n > 0){
            temp = n % 10;
            result.append(temp);
            n /= 10;
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Enter a:");
        int a = Integer.parseInt(scanner.nextLine());
        a= checkNumber(a);
        reserveNumber(a);
    }
}
