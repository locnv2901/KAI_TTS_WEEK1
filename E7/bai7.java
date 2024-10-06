package E7;

public class bai7 {
    public static void amountBill(){
        int target=100000;
        for (int num1000 = 0; num1000 <= target / 1000; num1000++) {
            for (int num2000 = 0; num2000 <= target / 2000; num2000++) {
                for (int num5000 = 0; num5000 <= target / 5000; num5000++) {
                
                    int total = num1000 * 1000 + num2000 * 2000 + num5000 * 5000;

         
                    if (total == target) {
                      
                        System.out.println("PA " + " (so to 1000: " + num1000 +
                                           ", so to 2000: " + num2000 +
                                           ", so to 5000: " + num5000 + ")");
                        
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        amountBill();
    }
}