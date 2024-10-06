import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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
}