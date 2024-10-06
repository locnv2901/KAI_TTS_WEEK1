public class Main {

    public static int reverse(int n){
        int temp = 0 ;
        while ( n != 0){
            temp = n%10 + temp*10;
            n /= 10;
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));

    }
}