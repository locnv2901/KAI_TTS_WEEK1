package com.lamdangfixbug.ex8;

import com.lamdangfixbug.utils.Utils;

import java.util.regex.*;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        getPhoneNumberAndCheck();
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replace(".", "").replace("-", "");
        phoneNumber = phoneNumber.replace("+84", "0");
        if(phoneNumber.length() != 10 || !phoneNumber.startsWith("0")) return false;
        String validChars = "0123456789";
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!validChars.contains(phoneNumber.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }

    public static void getPhoneNumberAndCheck(){
        String phoneNumber = Utils.repeatInputWhenInvalid("Enter a phone number: ");
        System.out.printf("%s is %s a phone number.\n",phoneNumber,checkPhoneNumber(phoneNumber)?"":"not");
    }
}
