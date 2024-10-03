package com.lamdangfixbug.ex2;

import com.lamdangfixbug.utils.Utils;

public class TriangleType {
    public static void main(String[] args) {
        getTriangleEdgeAndPrintType();
    }

    public static void getTriangleEdgeAndPrintType() {
        int a = 0, b = 0, c = 0;
        while (a <= 0 || b <= 0 || c <= 0) {
            try {
                if (a <= 0) a = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter first edge: "));
                if (b <= 0) b = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter second edge: "));
                c = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter third edge: "));
            } catch (Exception e) {
                System.out.println("Invalid input! Please type a number.");
            }
        }
        printTriableType(a,b,c);
    }

    static void printTriableType(int e1, int e2, int e3) {
        boolean isRightTriangle = e1 * e1 + e2 * e2 == e3 * e3 ||
                e1 * e1 + e3 * e3 == e2 * e2 ||
                e2 * e2 + e3 * e3 == e1 * e1;
        if (e1 + e2 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1) {
            System.out.println("This is not a triangle!");
        } else if (e1 == e2 && e2 == e3) {
            System.out.println("This is a equilateral triangle!");
        } else if (e1 == e2 || e2 == e3 || e3 == e1) {
            if (isRightTriangle) {
                System.out.println("This is an isosceles right triangle!");
            } else {
                System.out.println("This is an isosceles triangle!");
            }
        } else if (isRightTriangle) {
            System.out.println("This is a right triangle!");
        } else {
            System.out.println("This is a triangle!");
        }
    }
}
