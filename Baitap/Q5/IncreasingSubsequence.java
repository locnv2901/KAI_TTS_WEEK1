package Baitap.Q5;
import java.util.*;

public class IncreasingSubsequence {
    public static Scanner sc = new Scanner(System.in);
    public int input(){
        while (true) { 
            try {
                int number = sc.nextInt();
                if(number <0){
                    System.err.println("Input must be a integer larger than 0!");
                    System.out.println(" Please enter again!");
                    
                }else{
                    return number;
                }
            } catch (Exception e) {
                System.err.println("Input must be a integer!");
                System.out.println(" Please enter again!");
                sc.next();
            }
            
        }
        
    }

    public int[] array(int n){
        int[] array = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            System.out.println("Array["+i+"]");
            array[i] = input();
        }
        return array;
    }

    public void findLongestIncreasingArray(int[] array){
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
                ArrayList<Integer> list1 = new ArrayList<>();
                int minNum=-1;
                for (int j = i; j < array.length; j++) {
                    
                    if(array[j] >= minNum){
                        list1.add(array[j]);
                        minNum = array[j];
                    }
                }
               
                if(list1.size()>list.size()){
                    list.clear();
                    for(int j = 0; j < list1.size(); j++) {
                        list.add(list1.get(j));
                    }
                    
                }
            
           
        }
        System.out.println("Longest Increasing Array is:");
        for (int i = 0; i < list.size(); i++) {
            if(i==0){
                System.out.print("{"+list.get(i));
            }else if( i == list.size() - 1){
                System.out.println(", "+list.get(i)+"}");
            }else{
                System.out.print(", "+list.get(i));
            }
            
        }
        
    }

    public void run(){
        System.out.println("Enter array length:");
        int[] array = array(input());
        findLongestIncreasingArray(array);
    }
    public static void main(String[] args) {
        IncreasingSubsequence i = new IncreasingSubsequence();
        i.run();
    }
}
