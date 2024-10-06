import java.util.Locale;
import java.util.Scanner;

public class Main {

    public  static void appearDoubleCharacter(String s){
        s = s.toLowerCase().replace(" ", "");
        int n = s.length();
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=i+1;j<n;j++){
                if(s.charAt(i) == s.charAt(j)){
                    check = false;
                    break;
                }
            }
            if(check == true){
                int count = 0;
                for (int k = 0 ; k < n;k++){
                    if(s.charAt(i) == s.charAt(k)){
                        count++;
                    }
                }
                System.out.println("Ky tu " +s.toUpperCase().charAt(i)+" xuat hien "+count+" lan");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        System.out.println("nhap chuoi: ");
        s=sc.nextLine();
        appearDoubleCharacter(s);
    }
}