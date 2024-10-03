package com.lamdangfixbug.ex7;

import com.lamdangfixbug.utils.Utils;

public class SplitMoney {
    public static void main(String[] args) {
        getMoneyAndPrint();
    }

    public static void splitMoney(int value){
        int ans = 1;
        for(int i = 0 ; i <= value/1000; i++){
            for(int j = 0 ; j<= value/2000; j++){
                for(int k = 0; k <= value/5000; k++){
                    if(i*1000 + j*2000 + k*5000 == value){
                        System.out.printf("PA %d (%d * 1000; %d * 2000; %d * 5000)\n",ans++,i,j,k);
                    }
                }
            }
        }
    }

    public static void getMoneyAndPrint(){
        Integer amount = null;
        while(amount == null || amount <= 0){
            try{
                amount = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter amount of money: "));
                if(amount <= 0){
                    System.out.println("Amount of money must be greater than zero");
                }
            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }
        splitMoney(amount);
    }
}
