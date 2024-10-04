package Baitap.Q4;
import java.util.*;

public class BinaryConvert {
    public static Scanner sc = new Scanner(System.in);
    public int input(){
        while (true) { 
            try {
                int number = sc.nextInt();
                if(number <=0){
                    System.err.println("Input must be a integer larger than 0!");
                    System.out.println(" Please enter again!");
                    
                }else{
                    return number;
                }
            } catch (Exception e) {
                System.err.println("Input must be a integer!");
                System.out.println(" Please enter again!");
                sc.next();
            }
            
        }
        
    }

    public String convert(int num){
        StringBuilder sb = new StringBuilder();
        int du;
        while(num != 0){
            du = num % 2;
            num = num / 2;
            sb.append(du); 
        }
        return sb.toString();
    }

    public void run(){
         System.out.println("Enter the number:");
         int num = input();
         String binary = convert(num);
         System.out.println("Result:" + binary);
    }
    public static void main(String[] args) {
        BinaryConvert b = new BinaryConvert();
        b.run();
    }
}
