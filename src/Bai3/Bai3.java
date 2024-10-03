package Bai3;

import java.util.Scanner;

public class Bai3 {
    public static int getNumber(Scanner sc) {
        int number;
        while(true) {
            System.out.print("Enter Number: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                return number;
            } else {
                System.out.println("Invalid Number");
                sc.next();
            }
        }
    }

    public static int reverse(int n) {
        char[] a = String.valueOf(n).toCharArray();
        int left, right = a.length - 1;
        if("-".equals(String.valueOf(a[0]))) {
            left = 1;
        } else {
            left = 0;
        }
        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return Integer.parseInt(String.valueOf(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getNumber(sc);
        System.out.println("Old number: " + n);
        System.out.println("Reversed number: " + reverse(n));
        sc.close();
    }
}
