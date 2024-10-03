package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int electric, price=0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter electric: ");
            electric = Integer.parseInt(scanner.nextLine());
            if (electric < 0 ){
                System.err.println("Invalid number!!");
                System.out.println("Re-Enter electric: ");
                electric = Integer.parseInt(scanner.nextLine());

            }
        }catch (NumberFormatException e){
            System.err.println("Invalid number!!");
            System.out.println("Re-Enter electric: ");
            electric = Integer.parseInt(scanner.nextLine());
        }
        if (electric >0 && electric <=50){
            price = electric * 1000;
        }
        if (electric >50){
            price = electric * 1200;
            if (electric > 100){
                price = electric * 1500;
            }
        }
        scanner.close();
        System.out.println("Price : " + price);

    }
}
