package Bai9;

import Bai1.Bai1;
import Bai2.Bai2;
import Bai3.Bai3;
import Bai4.Bai4;
import Bai5.Bai5;
import Bai6.Bai6;
import Bai7.Bai7;
import Bai8.Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++==+");
            System.out.println("1. Tính tiền điện");
            System.out.println("2. Kiểm tra tam giác");
            System.out.println("3. Đảo ngược số nguyên");
            System.out.println("4. Đổi sang nhị phân");
            System.out.println("5. Dãy con lớn nhất");
            System.out.println("6. Tìm ký tự lặp");
            System.out.println("7. Chia tiền");
            System.out.println("8. Kiểm tra số điện thoại");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bill: " + calculateElectricityBill());
                    break;
                case 2:
                    checkTriangle();
                    break;
                case 3:
                    System.out.println("Số đảo ngược: " + reverseInteger());
                    break;
                case 4:
                    convertToBinary();
                    break;
                case 5:
                    findLongestIncreasingSubsequence();
                    break;
                case 6:
                    findRepeatedCharacter();
                    break;
                case 7:
                    splitMoney();
                    break;
                case 8:
                    checkPhoneNumber();
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }

        } while (choice != 9);
    }

    public static double calculateElectricityBill() {
        Scanner sc = new Scanner(System.in);
        return Bai1.calculated(Bai1.getElecNumber(sc));
    }

    public static void checkTriangle() {
        Scanner sc = new Scanner(System.in);
        double a = Bai2.getEdge(sc, "a"), b = Bai2.getEdge(sc, "b"), c = Bai2.getEdge(sc, "c");
        System.out.println("3 cạnh trên tạo thành " + Bai2.checkTriangle(a,b,c).getDescription());
    }

    public static int reverseInteger() {
        Scanner sc = new Scanner(System.in);
        return Bai3.reverse(Bai3.getNumber(sc));
    }

    public static void convertToBinary() {
        Scanner sc = new Scanner(System.in);
        int n = Bai4.getNumber(sc);
        System.out.println(n + " -> " + Bai4.convertToBinary(n));
    }

    public static void findLongestIncreasingSubsequence() {
        Scanner sc = new Scanner(System.in);
        int n = Bai5.getNumber(sc);
        int[] A = new int[n];
        System.out.println("Nhập các phần tử của mảng A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        ArrayList<Integer> lis = Bai5.findLongestIncreasingSubsequence(A);
        System.out.println("Dãy con tăng dài nhất là: " + lis);
    }

    public static void findRepeatedCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        Bai6.findDuplicateString(str).forEach((key, value) -> {
            if(value > 1 && !" ".equals(key))
                System.out.println(key + " : " + value);
        });
    }

    public static void splitMoney() {
        Scanner sc = new Scanner(System.in);
        int totalAmount = Bai7.getNumber(sc);
        Bai7.distributeMoney(totalAmount);
    }

    public static void checkPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại cần kiểm tra: ");
        String phoneNumber = sc.nextLine();
        if (Bai8.isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
