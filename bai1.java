import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soDien = -1;

        while (soDien < 0) {
            System.out.print("Nhập số điện sử dụng trong tháng: ");
            if (scanner.hasNextDouble()) {
                soDien = scanner.nextDouble();
                if (soDien < 0) {
                    System.out.println("Số điện không được âm. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
        }
        double tienPhaiTra = tinhTienDien(soDien);
        System.out.printf("Số tiền cần phải trả là: %.2f VNĐ%n", tienPhaiTra);
    }

    public static double tinhTienDien(double soDien) {
        double tien = 0;

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else if (soDien <= 100) {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        } else {
            tien = 50 * 1000 + 50 * 1200 + (soDien - 100) * 1500;
        }
        return tien;
    }
}