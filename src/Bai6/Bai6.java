package Bai6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai6 {
    public static Map<String, Integer> findDuplicateString(String str) {
        Map<String, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch) {
            if(!map.containsKey(String.valueOf(c))) {
                map.put(String.valueOf(c), 1);
            } else {
                map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        findDuplicateString(str).forEach((key, value) -> {
            if(value > 1 && !" ".equals(key))
                System.out.println(key + " : " + value);
        });
        sc.close();
    }
}
