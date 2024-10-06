package E3;
import java.util.Scanner;
public class bai3 {
    public static int reverseInt(){
        Scanner scanner=new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("nhap so nguyen : ");
                number=scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.next();
            }
            System.out.println("nhap sai phai nhap lai");
        }
        int reseverNumber=0;
        while(number!=0){
            int lastDigit=number%10;
            number/=10;
            reseverNumber=reseverNumber * 10 + lastDigit;
        }
        return reseverNumber;

    }
    public static void main(String[] args) {
        System.out.println("so dao nguoc la : "+ reverseInt());
    }
}
