package KAI_TTS_WEEK1.Bai8;

import java.util.Scanner;

/**
 * Bai8
 */
public class Bai8 {


    // Hàm kiểm tra số điện thoại hợp lệ sử dụng Regex
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy để kiểm tra số điện thoại
        String regex = "^(0|\\+84|84)[1-9]{1}\\d{8}$";
        
        // Kiểm tra chuỗi với Regex
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter phone number : ");
                String phoneNumber = scanner.nextLine();
        
                
                if (isValidPhoneNumber(phoneNumber)) {
                    System.out.println("phone number valid");
                    break;
                } else {
                    System.out.println("Phone number not valid. Please enter again !");
                   
                }
        
               
            } catch (Exception e) {
                e.printStackTrace(); 
               
                scanner.nextLine();

            }
        }

    }

    
}