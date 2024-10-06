package Bai2;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Nhập số tiền từ bàn phím
		System.out.print("Nhập số tiền cần đạt (đ): ");
		int targetAmount = scanner.nextInt();

		// Khởi tạo biến đếm
		int count = 1;

		// Duyệt qua số tờ 1000đ
		for (int i = 0; i <= targetAmount / 1000; i++) {
			// Tính số tiền đã sử dụng từ 1000đ
			int amountAfter1000 = targetAmount - (i * 1000);

			// Duyệt qua số tờ 2000đ
			for (int j = 0; j <= amountAfter1000 / 2000; j++) {
				// Tính số tiền đã sử dụng từ 1000đ và 2000đ
				int amountAfter2000 = amountAfter1000 - (j * 2000);

				// Số tờ 5000đ cần để đạt tổng
				int k = amountAfter2000 / 5000;

				// Kiểm tra xem số tiền có đạt đúng không
				if ((i * 1000) + (j * 2000) + (k * 5000) == targetAmount) {
					System.out.printf("PA %d: %d tờ 1000đ; %d tờ 2000đ; %d tờ 5000đ%n", count++, i, j, k);
				}
			}
		}

		// Kiểm tra xem có phương án nào hay không
		if (count == 1) {
			System.out.println("Không có phương án nào phù hợp.");
		}

	}

}
