import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Bạn đã nhập sai dữ liệu. Xin mời nhập lại.");
            scanner.next();
        }
        int n = scanner.nextInt();
        System.out.printf("Đảo ngược của số %d là %d", n, daoNguocSo(n));
    }

    public static int daoNguocSo(int n) {
        int temp;
        int daoNguoc = 0;
        while (n > 0) {
            temp = n % 10;
            daoNguoc = daoNguoc * 10 + temp;
            n = n / 10;
        }
        return daoNguoc;
    }
}
