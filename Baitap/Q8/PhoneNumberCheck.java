package Baitap.Q8;
import java.util.*;

public class PhoneNumberCheck {
    public static Scanner sc = new Scanner(System.in);
    public void checkPhoneNumber(){
        System.out.println("Enter your phone number:");
        String phoneNumber = sc.next();
        if(phoneNumber.matches("^(\\+84|0|84)[0-9]{3}[-\\.]?[0-9]{3}[-\\.]?[0-9]{3}$")){
            System.out.println("This is a phone number!");
        }else{
            System.out.println("This is not a phone number!");
        }
    }
public static void main(String[] args) {
    PhoneNumberCheck p = new PhoneNumberCheck();
    p.checkPhoneNumber();
}
}
