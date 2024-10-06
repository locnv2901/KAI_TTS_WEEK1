public class Main {

    public static void convert(int n){
        int bit[] = new int[20];
        int count = 0;
        while (n > 0){
            bit[count++] = n%2;
            n/=2;
        }
        for(int i = count-1 ; i>=0 ; i--){
            System.out.print(bit[i]);
        }
    }

    public static void main(String[] args) {

        convert(8);
    }
}