package Bai2;

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhập một số nguyên dương: ");
			if (scanner.hasNextInt()) {
				n = scanner.nextInt();
				if (n > 0) {
					break; // Nếu nhập đúng số nguyên dương, thoát khỏi vòng lặp
				} else {
					System.out.println(" Nhập số nguyên dương: ");
				}
			} else {
				System.out.println("Dữ liệu nhập không hợp lệ! Vui lòng nhập lại.");
				scanner.next(); // Đọc và bỏ qua dữ liệu không hợp lệ
			}
		}
		String binaryString = Integer.toBinaryString(n);
		System.out.println("Số nhị phân của " + n + " là: " + binaryString);
		System.out.println(Integer.toBinaryString(n));
	}

}
