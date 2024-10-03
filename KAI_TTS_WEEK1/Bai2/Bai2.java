package KAI_TTS_WEEK1.Bai2;
import java.util.Scanner;
/**
 * Bai2
 */
public class Bai2 {
    public static void Triangle(int a,int b,int c){
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("tam giac deu.");
            } else if (a == b || b == c || a == c) {
                if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                    System.out.println("tam giac vuong can");
                } else {
                    System.out.println("tam giac can");
                }
            } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println("tam giac vuong");
            } else {
                System.out.println("tam giac thuong");
            }
        } else {
            System.out.println("khong phai tam giacs");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                System.out.print("c: ");
                int c = scanner.nextInt();
            
                Triangle(a, b, c);
                break;
            } catch (Exception e) {
                System.err.println("Error.Please enter again");
                scanner.nextLine();
            }
           
        }
        
    }

}
    
