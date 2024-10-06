package E1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        electricBill();
    }   
    public static void electricBill(){
        Scanner scanner=new Scanner(System.in);
        int electricNum;
        int price;
        while (true) {
            try {
                System.out.println("nhap so nguyen duong:");
                electricNum=scanner.nextInt();
                if(electricNum>=0) break;
            } catch (Exception e) {
                
                scanner.next();
            }
            System.out.println("nhap sai");
                        
        }
        if(electricNum>=0 && electricNum<=50){
            price=electricNum*1000;
        }
        else if (electricNum>50 && electricNum<=100) {
            price=electricNum*1200;
        } else {
            price=electricNum*1500;
        }
        System.out.println("gia tien dien la :"+price);
    }
}
