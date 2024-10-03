package Bai6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase().replaceAll("[.\\s]","");

        char[] S = s.toCharArray();

        Map<Character, Integer> elementCountMap= new HashMap<>();

        for (char words: S) {
            elementCountMap.put(words, elementCountMap.getOrDefault(words,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: elementCountMap.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + "\t");
        }

    }
}
