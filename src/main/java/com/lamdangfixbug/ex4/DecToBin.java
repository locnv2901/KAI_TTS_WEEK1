package com.lamdangfixbug.ex4;

import com.lamdangfixbug.utils.Utils;

public class DecToBin {
    public static void main(String[] args) {
        getNumberAndPrintBinaryValue();
    }

    public static String decToBin(int num) {
        if(num < 0) throw new IllegalArgumentException("Number must be positive");
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }

    public static void getNumberAndPrintBinaryValue(){
        Integer num = null;
        do{
            try {
                num = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter a number: "));
                if(num < 0) System.out.println("Number must be greater or equal to zero");
            }catch (Exception e){
                System.out.println("Invalid number!");
            };
        }while(num == null || num < 0);
        System.out.println("Binary value is: " + decToBin(num));
    }
}
