package KAI_TTS_WEEK1.Bai8;

import java.util.Scanner;

/**
 * Bai8
 */
public class Bai8 {


  
    public static boolean isValidPhoneNum(String phoneNum) {
    
        String regex = "^(0|\\+84|84)[1-9]{1}\\d{2}[-\\.]?\\d{3}[-\\.]?\\d{3}$";
        
      
        return phoneNum.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter phone number : ");
                String phoneNum = scanner.nextLine();
        
                
                if (isValidPhoneNum(phoneNum)) {
                    System.out.println("phone number valid");
                    break;
                } else {
                    System.out.println("Phone number not valid. Please enter again !");
                   
                }
        
               
            } catch (Exception e) {
                System.out.println("Error . Please enter phone number again");
               
                scanner.nextLine();

            }
        }

    }

    
}