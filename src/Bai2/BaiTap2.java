package Bai2;

import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap 3 so nguyen duong a, b, c");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (a <= 0 | b <= 0 | c <= 0) {
			System.out.println("khong phai tam giac");
		} else if (c * c == (a * a) + (b * b)) {
			System.out.println("tam giac vuong");
		} else {
			if (a == b && b == c) {
				System.out.println("tam giac deu");
			} else if (a == b && (c * c == (a * a) + (b * b))) {
				System.out.println("tam giac vuong can");
			} else if (a == b | a == c | b == c) {
				System.out.println("tam giac can");
			}
		}
	}

}
