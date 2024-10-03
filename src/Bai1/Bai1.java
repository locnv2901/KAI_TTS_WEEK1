package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static double calculated(double elecNumber) {
        double bill = 0;
        if (elecNumber >= 0 && elecNumber <= 50) {
            bill = elecNumber * 1000;
        } else if (elecNumber > 50 && elecNumber <= 150) {
            bill =  50 * 1000 + (elecNumber - 50) * 1200;
        } else {
            bill = 50 * 1000 + 50 * 1200 + (elecNumber - 100) * 1500;
        }
        return bill;
    }

    public static double getElecNumber(Scanner sc) {
        double elecNumber;
        while(true) {
            System.out.print("Enter Elec Number: ");
            if (sc.hasNextDouble()) {
                elecNumber = sc.nextDouble();
                if (elecNumber < 0) {
                    System.out.println("Invalid Elec Number");
                } else {
                    return elecNumber;
                }
            } else {
                System.out.println("Invalid Elec Number");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double elecNumber = getElecNumber(sc);
        System.out.println("Bill: " + calculated(elecNumber));
        sc.close();
    }
}
