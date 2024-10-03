package Bai2;

import java.util.Scanner;

public class Bai2 {
    public static double getEdge(Scanner sc, String str) {
        double elecNumber;
        while(true) {
            System.out.print("Enter edge " + str + ": ");
            if (sc.hasNextDouble()) {
                elecNumber = sc.nextDouble();
                if (elecNumber < 0) {
                    System.out.println("Invalid Number");
                } else {
                    return elecNumber;
                }
            } else {
                System.out.println("Invalid Number");
                sc.next();
            }
        }
    }

    public static Triangle checkTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return Triangle.NONE;
        } else if (a == b || b == c || a == c) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return Triangle.ISOSCELES_RIGHT_TRIANGLE;
            } else {
                return Triangle.ISOSCELES_TRIANGLE;
            }
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return Triangle.RIGHT_TRIANGLE;
        } else {
            return Triangle.NORMAL;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = getEdge(sc, "a"), b = getEdge(sc, "b"), c = getEdge(sc, "c");
        System.out.println(checkTriangle(a,b,c).getDescription());
        sc.close();
    }
}
