package E9;
import java.util.Scanner;

import E1.*;
import E2.*;
import E3.*;
import E4.*;
import E5.*;
import E6.*;
import E7.*;
import E8.*;
public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+ +");
            System.out.println("1.tinh tien dien");
            System.out.println("2. kiem tra tam giac");
            System.out.println("3. dao nguoc so nguyen");
            System.out.println("4. doi sang nhi phan");
            System.out.println("5. day con lon nhat");
            System.out.println("6. tim ky tu lap");
            System.out.println("7. chia tien");
            System.out.println("8. kiem tra so dien thoai");
            System.out.println("9. thoat");
            System.out.print("chon chuc nang: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bai1.electricBill();
                    break;
                case 2:
                    bai2.checkTriangle();
                    break;
                case 3:
                    bai3.reverseInt();
                    break;
                case 4:
                    bai4.convertBinary();
                    break;
                case 5:
                    
                    break;
                case 6:
                    bai6.countChar();
                    break;
                case 7:
                    bai7.amountBill();
                    break;
                case 8:
                    bai8.phoneNumberValidate();
                    break;
                case 9:
                    System.out.println("thoat chuong trinh.");
                    break;
                default:
                    System.out.println("lua chon khong hop le vui long chon lai.");
            }

            System.out.println(); 

        } while (choice != 9);
    }
}
