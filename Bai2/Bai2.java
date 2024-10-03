package Bai2;

import java.util.Scanner;

public class Bai2 {
    static Scanner scanner = new Scanner(System.in);
    public static int checkNumber(int n){
        try {
            if (n < 0 ){
                System.err.println("Invalid number!!");
                System.out.println("Re-Enter : ");
                return Integer.parseInt(scanner.nextLine());

            }
        }catch (NumberFormatException e){
            System.err.println("Invalid number!!");
            System.out.println("Re-Enter : ");
            return Integer.parseInt(scanner.nextLine());
        }
        return n;
    }

    public static void checkTriangle(int a, int b, int c){
        if (a +b > c && a + c > b && b + c > a && (a > 0) && (b > 0) && (c > 0)){
            if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a){
                System.out.println("This is Right triangle.");
            } else if (a==b && b==c) {
                System.out.println("This is Equilateral triangle.");
            } else if (a == b || b==c|| c==a) {
                System.out.println("This is Isosceles triangle.");
            } else {
                System.out.println("This is Acute triangle.");
            }

        }else {
            System.out.println("3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a : ");
        int a = Integer.parseInt(scanner.nextLine());
        a = checkNumber(a);

        System.out.println("Enter b: ");
        int b= Integer.parseInt(scanner.nextLine());
        b= checkNumber(b);

        System.out.println("Enter c: ");
        int c= Integer.parseInt(scanner.nextLine());
        c= checkNumber(c);

        checkTriangle(a,b,c);
        scanner.close();
    }
}
