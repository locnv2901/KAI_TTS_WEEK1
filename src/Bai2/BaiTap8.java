package Bai2;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class BaiTap8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện thoại: ");
		String input = scanner.nextLine();

		if (isValidPhoneNumber(input)) {
			System.out.println("Số điện thoại hợp lệ.");
		} else {
			System.out.println("Số điện thoại không hợp lệ.");
		}
	}

	public static boolean isValidPhoneNumber(String phoneNumber) {
		// Loại bỏ các ký tự không cần thiết
		String cleanedNumber = phoneNumber.replace("-", "").replace(".", "");

		// Kiểm tra các định dạng số điện thoại
		if (cleanedNumber.length() == 10 && cleanedNumber.startsWith("0")) {
			return cleanedNumber.substring(1).matches("\\d{9}");
		} else if (cleanedNumber.length() == 12 && cleanedNumber.startsWith("+84")) {
			return cleanedNumber.substring(3).matches("\\d{9}");
		} else if (cleanedNumber.length() == 11 && cleanedNumber.startsWith("84")) {
			return cleanedNumber.substring(2).matches("\\d{9}");
		}

		return false; // Trả về false nếu không thỏa mãn điều kiện nào
	}

}
