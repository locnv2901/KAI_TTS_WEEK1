package Bai_8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        checkSDT();
    }

    public static void checkSDT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien thoai can kiem tra: ");
        String phoneNumber = scanner.nextLine();
        String regex = "^(\\+84|0|84)[0-9]{3}[-.]?[0-9]{3}[-.]?[0-9]{3}$";
        if (phoneNumber.matches(regex)) {
            System.out.println("So dien thoai hop le");
        } else {
            System.out.println("So dien thoai khong hop le");
        }
    }
}
