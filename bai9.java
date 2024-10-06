import java.util.*;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("+ + +");
            System.out.println("1. Tính tiền điện");
            System.out.println("2. Kiểm tra tam giác");
            System.out.println("3. Đảo ngược số nguyên");
            System.out.println("4. Đổi sang nhị phân");
            System.out.println("5. Dãy con lớn nhất");
            System.out.println("6. Tìm ký tự lặp");
            System.out.println("7. Chia tiền");
            System.out.println("8. Kiểm tra số điện thoại");
            System.out.println("9. Thoát");
            System.out.println("+ + +");
            System.out.print("Chọn chức năng: ");

            // Nhập lựa chọn từ người dùng
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double soDien = -1;

                    while (soDien < 0) {
                        System.out.print("Nhập số điện sử dụng trong tháng: ");
                        if (scanner.hasNextDouble()) {
                            soDien = scanner.nextDouble();
                            if (soDien < 0) {
                                System.out.println("Số điện không được âm. Vui lòng nhập lại.");
                            }
                        } else {
                            System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập lại.");
                            scanner.next();
                        }
                    }
                    double tienPhaiTra = tinhTienDien(soDien);
                    System.out.printf("Số tiền cần phải trả là: %.2f VNĐ%n", tienPhaiTra);
                    break;
                case 2:
                    int a, b, c;
                    a = -1;
                    b = -1;
                    c = -1;
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
                    break;
                case 3:
                    System.out.println("Nhập số nguyên n: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Bạn đã nhập sai dữ liệu. Xin mời nhập lại.");
                        scanner.next();
                    }
                    int h = scanner.nextInt();
                    System.out.printf("Đảo ngược của số %d là %d", h, daoNguocSo(h));
                    break;
                case 4:
                    System.out.println("Nhập số nguyên n: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Nhập sai dữ liệu. Xin mời nhập lại");
                        scanner.next();
                    }
                    int g = scanner.nextInt();
                    System.out.printf("Số nhị phân của số %d là %s", g, nSangNhiPhan(g));

                    break;
                case 5:
                    System.out.println("Nhập số phần tử mảng: ");
                    int n = scanner.nextInt();
                    int[] q = new int[n];
                    System.out.println("Nhập mảng: ");
                    for (int i = 0; i < q.length; i++) {
                        q[i] = scanner.nextInt();
                    }
                    System.out.println("Mảng vừa nhập là: ");
                    for (int e : q) {
                        System.out.print(e + " ");
                    }
                    System.out.println();
                    dayConTang(q);
                    break;
                case 6:
                    System.out.println("Nhập chuỗi: ");
                    String s = scanner.nextLine();
                    lapKiTu(s);
                    break;
                case 7:

                    System.out.print("Nhập số tiền cần đạt: ");
                    int targetAmount = scanner.nextInt();

                    timPhuonAn(targetAmount);

                    scanner.close();
                    break;
                case 8:
                    // Nhập chuỗi từ bàn phím
                    System.out.print("Nhập số điện thoại: ");
                    String phoneNumber = scanner.nextLine();

                    // Kiểm tra số điện thoại
                    if (isValidPhoneNumber(phoneNumber)) {
                        System.out.println("Số điện thoại hợp lệ.");
                    } else {
                        System.out.println("Số điện thoại không hợp lệ.");
                    }

                    scanner.close();
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
            System.out.println(); // Dòng trống để dễ đọc
        } while (choice != 9);

        scanner.close();
    }
    public static double tinhTienDien(double soDien) {
        double tien = 0;

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else if (soDien <= 100) {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        } else {
            tien = 50 * 1000 + 50 * 1200 + (soDien - 100) * 1500;
        }
        return tien;
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
    public static int daoNguocSo(int n) {
        int temp;
        int daoNguoc = 0;
        while (n > 0) {
            temp = n % 10;
            daoNguoc = daoNguoc * 10 + temp;
            n = n / 10;
        }
        return daoNguoc;
    }
    public static String nSangNhiPhan(int n) {
        StringBuilder temp = new StringBuilder();
        while (n > 0) {
            temp.append(n % 2);
            n = n / 2;
        }
        return temp.reverse().toString();
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
    public static void lapKiTu(String string) {
        Map<Character, Integer> charCout = new HashMap<>();
        for (char ch : string.toCharArray()) {
            char kiTu = Character.toLowerCase(ch);
            if (kiTu != ' ') {
                charCout.put(kiTu, charCout.getOrDefault(kiTu, 0) + 1);
            }
        }

        System.out.println("Các kí từ bị lặp và số lần lặp : ");
        for (Map.Entry<Character, Integer> s : charCout.entrySet()) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " : " + s.getValue() + " ;");
            }
        }
    }
    public static void timPhuonAn(int targetAmount) {
        int count = 1; // Đếm số phương án
        for (int x = 0; x <= targetAmount / 1000; x++) { // số tờ 1000đ
            for (int y = 0; y <= targetAmount / 2000; y++) { // số tờ 2000đ
                for (int z = 0; z <= targetAmount / 5000; z++) { // số tờ 5000đ
                    if (x * 1000 + y * 2000 + z * 5000 == targetAmount) {
                        System.out.printf("PA %d (%d * 1000đ; %d * 2000đ; %d * 5000đ)%n", count, x, y, z);
                        count++;
                    }
                }
            }
        }
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy đơn giản
        String regex = "^(0\\d{8}|\\+84\\d{9}|84\\d{9}|0\\d{3}[-.]\\d{3}[-.]\\d{3})$";
        return phoneNumber.matches(regex);
    }
}
