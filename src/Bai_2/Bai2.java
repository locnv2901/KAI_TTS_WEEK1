package Bai_2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        checkTamGiac();
    }

    public static void checkTamGiac() {
        Scanner scanner = new Scanner(System.in);
        int a , b , c ;

        while (true) {
            try {
                System.out.print("Nhap canh a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhap canh b: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhap canh c: ");
                c = Integer.parseInt(scanner.nextLine());

                if (a <= 0 || b <= 0 || c <= 0) {
                    System.out.println("Cac canh phai la so nguyen duong");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Canh phai la 1 so");
            }
        }

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || a == c) {
                if (kiemTraVuong(a, b, c)) {
                    System.out.println("Tam giac vuong can");
                } else {
                    System.out.println("Tam giac can");
                }
            } else if (kiemTraVuong(a, b, c)) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Khong phai tam giac");
        }
    }

    public static boolean kiemTraVuong(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}
