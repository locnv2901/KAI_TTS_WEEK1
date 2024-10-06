import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = scanner.nextLine();
        lapKiTu(s);
    }

    public static void lapKiTu(String string) {
        Map<Character, Integer> charCout = new HashMap<>();
        for (char ch : string.toCharArray()) {
            char kiTu = Character.toLowerCase(ch);
            if (kiTu != ' ') {
                charCout.put(kiTu, charCout.getOrDefault(kiTu, 0) + 1);
            }
        }

        System.out.println("Các kí từ bị lặp và số lần lặp : ");
        for (Map.Entry<Character, Integer> s : charCout.entrySet()) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " : " + s.getValue() + " ;");
            }
        }
    }
}
