package E2;

import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        checkTriangle();
    }
    
    public static void checkTriangle(){
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        while(true){
            try{
                System.out.print("nhap vao 3 so nguyen duong: ");
                a=scanner.nextInt();
                b=scanner.nextInt();
                c=scanner.nextInt();
                if(a>=0 && b>=0 &&c>=0) break;
            }
            catch(Exception e){
                scanner.next();
            }
            System.out.println("nhap sai yeu cau nhap lai");
        }
        if(a+b>c && a+c>b && b+c>a){
            
            if(checkIsoscelesTriangle(a, b, c)){
                if(checkRightTrialgle(a, b, c)){
                    System.out.println("la tam giac vuong can");
                }
                else if(checkEquilateralTriangle(a, b, c)){
                    System.out.println("la tam giac deu");
                }
                else{
                    System.out.println("la tam giac can");
                }
            }
            else if(checkRightTrialgle(a, b, c)){
                System.out.println("la tam giac vuong");
            }
            else{
                System.out.println("la tam giac ");
            }
            
            
        }
        else{
            System.out.println("khong phai tam giac");
        }
    }
    public static boolean checkRightTrialgle(int a, int b , int c){
        int a1=a*a;
        int b1=b*b;
        int c1=c*c;
        if(a1+b1==c1|| a1+c1==b1 || b1+c1==a1){
            return true;
        }
        return false;
    }
    public static boolean checkIsoscelesTriangle(int a, int b , int c){
        if(a==b||a==c||b==c){
            return true;
        }
        return false;
    }
    public static boolean checkEquilateralTriangle(int a,int b, int c){
        if(a==b &&a ==c){
            return true;
        }
        return false;
    }
    
}
