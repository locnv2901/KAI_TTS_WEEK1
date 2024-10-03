package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
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

    public static String convertToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            if(n % 2 == 0) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getNumber(sc);
        System.out.print(n + " -> " + convertToBinary(n));
        sc.close();
    }
}
