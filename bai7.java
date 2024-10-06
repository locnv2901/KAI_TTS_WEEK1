import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền cần đạt: ");
        int targetAmount = scanner.nextInt();

        timPhuonAn(targetAmount);

        scanner.close();
    }

    public static void timPhuonAn(int targetAmount) {
        int count = 1; // Đếm số phương án
        for (int x = 0; x <= targetAmount / 1000; x++) { // số tờ 1000đ
            for (int y = 0; y <= targetAmount / 2000; y++) { // số tờ 2000đ
                for (int z = 0; z <= targetAmount / 5000; z++) { // số tờ 5000đ
                    if (x * 1000 + y * 2000 + z * 5000 == targetAmount) {
                        System.out.printf("PA %d (%d * 1000đ; %d * 2000đ; %d * 5000đ)%n", count, x, y, z);
                        count++;
                    }
                }
            }
        }
    }
}
