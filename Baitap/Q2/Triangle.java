package Baitap.Q2;
import java.util.*;;
public class Triangle {
    public static Scanner sc = new Scanner(System.in);
    public double input(){
        while (true) { 
            try {
                double number = sc.nextDouble();
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

    public double[] egde(){
        double[] egde = new double[3];
        for (int i = 0; i < egde.length; i++) {
            System.out.println("Enter the "+(i+1)+" egde:");
            egde[i] = input();
        }
        return egde;
    }

    public void sort(double[] egde){
        double temp;
        for (int i = 0; i < egde.length - 1; i++) {
           for (int j = 1; j < egde.length; j++) {
                if(egde[j] < egde[j-1]){
                    temp = egde[j];
                    egde[j] = egde[j-1];
                    egde[j-1] = temp;
                }
           }
        }
    }
    public void trianger_type(double[] egde){
        // Sap xep lai 3 canh tu be den lon
        sort(egde);

        if((egde[0] + egde[1]) < egde[2]){
            System.out.println("This is not a triangle!");
        }
        else if(egde[0] == egde[1]){
            if( (Math.pow(egde[0],2) + Math.pow(egde[1],2)) == Math.pow(egde[2], 2) ){
                System.out.println("This is a isosceles right triangle!");
            }
            else if (egde[0] == egde[1] && egde[1] == egde[2]) {
                System.out.println("This is a equilateral triangle!");
            }
            else{
                System.out.println("This is a isosceles triangle!");
            }
        }
        else if ((Math.pow(egde[0],2) + Math.pow(egde[1],2)) == Math.pow(egde[2], 2)) {
            System.out.println("This is a right triangle!");
        }
        else{
            System.out.println("This is a normal triangle!");
        }    
    }

    public void run(){
        // Dien 3 canh cua tam giac
        double[] egde = egde();
        // Xac dinh xem tam giac day la tam giac gi
        trianger_type(egde);
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.run();
    }
}
