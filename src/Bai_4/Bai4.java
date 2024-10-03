package Bai_4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        chuyenDoiNhiPhan();
    }

    public static void chuyenDoiNhiPhan() {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap so nguyen duong n: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) {
                    break;
                } else {
                    System.out.println("n la so nguyen duong");
                }
            } catch (NumberFormatException e) {
                System.out.println("n la 1 so nguyen");
            }
        }
        String nhiPhan = chuyenSangNhiPhan(n);
        System.out.println("So nhi phan cua " + n + " là: " + nhiPhan);
    }

    public static String chuyenSangNhiPhan(int n) {
        StringBuilder nhiPhan = new StringBuilder();

        while (n > 0) {
            int phanDu = n % 2;
            nhiPhan.append(phanDu);
            n = n / 2;
        }
        return nhiPhan.toString();
    }
}
