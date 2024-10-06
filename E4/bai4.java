package E4;

import java.util.Scanner;

public class bai4 {
    
    public static void convertBinary(){
        Scanner scanner=new Scanner(System.in);
        int number;
        while(true){
            try {
                
                System.out.println("nhap 1 so nguyen duong: ");
                number=scanner.nextInt();
                if(number>=0){
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
                scanner.next();
            }
            System.out.println("nhap lai");

        }
        String binary="";
        while(number!=0){
            binary+=number%2;
            number/=2;
        }
        for(int i=binary.length()-1;i>=0;i--){
            System.out.print(binary.charAt(i));
        }
    }
    public static void main(String[] args) {
        convertBinary();
    }
}
