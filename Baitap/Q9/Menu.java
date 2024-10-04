package Baitap.Q9;
import Baitap.Q1.ElectricityBill;
import Baitap.Q2.Triangle;
import Baitap.Q3.IntegerReverse;
import Baitap.Q4.BinaryConvert;
import Baitap.Q5.IncreasingSubsequence;
import Baitap.Q6.CharCount;
import Baitap.Q7.Monney;
import Baitap.Q8.PhoneNumberCheck;
import java.util.*;
public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public int input(){
        while (true) { 
            try {
                int number = sc.nextInt();
                if(number < 0 || number >9){
                    System.err.println("Input must be a integer larger than 0 and smaller than 9!");
                    System.out.println(" Please enter again!");
                    
                }else{
                    return number;
                }
            } catch (Exception e) {
                System.err.println("Input must be a integer!");
                System.out.println(" Please enter again!");
                sc.next();
            }
            
        }
        
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        while (true) { 
            Menu m = new Menu();
        System.out.println("-----------------------------------------------------");
        System.out.println("Chose one option:");
        System.out.println("1. Tính tiền điện");
        System.out.println("2. Kiểm tra tam giác");
        System.out.println("3. Đảo ngược số nguyên");
        System.out.println("4. Đổi sang nhị phân");
        System.out.println("5. Dãy con lớn nhất");
        System.out.println("6. Tìm ký tự lặp");
        System.out.println("7. Chia tiền");
        System.out.println("8. Kiểm tra số điện thoại");
        System.out.println("9. Thoát");
        int choice = m.input();
        switch (choice) {
            case 1 -> {
                ElectricityBill c = new ElectricityBill();
                c.run();
                }
            case 2 -> {
                Triangle t = new Triangle();
                t.run();
                }
            case 3 -> {
                IntegerReverse i = new IntegerReverse();
                i.run();
                }
            case 4 -> {
                BinaryConvert b = new BinaryConvert();
                b.run();
                }
            case 5 -> {
                IncreasingSubsequence i2 = new IncreasingSubsequence();
                i2.run();
                }
            case 6 -> {
                CharCount c2 = new CharCount();
                c2.wordCount(c2.input());
                }
            case 7 -> {
                Monney m2 = new Monney();
                m2.cashCount(m2.input());
                }
            case 8 -> {
                PhoneNumberCheck p = new PhoneNumberCheck();
                p.checkPhoneNumber();
                }
            case 9 -> {
                return;
                }
            default -> throw new AssertionError();
        }
        }
        
    }
}
