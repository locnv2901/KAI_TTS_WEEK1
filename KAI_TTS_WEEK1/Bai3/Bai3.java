package KAI_TTS_WEEK1.Bai3;

import java.util.Scanner;

/**
 * Bai3
 */
public class Bai3 {
    public static int NumberReverse(int n){
        String num = String.valueOf(n);
        char[] ls = num.toCharArray();
        int i = 0 ;
        int j = num.length() -1;
        while(i<j){
            char temp = ls[i];
            ls[i] = ls[j];
            ls[j] = temp;

            i++;
            j--;
        }
        
        String numStr  = new String(ls);
        int number = Integer.parseInt(numStr);
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want reverve :");
        int number = scanner.nextInt();
        int num = NumberReverse(number);

        System.out.println("Reverse num :"+ num);
    }
    

}