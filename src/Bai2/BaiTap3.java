package Bai2;

import java.util.Scanner;

public class BaiTap3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		boolean validInput = false;

		// Nhập số nguyên từ bàn phím và validate đầu vào
		while (!validInput) {
			System.out.print("Nhập vào một số nguyên: ");
			if (scanner.hasNextInt()) {
				a = scanner.nextInt();
				validInput = true; // Đầu vào hợp lệ
			} else {
				System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
				scanner.next(); // Xóa giá trị không hợp lệ
			}
		}

		// Biến để lưu số đảo ngược
		int reversedNumber = 0;
		int originalNumber = Math.abs(a); // Lưu giá trị tuyệt đối của số ban đầu

		// Đảo ngược số nguyên
		while (originalNumber != 0) {
			int digit = originalNumber % 10; // Lấy chữ số cuối
			reversedNumber = reversedNumber * 10 + digit; // Thêm chữ số vào số đảo ngược
			originalNumber /= 10; // Bỏ chữ số cuối
		}

		// Nếu số ban đầu âm, chuyển kết quả về âm
		if (a < 0) {
			reversedNumber = -reversedNumber;
		}

		// In ra số đảo ngược
		System.out.println("Số đảo ngược của " + a + " là: " + reversedNumber);
	}
}
