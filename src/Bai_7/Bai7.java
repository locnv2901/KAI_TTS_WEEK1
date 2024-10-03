package Bai_7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        chiaTien();
    }

    public static void chiaTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien can dat duoc (VND): ");
        int target = scanner.nextInt();
        if(target<1000){
            System.out.println("So tien dat duoc phai >= 1000 VND");
            return;
        }
        int maxCount1000 = target / 1000;
        int maxCount2000 = target / 2000;
        int maxCount5000 = target / 5000;

        int count = 1;

        for (int count1000 = 0; count1000 <= maxCount1000; count1000++) {
            for (int count2000 = 0; count2000 <= maxCount2000; count2000++) {
                for (int count5000 = 0; count5000 <= maxCount5000; count5000++) {
                    int total = count1000 * 1000 + count2000 * 2000 + count5000 * 5000;
                    if (total == target) {
                        System.out.printf("Cach %d: %d to 1000d, %d to 2000d, %d to 5000d\n",
                                count, count1000, count2000, count5000);
                        count++;
                    }
                }
            }
        }
    }
}
