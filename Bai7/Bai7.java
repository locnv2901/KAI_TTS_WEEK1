package Bai7;

import java.util.Scanner;

import static Bai2.Bai2.checkNumber;

public class Bai7 {
    public static void divideMoney(int price){
        int count =0, si,sj;
        for (int i = price/1000 ; i >= 0; i--){
            si = price - i*1000;
            for (int j = si/2000; j >= 0; j--){
                sj = si - j * 2000;
                for (int k = sj/5000; k >= 0; k--){
                    if (i*1000 + j*2000 + k*5000 == price){
                        count++;
                    }
                }
            }
        }
        System.out.println("Result: " + count + " option");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price;
        System.out.println("Enter price:");
        price = Integer.parseInt(scanner.nextLine());
        price = checkNumber(price);

        divideMoney(price);
        scanner.close();
    }
}
