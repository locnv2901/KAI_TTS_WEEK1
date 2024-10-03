package Bai5;

import java.util.Scanner;

import static Bai2.Bai2.checkNumber;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());

        n= checkNumber(n);

        int[] array = new int[n];

        for (int i = 0; i< n; i++){
            System.out.print("A["+ i +"] :");
            array[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Array: {");
        for (int i = 0; i < n; i++){
            if (i < n - 1){
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "}");
            }
        }
    }
}
