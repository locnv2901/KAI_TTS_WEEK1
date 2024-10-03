package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 {
    public static ArrayList<Integer> findLongestIncreasingSubsequence(int[] A) {
        int n = A.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int maxLength = 0;
        int lastIndex = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }

        ArrayList<Integer> lis = new ArrayList<>();
        while (lastIndex != -1) {
            lis.add(0, A[lastIndex]); // Thêm phần tử vào đầu danh sách
            lastIndex = prev[lastIndex];
        }
        return lis;
    }

    public static int getNumber(Scanner sc) {
        int number;
        while(true) {
            System.out.print("Enter Number: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number <= 0) {
                    System.out.println("Invalid Number");
                } else {
                    return number;
                }
            } else {
                System.out.println("Invalid Number");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getNumber(sc);
        int[] A = new int[n];
        System.out.println("Nhập các phần tử của mảng A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        ArrayList<Integer> lis = findLongestIncreasingSubsequence(A);
        System.out.println("Dãy con tăng dài nhất là: " + lis);
    }
}
