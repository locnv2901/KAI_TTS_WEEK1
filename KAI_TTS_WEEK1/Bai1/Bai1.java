 package KAI_TTS_WEEK1.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static int ElectCost(int n){
        int result =1;
        
        if(n <=50 && n > 0 ){
            result = 1000 *n;
        }else if(n <50 && n<=100){
            result = (n-50)*1200 + 50*1200;
        }else if(n>100){
            result = (n-100)*1500 + 50*1200 +50*1000;
        }
        return result;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
           try {
                System.out.println("the electricity consumption : ");
                int electCount = scanner.nextInt();
                if (electCount <= 0) {
                    System.out.println("Please enter the electricity consumption");
                } else {
                   
                    int cost =  ElectCost(electCount);
                    System.out.println("cost electric: " + cost + " VND");
                    break; // Thoát khỏi vòng lặp sau khi nhập đúng và tính toán
                }

           } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                scanner.nextInt();
           }

        
            
        }
        


    }
 }