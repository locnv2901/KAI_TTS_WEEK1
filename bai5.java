import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        dayConTang(a);
    }

    public static void dayConTang(int[] a) {

        int n = a.length;
        int max = 0;
        int[] l = new int[n];
        Arrays.fill(l, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((a[i] > a[j])) {
                    l[i] = Math.max(l[i], l[j] + 1);
                }
            }
            if (max < l[i]) {
                max = l[i];
            }
        }
        ArrayList<Integer> m = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (l[i] == max) {
                m.add(a[i]);
                max--;
            }
        }
        for (int i = m.size()-1 ; i>=0 ;i--){
            System.out.println(m.get(i));
        }
    }
}
