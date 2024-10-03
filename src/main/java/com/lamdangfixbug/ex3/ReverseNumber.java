package com.lamdangfixbug.ex3;

import com.lamdangfixbug.utils.Utils;

public class ReverseNumber {
    public static void main(String[] args) {
        getNumberAndPrintItReverse();
    }

    public static int reverseNumber(int number) {
        int res = 0;
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }
        while (number % 10 == 0) number = number / 10;
        int numOfDigits = String.valueOf(number).length();
        for (int i = 0; i < numOfDigits; i++) {
            res += (int) Math.pow(10, numOfDigits - i - 1) * (number % 10);
            number = (int) (number / 10);
        }
        return res * (isNegative ? -1 : 1);
    }

    public static void getNumberAndPrintItReverse(){
        Integer num = null;
        do{
            try{
                num = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter a number: "));
            }catch (Exception e){
                System.out.println("Invalid number");
            }
        }while(num==null);
        System.out.println("It's reverse number: " + reverseNumber(num));
    }
}
