package KAI_TTS_WEEK1.Bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai5 {
    public static List<Integer> IncreaseArr(int[] a){
        int i = 1;
        int k = 0;
        while(i< a.length-1){
            if(a[k] < a[i]){
                a[k+1] = a[i];
                k++;
            }
            i++;
           
        }
        List<Integer> arr = new ArrayList<>();
        for(int j = 0;j< k+1;j++){
            arr.add(a[j]);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            List<Integer> arr = new ArrayList<>();
            System.out.print("Size Array : ");
            int size = scanner.nextInt();
            
            int[] a = new int[size];
    
            System.out.println("Enter Array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter num array " + (i + 1) + ": ");
                a[i] = scanner.nextInt(); // Đọc số từ bàn phím và lưu vào mảng
            }
            System.out.println("Init Array :" + Arrays.toString(a));
            arr = IncreaseArr(a);
            System.out.println("result :" + arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
