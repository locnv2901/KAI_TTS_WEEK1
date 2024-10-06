package Bai2;

import java.util.*;

public class BaiTap9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("+---------------------------+");
			System.out.println("| 1. Tính tiền điện        |");
			System.out.println("| 2. Kiểm tra tam giác      |");
			System.out.println("| 3. Đảo ngược số nguyên    |");
			System.out.println("| 4. Đổi sang nhị phân      |");
			System.out.println("| 5. Dãy con lớn nhất       |");
			System.out.println("| 6. Tìm ký tự lặp         |");
			System.out.println("| 7. Chia tiền              |");
			System.out.println("| 8. Kiểm tra số điện thoại  |");
			System.out.println("| 9. Thoát                  |");
			System.out.println("+---------------------------+");
			System.out.print("Chọn chức năng: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				calculateElectricityBill(scanner);
				break;
			case 2:
				checkTriangle(scanner);
				break;
			case 3:
				reverseInteger(scanner);
				break;
			case 4:
				convertToBinary(scanner);
				break;
			case 5:
				longestIncreasingSubsequence(scanner);
				break;
			case 6:
				findDuplicateCharacters(scanner);
				break;
			case 7:
				findWaysToMakeMoney(scanner);
				break;
			case 8:
				validatePhoneNumber(scanner);
				break;
			case 9:
				System.out.println("Thoát chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
		} while (choice != 9);

		scanner.close();
	}

	// 1. Tính tiền điện
	public static void calculateElectricityBill(Scanner scanner) {
		int usage;
		while (true) {
			System.out.print("Nhập số điện sử dụng: ");
			usage = scanner.nextInt();
			if (usage >= 0)
				break;
			System.out.println("Số điện phải là số nguyên dương.");
		}

		int bill = 0;
		if (usage <= 50) {
			bill = usage * 1000;
		} else if (usage <= 100) {
			bill = 50 * 1000 + (usage - 50) * 1200;
		} else {
			bill = 50 * 1000 + 50 * 1200 + (usage - 100) * 1500;
		}

		System.out.println("Số tiền cần phải trả: " + bill + "đ");
	}

	// 2. Kiểm tra tam giác
	public static void checkTriangle(Scanner scanner) {
		System.out.print("Nhập ba số nguyên dương a, b, c: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				System.out.println("Tam giác đều.");
			} else if (a == b || b == c || a == c) {
				System.out.println("Tam giác cân.");
			} else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
				System.out.println("Tam giác vuông.");
			} else {
				System.out.println("Tam giác thường.");
			}
		} else {
			System.out.println("Không phải là tam giác.");
		}
	}

	// 3. Đảo ngược số nguyên
	public static void reverseInteger(Scanner scanner) {
		System.out.print("Nhập một số nguyên: ");
		int a = scanner.nextInt();
		int reversed = 0;

		while (a != 0) {
			int digit = a % 10;
			reversed = reversed * 10 + digit;
			a /= 10;
		}

		System.out.println("Số đảo ngược: " + reversed);
	}

	// 4. Đổi sang nhị phân
	public static void convertToBinary(Scanner scanner) {
		int n;
		while (true) {
			System.out.print("Nhập số nguyên dương n: ");
			n = scanner.nextInt();
			if (n > 0)
				break;
			System.out.println("Số phải lớn hơn 0.");
		}

		StringBuilder binary = new StringBuilder();
		while (n > 0) {
			binary.insert(0, n % 2);
			n /= 2;
		}

		System.out.println("Số nhị phân của n là: " + binary);
	}

	// 5. Dãy con lớn nhất
	public static void longestIncreasingSubsequence(Scanner scanner) {
		System.out.print("Nhập kích thước mảng n: ");
		int n = scanner.nextInt();
		int[] A = new int[n];

		System.out.println("Nhập các giá trị cho mảng A:");
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}

		List<Integer> lis = new ArrayList<>();
		for (int value : A) {
			if (lis.isEmpty() || lis.get(lis.size() - 1) < value) {
				lis.add(value);
			} else {
				for (int j = 0; j < lis.size(); j++) {
					if (lis.get(j) >= value) {
						lis.set(j, value);
						break;
					}
				}
			}
		}

		System.out.println("Dãy con tăng dài nhất là: " + lis);
	}

	// 6. Tìm ký tự lặp
	public static void findDuplicateCharacters(Scanner scanner) {
		System.out.print("Nhập một chuỗi: ");
		scanner.nextLine(); // Để đọc dòng mới sau khi nhập số
		String input = scanner.nextLine().toLowerCase();
		Map<Character, Integer> charCount = new HashMap<>();

		for (char ch : input.toCharArray()) {
			if (ch != ' ') {
				charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
			}
		}

		System.out.println("Các ký tự bị lặp và số lần lặp:");
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

	// 7. Chia tiền
	public static void findWaysToMakeMoney(Scanner scanner) {
		System.out.print("Nhập số tiền cần có: ");
		int target = scanner.nextInt();
		for (int i = 0; i <= target / 1000; i++) {
			for (int j = 0; j <= target / 2000; j++) {
				for (int k = 0; k <= target / 5000; k++) {
					if (i * 1000 + j * 2000 + k * 5000 == target) {
						System.out.printf("PA ( %d * 1000; %d * 2000; %d * 5000)\n", i, j, k);
					}
				}
			}
		}
	}

	// 8. Kiểm tra số điện thoại
	public static void validatePhoneNumber(Scanner scanner) {
		System.out.print("Nhập số điện thoại: ");
		String phoneNumber = scanner.nextLine();
		String cleanedNumber = phoneNumber.replace("-", "").replace(".", "");

		if ((cleanedNumber.length() == 10 && cleanedNumber.startsWith("0"))
				|| (cleanedNumber.length() == 12 && cleanedNumber.startsWith("+84"))
				|| (cleanedNumber.length() == 11 && cleanedNumber.startsWith("84"))) {
			System.out.println("Số điện thoại hợp lệ.");
		} else {
			System.out.println("Số điện thoại không hợp lệ.");
		}
	}
}
