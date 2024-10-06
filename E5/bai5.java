package E5;

import java.util.Scanner;

public class bai5 {
    public static void longestArray(){
        Scanner scanner=new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("nhap vao so nguyen lon hon 0 : ");
                number=scanner.nextInt();
                if(number>0) break;
            } catch (Exception e) {
                // TODO: handle exception
                scanner.next();
            }
            System.out.println("nhap lai");
        }
        int index=0;
        int max=0;
        int [] arr=new int[number];
        for (int i = 0; i < number; i++) {
            
            arr[i] = scanner.nextInt();
        }
        int element=arr[0];
        for(int i=0;i<number;i++){
           if(arr[i]<=element){
            element=arr[i];
            int temp=0;
            int temp1=arr[i];
            for(int j=i;j<number;j++){
                
                if(temp1<arr[j]){
                    temp++;
                    temp1=arr[j];
                }
            }   
            if(temp>max){
                max=temp;
                index=i;
                
            }   
           }
        }
      
     
        int temp1=arr[index];
        System.out.print(arr[index]);
        for(int i=index+1;i<number;i++){
            if(temp1<arr[i]){
                
                temp1=arr[i];
                System.out.print(arr[i]+" ");
            }
            
        }
    
    }
    public static void main(String[] args) {
        longestArray();
    }
}
