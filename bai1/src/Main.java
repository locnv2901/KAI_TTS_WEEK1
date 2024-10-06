import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sodien;

        while (true){
            System.out.println("nhap vao so dien: ");
            sodien = sc.nextInt();

            if(sodien >= 0){
                break;
            }else {
                System.out.println("nhap lai so dien > 0!");
            }
        }

        double sotien = 0;
        if(sodien >= 0 & sodien <= 50){
            sotien = sodien * 1000;
        } if(sodien >= 50 & sodien <= 100){
            sotien = (50 * 1000) + ((sodien-50)*1200) ;
        } if(sodien >100){
            sotien = (50 * 1000) + (50*1200) + ((sodien-100)*1500);
        }

        System.out.println("so tien phai tra la : " +sotien+" VND");
    }
}