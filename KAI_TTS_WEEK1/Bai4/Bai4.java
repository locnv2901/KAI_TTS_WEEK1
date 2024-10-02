package KAI_TTS_WEEK1.Bai4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static String DecBina(int n){
        List<Integer> binary = new ArrayList<>();
        int i =0;
        if (n == 0) {
            binary.add(0); 
        }
        while (n > 0) {
            int a = n % 2; // Lấy phần dư
            binary.add(a); 
            n = n / 2; // Chia cho 2 để cập nhật n
        }

        Collections.reverse(binary);

        StringBuilder binaryString = new StringBuilder();
        for (int num : binary) {
            binaryString.append(num); 
        }

        return binaryString.toString();


    }
    public static void main(String[] args) {
       
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
               
                System.out.println("Enter number you want tranfer to binary :");
                int dec = scanner.nextInt();
                if(dec < 0 ){
                    System.out.println(" Error. Please enter a positive integer .");
                }else{
                    String bina = DecBina(dec);
                    System.out.println("Binary :" +  bina);
                }
                
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a positive integer.");
                scanner.nextInt(); 
            }
            
        }
    }
}
