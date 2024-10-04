package Baitap.Q1;
import java.util.*;
public class ElectricityBill {
    public static Scanner sc = new Scanner(System.in);
    public int input(){
        while (true) { 
            try {
                int electric_number = sc.nextInt();
                if(electric_number <0){
                    System.err.println("Input must be a integer larger than 0!");
                    System.out.println(" Please enter again!");
                    
                }else{
                    return electric_number;
                }
            } catch (Exception e) {
                System.err.println("Input must be a integer!");
                System.out.println(" Please enter again!");
                sc.next();
            }
            
        }
        
    }

    public int electricity_bill(int electric_number){
        if(electric_number<=50){
            return  electric_number*1000;
        }
        else if(electric_number>50 && electric_number<=100){
            return electric_number*1200;
        }
        else{
            return electric_number*1500;
        }
    }

    public void run(){
        // Dien so dien
        System.out.println("Enter your electric number:");
        int electric_number = input();
        // Tinh so dien can phai tra
        int electricity_bill=electricity_bill(electric_number);
        // In ra so tien can phai tra
        System.out.println("Your electricity bill is:"+ electricity_bill);
    }
    public static void main(String[] args) {
        ElectricityBill c = new ElectricityBill();
        c.run();
    }
}
