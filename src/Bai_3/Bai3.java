package Bai_3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
daoNguocChuoi();
    }

    public static void daoNguocChuoi() {
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Nhap so nguyen a: ");
            try{
                a = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhap vao 1 so");
            }
        }

        int soDaoNguoc = 0;

        while (a != 0) {
            int chuSo = a % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            a = a / 10;
        }

        System.out.println("So dao nguoc la: " + soDaoNguoc);
    }
}
