package E8;

import java.util.Scanner;

public class bai8 {
    public static void phoneNumberValidate(){
         Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so dien thoai: ");
        String phoneNumber = scanner.nextLine();
        String regex = "^(\\+84|84|0)(\\d{9}|\\d{3}[.-]?\\d{3}[.-]?\\d{3})$";
        if (phoneNumber.matches(regex)) {
            System.out.println("hop le.");
        } else {
            System.out.println("khong hop le.");
        }
    }
    public static void main(String[] args) {
        phoneNumberValidate();
    }
}
