    package KAI_TTS_WEEK1.Bai6;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Bai6 {
        public static void LoopString(String a){
            HashMap<Character,Integer> dict = new HashMap<>();
                
            a = a.toLowerCase();
            for(char i : a.toCharArray()){
                if(i == ' ') continue;
                dict.put(i, dict.getOrDefault(i, 0) + 1);
            }
            for(char key : dict.keySet()){
                System.out.print(key+":"+dict.get(key)+" , ");;
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("Enter String : ");
                    String a = scanner.nextLine();
                    System.out.println();
                    
                    LoopString(a);
                    break;
                } catch (Exception e) {
                   System.out.println("Error . Please enter String again");
                   scanner.nextLine();
                }
            }
        }
    }
