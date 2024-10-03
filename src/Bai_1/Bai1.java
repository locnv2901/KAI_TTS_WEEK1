package Bai_1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
       tinhTongTien();
    }

    public static void tinhTongTien(){
        Scanner scanner = new Scanner(System.in);
        double soDienSuDung;
        double soTienPhaiTra;

        while (true) {
            System.out.print("Nhap so dien su dung trong thang: ");
            try {
                soDienSuDung = scanner.nextDouble();
                if (soDienSuDung >= 0) {
                    break;
                } else {
                    System.out.println("So dien khong duoc am");
                }
            } catch (NumberFormatException e) {
                System.out.println("So dien phai la 1 so");
            }
        }

        if (soDienSuDung <= 50) {
            soTienPhaiTra = soDienSuDung * 1000;
        } else if (soDienSuDung <= 100) {
            soTienPhaiTra = (50 * 1000) + ((soDienSuDung - 50) * 1200);
        } else {
            soTienPhaiTra = (50 * 1000) + (50 * 1200) + ((soDienSuDung - 100) * 1500);
        }
        System.out.printf("So tien can tra la: %.2f VNĐ\n", soTienPhaiTra);
    }
}
