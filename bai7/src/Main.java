import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien:");
        int money = sc.nextInt();
        int count = 0 ;
        for(int i = 0 ; i < money/1000 ; i++ ){

            for(int j = 0 ; j < money/2000 ; j++){

                for(int k = 0 ; k < money/5000 ; k++){

                    if((i*1000)+(j*2000)+(k*5000) == money){
                        count++;
                        System.out.println(i+" * 1000, "+j+"*2000, "+k+"*5000");
                    }
                }
            }
        }
    }
}