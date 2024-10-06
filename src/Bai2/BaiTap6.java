package Bai2;

import java.util.Scanner;

public class BaiTap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Nhập chuỗi từ bàn phím
		System.out.print("Nhập chuỗi ký tự: ");
		String input = scanner.nextLine();

		// Chuyển đổi chuỗi thành chữ thường và loại bỏ khoảng trắng
		input = input.toLowerCase().replace(" ", "");

		// Mảng để lưu trữ số lần xuất hiện của các ký tự (ASCII)
		int[] count = new int[128]; // Giả sử chỉ làm việc với ký tự ASCII

		// Đếm số lần xuất hiện của các ký tự
		for (char ch : input.toCharArray()) {
			count[ch]++;
		}

		// In ra các ký tự bị lặp và số lần lặp
		StringBuilder output = new StringBuilder();
		for (char ch = 0; ch < count.length; ch++) {
			if (count[ch] > 1) {
				output.append(ch).append(" : ").append(count[ch]).append("; ");
			}
		}

		// Kiểm tra xem có ký tự nào bị lặp hay không
		if (output.length() > 0) {
			System.out.println("Ký tự bị lặp: " + output.toString());
		} else {
			System.out.println("Không có ký tự nào bị lặp.");
		}

	}

}
