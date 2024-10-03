package Bai4;

import java.util.Scanner;

import static Bai2.Bai2.checkNumber;

public class Bai4 {
    public static void convertBinary(int n){
        int remainder;
        StringBuilder result = new StringBuilder();
        while (n > 0){
            remainder = n%2;
            n/=2;
            result.insert(0, remainder);
        }

        System.out.println("Result : " + result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());

        n= checkNumber(n);

        convertBinary(n);
    }
}
