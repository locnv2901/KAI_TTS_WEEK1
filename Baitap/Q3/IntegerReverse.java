package Baitap.Q3;
import java.util.*;
public class IntegerReverse {
    public static Scanner sc = new Scanner(System.in);
    public String input(){
        while (true) { 
            String input = sc.next();
            if(!input.matches("^[0-9]*$")){
                System.err.println("Input must be a integer!");
                System.out.println("Please enter again! Enter your number:");
            }else{
                return input;
            }
        }
    }
    public String reverse(String num){
        char[] c = num.toCharArray();
        char[] newC = new char[c.length];
        int index = 0;
        for (int i = c.length-1; i >= 0; i--) {
            newC[index] = c[i];
            index++;
        }
        num = String.copyValueOf(newC);
        return num;
    }

    public void run(){
        System.out.println("Enter your number:");
        System.out.println("Reserve number is: " + reverse(input()));
    }
    public static void main(String[] args) {
        IntegerReverse i = new IntegerReverse();
        i.run();
        
    }
}
