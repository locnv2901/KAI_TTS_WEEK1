import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = -1;
        b = -1;
        c = -1;
//        while (a < 0 || b < 0 || c < 0) {
//            System.out.println("Nhập 3 số nguyên dương a, b, c: ");
//            if (scanner.hasNextInt()) {
//                a = scanner.nextInt();
//                b = scanner.nextInt();
//                c = scanner.nextInt();
//                if (a < 0 || b < 0 || c < 0) {
//                    System.out.println("3 số không được âm. Vui lòng nhập lại.");
//                }
//            } else {
//                System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập lại.");
//                scanner.next();
//            }
//        }
        while (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Nhập 3 số nguyên dương a, b, c: ");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a <= 0) {
                    System.out.println("Số a phải là số nguyên dương. Vui lòng nhập lại.");
                    continue;
                }
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    if (b <= 0) {
                        System.out.println("Số b phải là số nguyên dương. Vui lòng nhập lại.");
                        continue;
                    }
                    if (scanner.hasNextInt()) {
                        c = scanner.nextInt();
                        if (c <= 0) {
                            System.out.println("Số c phải là số nguyên dương. Vui lòng nhập lại.");
                        }
                    } else {
                        System.out.println("Dữ liệu nhập không hợp lệ cho c. Vui lòng nhập lại.");
                        scanner.next();
                        c = -1;
                    }
                } else {
                    System.out.println("Dữ liệu nhập không hợp lệ cho b. Vui lòng nhập lại.");
                    scanner.next();
                    b = -1;
                }
            } else {
                System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
        }
        xacDinhTamGiac(a,b,c);

    }

    public static void xacDinhTamGiac(int a, int b, int c) {
        boolean b1 = (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2));
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c && c == a) {
                System.out.println("Tam giác là tam giác đều");
            } else if (a == b || b == c || c == a) {
                if (b1) {
                    System.out.println("Tam giác là tam giác vuông cân");
                } else {
                    System.out.println("Tam giác là tam giác cân");
                }
            } else if (b1) {
                System.out.println("Tam giác là tam giác vuông");
            }
        } else {
            System.out.printf("3 cạnh a = %d, b = %d, c = %d không tạo thành 1 tam giác", a, b, c);
        }
    }
}
