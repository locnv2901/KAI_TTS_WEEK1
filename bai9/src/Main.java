import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void insertArr(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang a");
        for( int i = 0 ;i<n ; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void longestIncrease(Scanner sc){

        System.out.println("nhap do dai");
        int n = sc.nextInt();
        while (n <= 0){
            System.out.println("nhap so lon hon 0");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        insertArr(arr, n);
        int[] dp = new int[n];
        int maxlenght = 1 ;
        Arrays.fill(dp, 1);

        for(int i = 1;i<n;i++){
            for(int j = 0 ;j<i;j++){
                if(arr[i] > arr[j]){
                    dp[i]= Math.max(dp[i],dp[j]+1);
                }
            }
            if(dp[i] > maxlenght){
                maxlenght = dp[i];
            }
        }

        ArrayList<Integer> longestSubarray = new ArrayList<>();
        for(int i = n-1 ; i>=0;i--){
            if(dp[i] == maxlenght){
                longestSubarray.add(arr[i]);
                maxlenght--;
            }
        }
        System.out.print("chuoi con tang dai nhat la: ");
        for(int i = longestSubarray.size()-1 ; i>=0 ; i-- ){
            System.out.print(longestSubarray.get(i)+" ");
        }

    }
    public static void checkPhonenumber(Scanner sc){

        String phoneNumber;
        System.out.println("nhap so dien thoai :");
        phoneNumber = sc.nextLine();
        String regex = "^[0|+84|84]+[0-9]{3}[-.]?[0-9]{3}[-.]?[0-9]{3}$";
        if(phoneNumber.matches(regex)){
            System.out.println("Hợp lệ");
        }else {
            System.out.println("Không hợp lệ");
        }
    }
    public static void electricityRecept(Scanner sc){

        int sodien;

        while (true){
            System.out.println("nhạp vao so dien: ");
            sodien = sc.nextInt();

            if(sodien >= 0){
                break;
            }else {
                System.out.println("nhap lai gia dien: ");
            }
        }

        double sotien = 0;
        if(sodien >= 0 & sodien <= 50){
            sotien = sodien * 1000;
        } if(sodien >= 50 & sodien <= 100){
            sotien = sodien * 1200;
        } if(sodien >100){
            sotien = sodien * 1500;
        }

        System.out.println("so tien phai tra la: " +sotien+" VND");
    }
    public static void triangle(Scanner sc){
        int a,b,c;
        System.out.println("nhập a:");
        a = sc.nextInt();
        System.out.println("nhập b:");
        b = sc.nextInt();
        System.out.println("nhập c:");
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            }
            else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác cân.");
                }
            }
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Đây là tam giác vuông.");
            }
            else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh a, b, c không tạo thành tam giác.");
        }
    }
    public static int reverse(Scanner sc){
        System.out.println("nhap so can dao nguoc: ");
        int n = sc.nextInt();
        int temp = 0 ;
        while ( n != 0){
            temp = n%10 + temp*10;
            n /= 10;
        }
        return temp;
    }
    public static void convert(Scanner sc){
        System.out.println("nhap so can chuyen: ");
        int n = sc.nextInt();
        int bit[] = new int[20];
        int count = 0;
        while (n > 0){
            bit[count++] = n%2;
            n/=2;
        }
        for(int i = count-1 ; i>=0 ; i--){
            System.out.print(bit[i]);
        }
    }
    public  static void appear(Scanner sc){
        System.out.println("nhap chuoi: ");
        String s = sc.nextLine();
        s = s.toLowerCase().replace(" ", "");
        int n = s.length();
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=i+1;j<n;j++){
                if(s.charAt(i) == s.charAt(j)){
                    check = false;
                    break;
                }
            }
            if(check == true){
                int count = 0;
                for (int k = 0 ; k < n;k++){
                    if(s.charAt(i) == s.charAt(k)){
                        count++;
                    }
                }
                System.out.println("Ky tu " +s.toUpperCase().charAt(i)+" xuat hien "+count+" lan");
            }
        }
    }
    public  static void money(Scanner sc){
        System.out.println("nhap so tien:");
        int money = sc.nextInt();
        int count = 0 ;
        for(int i = 0 ; i < money/1000 ; i++ ){

            for(int j = 0 ; j < money/2000 ; j++){

                for(int k = 0 ; k < money/5000 ; k++){

                    if((i*1000)+(j*2000)+(k*5000) == money){
                        count++;
                        System.out.println(i+" * 1000, "+j+"*2000, "+k+"*5000");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

       do{
           System.out.println("+--------------------------------+");
           System.out.println("1. Tính tiền điện");
           System.out.println("2. Kiểm tra tam giác");
           System.out.println("3. Đảo ngược số nguyên");
           System.out.println("4. Đổi sang nhị phân");
           System.out.println("5. Dãy con lớn nhất");
           System.out.println("6. Tìm ký tự lặp");
           System.out.println("7. Chia tiền");
           System.out.println("8. Kiểm tra số điện thoại");
           System.out.println("9. Thoát");
           System.out.println("+--------------------------------+");
           System.out.println("Chọn chức năng: ");
           choice = sc.nextInt();

           switch (choice){
               case 1:
                   electricityRecept(sc);
                   break;
               case 2:
                   triangle(sc);
                   break;
               case 3:
                   reverse(sc);
                   break;
               case 4:
                   convert(sc);
                   break;
               case 5:
                   longestIncrease(sc);
                   break;
               case 6:
                   appear(sc);
                   break;
               case 7:
                   money(sc);
                   break;
               case 8:
                   checkPhonenumber(sc);
                   break;
               case 9:
                   break;
           }
       }while (choice != 9);
    }
}