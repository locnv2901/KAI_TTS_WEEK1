package KAI_TTS_WEEK1.Bai7;

import java.util.Scanner;

public class Bai7 {
    public static void DividedMoney(int n){
        int max1k = n / 1000;  
        int max2k = n / 2000;  
        int max5k = n / 5000; 

    
        for (int i = 0; i <= max1k; i++) { 
            for (int j = 0; j <= max2k; j++) { 
                for (int k = 0; k <= max5k; k++) { 
                    int total = (i * 1000) + (j * 2000) + (k * 5000);
                    
                    if (total == n) {
                        System.out.println("PA: " + i + " * 1000 + " + j + " * 2000 + " + k + " * 5000");
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            try {
                System.out.print("Enter money: ");
                int n = scanner.nextInt();  
        
            
               DividedMoney(n);
               break;
            } catch (Exception e) {
               
                System.out.println("Please enter again :");
                scanner.next();
            }
            
        }
    }
}
