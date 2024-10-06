package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap5 {

	public static <A> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Nhập số nguyên n
		System.out.print("Nhập vào một số nguyên n (n > 0): ");
		int n = scanner.nextInt();

		// Kiểm tra điều kiện n > 0
		if (n <= 0) {
			System.out.println("n phải lớn hơn 0.");
			return;
		}

		// Tạo mảng A
		int[] A = new int[n];

		// Nhập các giá trị cho mảng A
		System.out.println("Nhập các giá trị cho mảng A:");
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			A[i] = scanner.nextInt();
		}

		// Tìm dãy con tăng dài nhất
		ArrayList<Integer> lis = longestIncreasingSubsequence(A);

		// In ra dãy con tăng dài nhất
		System.out.print("Dãy con tăng dài nhất là: { ");
		for (int value : lis) {
			System.out.print(value + " ");
		}
		System.out.println("}");
	}

	public static ArrayList<Integer> longestIncreasingSubsequence(int[] A) {
		ArrayList<Integer> lis = new ArrayList<>();
		int[] parent = new int[A.length];
		int[] lisIndices = new int[A.length];
		int size = 0;

		for (int i = 0; i < A.length; i++) {
			// Sử dụng binary search để tìm vị trí
			int pos = Collections.binarySearch(lis, A[i]);

			// Nếu không tìm thấy, pos là vị trí để chèn
			if (pos < 0) {
				pos = -pos - 1;
			}

			// Cập nhật dãy con tăng
			if (pos == lis.size()) {
				lis.add(A[i]);
			} else {
				lis.set(pos, A[i]);
			}

			// Lưu chỉ số cha để xây dựng dãy con
			parent[i] = (pos == 0) ? -1 : lisIndices[pos - 1];
			lisIndices[pos] = i;

			// Cập nhật kích thước
			if (pos == size) {
				size++;
			}
		}

		// Xây dựng dãy con tăng từ mảng parent
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = lisIndices[size - 1]; i >= 0; i = parent[i]) {
			result.add(A[i]);
		}

		// Đảo ngược dãy con để đúng thứ tự
		Collections.reverse(result);
		return result;
	}

}
