package Bai8;

import java.util.Scanner;

public class Bai8 {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\+84|0|84)[0-9]{3}[-\\.]?[0-9]{3}[-\\.]?[0-9]{3}$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại cần kiểm tra: ");
        String phoneNumber = sc.nextLine();
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
        sc.close();
    }
}
