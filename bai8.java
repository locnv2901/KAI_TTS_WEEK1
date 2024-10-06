import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        // Kiểm tra số điện thoại
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }

        scanner.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy đơn giản
        String regex = "^(0\\d{8}|\\+84\\d{9}|84\\d{9}|0\\d{3}[-.]\\d{3}[-.]\\d{3})$";
        return phoneNumber.matches(regex);
    }
}
