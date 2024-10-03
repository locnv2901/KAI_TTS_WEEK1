package Bai_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        timKyTuLap();
    }

    public static void timKyTuLap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu S: ");
        String s = scanner.nextLine();
        s = s.replaceAll(" ", "").toLowerCase();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
