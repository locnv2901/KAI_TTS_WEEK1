package Baitap.Q6;
import java.util.*;

public class CharCount {
    public static Scanner sc = new Scanner(System.in);
    public String input(){
        System.out.println("Enter your String:");
        String inputString = sc.nextLine();
        inputString = inputString.toLowerCase();      
        inputString = inputString.replaceAll(" ", "");
        inputString = inputString.replaceAll("[^a-z]", "");
        return inputString;
    }

    public void wordCount(String inputString){
        List<String> charArr = new ArrayList<String>();
        List<Integer> count = new ArrayList<Integer>();
        
        for (int i = 0; i < inputString.length(); i++) {
            String s = String.valueOf(inputString.charAt(i));
            boolean check = false;
            for (int j = 0; j < charArr.size(); j++) {
                if(s.equals(charArr.get(j))){
                    count.set(j, count.get(j)+1);
                    check = true;
                }
            }
            if(check == false){
                charArr.add(s);
                count.add(1);
            }
        }
        for (int i = 0; i < charArr.size(); i++) {
            if(i==0){
                System.out.print(charArr.get(i)+" : "+count.get(i)+"; ");
            }else{
                System.out.print(charArr.get(i)+" : "+count.get(i)+";");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CharCount c = new CharCount();
        c.wordCount(c.input());
    }
    
}
