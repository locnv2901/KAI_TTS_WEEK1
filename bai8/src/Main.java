import java.util.Scanner;

public class Main {

    public static boolean checkPhonenumber(String n){
        String regex = "^[0|+84|84]+[0-9]{3}[-.]?[0-9]{3}[-.]?[0-9]{3}$";
        return n.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        System.out.println("nhap so dien thoai :");
        phoneNumber = sc.nextLine();
        if(checkPhonenumber(phoneNumber)){
            System.out.println("Hợp lệ");
        }else {
            System.out.println("Không hợp lệ");
        }
    }
}