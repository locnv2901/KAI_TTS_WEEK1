import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Nhập sai dữ liệu. Xin mời nhập lại");
            scanner.next();
        }
        int n = scanner.nextInt();
        System.out.printf("Số nhị phân của số %d là %s", n, nSangNhiPhan(n));

    }

    public static String nSangNhiPhan(int n) {
        StringBuilder temp = new StringBuilder();
        while (n > 0) {
            temp.append(n % 2);
            n = n / 2;
        }
        return temp.reverse().toString();
    }
}
