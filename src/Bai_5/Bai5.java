package Bai_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        timMangConTangDanDaiNhat();
    }

    public static void timMangConTangDanDaiNhat() {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap so nguyen duong n: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) {
                    break;
                } else {
                    System.out.println("n la so nguyen duong");
                }
            } catch (NumberFormatException e) {
                System.out.println("n la 1 so nguyen");
            }
        }

        Integer[] A = new Integer[n+1];

        for (int i = 0; i <= n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] dp = new int[n+1];
        int[] prev = new int[n+1];
        int maxLength = 0;
        int endIndex = -1;

        for (int i = 0; i <= n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }

        List<Integer> list = new ArrayList<>();
        while (endIndex != -1) {
            list.add(0, A[endIndex]);
            endIndex = prev[endIndex];
        }
        System.out.println("Day con tang dai nhat la: " +list);
    }

}
