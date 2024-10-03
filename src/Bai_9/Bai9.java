package Bai_9;

import Bai_1.Bai1;
import Bai_2.Bai2;
import Bai_3.Bai3;
import Bai_4.Bai4;
import Bai_5.Bai5;
import Bai_6.Bai6;
import Bai_7.Bai7;
import Bai_8.Bai8;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        inMenu();
    }

    public static void menu() {
        System.out.println("\n==========================");
        System.out.println("1. Tinh tien dien");
        System.out.println("2. Kiem tra tam giac");
        System.out.println("3. Dao nguoc so nguyen");
        System.out.println("4. Doi sang nhi phan");
        System.out.println("5. Day con tang dai nhat");
        System.out.println("6. Tim ky tu lap");
        System.out.println("7. Chia tien");
        System.out.println("8. Kiem tra so dien thoai");
        System.out.println("9. Thoat");
        System.out.println("==========================");
    }

    public static void inMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            menu();
            System.out.print("Chon chuc nang (1-9): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Bai1.tinhTongTien();
                    break;
                case 2:
                    Bai2.checkTamGiac();
                    break;
                case 3:
                    Bai3.daoNguocChuoi();
                    break;
                case 4:
                    Bai4.chuyenDoiNhiPhan();
                    break;
                case 5:
                    Bai5.timMangConTangDanDaiNhat();
                    break;
                case 6:
                    Bai6.timKyTuLap();
                    break;
                case 7:
                    Bai7.chiaTien();
                    break;
                case 8:
                    Bai8.checkSDT();
                    break;
                case 9:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}
