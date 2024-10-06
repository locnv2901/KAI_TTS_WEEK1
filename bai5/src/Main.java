import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void insertArr(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang a");
        for( int i = 0 ;i<n ; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public static void longestIncrease(int[] arr , int n ){
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

        for(int i = longestSubarray.size()-1 ; i>=0 ; i-- ){
            System.out.print(longestSubarray.get(i)+" ");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap do dai");
//        int n = sc.nextInt();
//        while (n <= 0){
//            System.out.println("nhap so lon hon 0");
//            n = sc.nextInt();
//        }
//        int[] a = new int[n];
//        insertArr(a, n);
        int[] a = {10, 22, 9, 33, 21, 51, 41, 60, 80};
        System.out.println("mảng con tăng dài nhất là: ");
        longestIncrease(a,9);



    }
}