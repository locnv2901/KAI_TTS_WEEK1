package com.lamdangfixbug.ex9;

import com.lamdangfixbug.ex1.ElectricBillCalculator;
import com.lamdangfixbug.ex2.TriangleType;
import com.lamdangfixbug.ex3.ReverseNumber;
import com.lamdangfixbug.ex4.DecToBin;
import com.lamdangfixbug.ex5.LongestIncreasingSubsequence;
import com.lamdangfixbug.ex6.RepeatCharacter;
import com.lamdangfixbug.ex7.SplitMoney;
import com.lamdangfixbug.ex8.CheckPhoneNumber;
import com.lamdangfixbug.utils.Utils;

import java.util.Scanner;

public class FullFunctional {
    static final Scanner sc = Utils.scanner;
    static final String appTitle = "=".repeat(10) + "WEEK 1" + "=".repeat(10);
    static final String[] menuTitle = new String[]{
            "Calculate Electric Bill",
            "Triangle Checker",
            "Reverse Number",
            "Convert Decimal to Binary",
            "Longest Increasing Subsequence",
            "Count Repeat Character",
            "Split Money",
            "Phone Number Checker",
            "Quit"
    };

    public static void main(String[] args) {
        String choice = "";
        while(!choice.equals("9")){
            choice = printMenuAndGetChoice();
            choiceProcessing(choice);
        }
    }

    public static String printMenuAndGetChoice() {
        String choice = "";
        System.out.println(appTitle);
        for(int i = 1; i <= menuTitle.length;i++){
            System.out.printf("%d. %s\n",i,menuTitle[i-1]);
        }
        choice = Utils.repeatInputWhenInvalid("Enter your choice: ");
        return choice;
    }

    public static void choiceProcessing(String choice){
        switch (choice){
            case "1"->{
                ElectricBillCalculator.getElectricNumberAndPrintBillValue();
            }
            case "2" ->{
                TriangleType.getTriangleEdgeAndPrintType();
            }
            case "3" ->{
                ReverseNumber.getNumberAndPrintItReverse();
            }
            case "4" ->{
                DecToBin.getNumberAndPrintBinaryValue();
            }
            case "5" ->{
                LongestIncreasingSubsequence.getArrayAndPrintItLongestIncreasingSubsequence();
            }
            case "6" ->{
                RepeatCharacter.getStringAndPrintRepeatCharacter();
            }
            case "7" ->{
                SplitMoney.getMoneyAndPrint();
            }
            case "8" ->{
                CheckPhoneNumber.getPhoneNumberAndCheck();
            }
            case "9"->{
                System.out.println("Thank you for using program!");
            }
            default -> {
                System.out.println("Invalid choice!");
            }
        }
    }
}
