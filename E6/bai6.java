package E6;

import java.util.HashMap;
import java.util.Scanner;

public class bai6 {
    public static void countChar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi : ");
        String s=scanner.nextLine();
        String s1=s.toUpperCase();
        HashMap<Character,Integer> charCount=new HashMap<>();
        for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)!=' '){
            if(charCount.containsKey(s1.charAt(i))){
                
                charCount.put(s1.charAt(i),charCount.get(s1.charAt(i))+1);
            }
            else{
                charCount.put(s1.charAt(i), 1);
            }
            }
        }
        for (char ch : charCount.keySet()) {
            
            int count = charCount.get(ch);
            if (count >1) {
                System.out.println("loi");
               System.out.println(ch + ": " + count);
            }
        }
    }
    public static void main(String[] args) {
        countChar();
    }
}
