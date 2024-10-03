package Bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Bai2.Bai2.checkNumber;
import static Bai2.Bai2.checkTriangle;
import static Bai3.Bai3.reserveNumber;
import static Bai4.Bai4.convertBinary;
import static Bai7.Bai7.divideMoney;
import static Bai8.Bai8.isPhone;

public class Bai9 {
    static Scanner scanner = new Scanner(System.in);

    public static void bai1(){
        int electric, price=0;
        System.out.println("Enter electric: ");
        electric = Integer.parseInt(scanner.nextLine());
        electric = checkNumber(electric);
        if (electric >0 && electric <=50){
            price = electric * 1000;
        }
        if (electric >50){
            price = electric * 1200;
            if (electric > 100){
                price = electric * 1500;
            }
        }
        System.out.println("Price : " + price);
    }

    public static void bai2(){
        System.out.println("Enter a: ");
        int a= Integer.parseInt(scanner.nextLine());
        a = checkNumber(a);

        System.out.println("Enter b: ");
        int b= Integer.parseInt(scanner.nextLine());
        b= checkNumber(b);

        System.out.println("Enter c: ");
        int c= Integer.parseInt(scanner.nextLine());
        c= checkNumber(c);

        checkTriangle(a,b,c);
    }

    public static void bai3(){
        System.out.println("Enter number:");
        int number = Integer.parseInt(scanner.nextLine());
        number= checkNumber(number);
        reserveNumber(number);
    }

    public static void bai4(){
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());
        n= checkNumber(n);

        convertBinary(n);
    }

    public static void bai5(){
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

    public static void bai6(){
        System.out.println("Enter s: ");
        String s = scanner.nextLine();
        s = s.toLowerCase().replaceAll("[.\\s]","");

        char[] S = s.toCharArray();

        Map<Character, Integer> elementCountMap= new HashMap<>();

        for (char words: S) {
            elementCountMap.put(words, elementCountMap.getOrDefault(words,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: elementCountMap.entrySet()) {
                System.out.print(entry.getKey() + " : " + entry.getValue() + "\t");
        }
    }

    public static void bai7(){
        int divPrice;
        System.out.println("Enter price:");
        divPrice = Integer.parseInt(scanner.nextLine());
        divPrice = checkNumber(divPrice);

        divideMoney(divPrice);
    }

    public static void bai8(){
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        while (!isPhone(phone)){
            System.err.println("Invalid phone number!");
            System.out.println("Re-enter phone:");
            phone = scanner.nextLine();
        }

        System.out.println("Phone number " + phone + " is valid");
    }

    public static void showMenu(){
        System.out.println("\nChoose function:");
        System.out.println("1. Calculate electricity");
        System.out.println("2. Check triangle");
        System.out.println("3. Reverse integer");
        System.out.println("4. Convert to binary");
        System.out.println("5. Largest subsequence");
        System.out.println("6. Find repeating character");
        System.out.println("7. Divide money");
        System.out.println("8. Check phone number");
        System.out.println("9. Exit");
    }

    public static void main(String[] args) {
        do{
            showMenu();
            System.out.println("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            choice = checkNumber(choice);
            switch (choice){
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai5();
                    break;
                case 6:
                    bai6();
                    break;
                case 7:
                    bai7();
                    break;
                case 8:
                    bai8();
                    break;
                case 9:
                    System.out.println("Thank you!!");
                    return;
                default:
                    System.err.println("Enter wrong!!");
            }
        }while (true);



    }
}
