package Bai8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai8 {
    public static final String REGEX_PHONE = "(?:\\+84|84|0)\\d{9}|(?:\\d{3}.){2}?\\d{4}";
    public static boolean isPhone(String phone){
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();

        while (!isPhone(phone)){
            System.err.println("Invalid phone number!");
            System.out.println("Re-enter phone:");
            phone = scanner.nextLine();
        }

        System.out.println("Phone number " + phone + " is valid");
        scanner.close();
    }
}
