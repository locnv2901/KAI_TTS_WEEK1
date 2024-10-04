package Baitap.Q7;
import java.util.*;

public class Monney {
    public static Scanner sc = new Scanner(System.in);
    public int input(){
        while (true) { 
            try {
                int number = sc.nextInt();
                if(number <0){
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

    public void cashCount(int target){

        int count=1;
        for (int i = 0; i <= target/1000; i++) {
            for (int j = 0; j <= target/2000; j++) {
                int total = 1000*i + 2000*j;
                if (total == target) {
                    System.out.println("PA "+ count + " ( so to " + i + " * 1000; so to " + j + " * 2000; so to 0 * 5000)");
                    count++;
                }
                else if(total < target){
                    if((target-total)%5000 == 0){
                        System.out.println("PA "+ count + " ( so to " + i + " * 1000; so to " + j + " * 2000; so to " +(target-total)/5000+ " * 5000)");
                        count++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Monney m = new Monney();
        System.out.println("Enter your target:");
        m.cashCount(m.input());
    }
}
