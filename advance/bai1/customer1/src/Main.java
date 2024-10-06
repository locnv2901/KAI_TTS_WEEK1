import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException {

        ArrayList<Customer> customerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        int choice ;
        String id;
        do{
            System.out.println("----------Menu----------");
            System.out.println("1. Display customer list");
            System.out.println("2. Create customer");
            System.out.println("3. Update customer");
            System.out.println("4. Exit");
            System.out.println("------------------------");
            System.out.print("Select function: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    customer.displayCustomers(customerList);
                    break;
                case 2:
                    customer.insert(customerList);
                    break;
                case 3:
                    if(customerList.isEmpty()){
                        System.out.println("List is empty");
                    }else {
                        System.out.println("enter id customer who you want update");
                        sc.nextLine();
                        id = sc.nextLine();
                        customer.updateCustomer(customerList,id);
                    }
                    break;
                case 4:
                    if(customerList.isEmpty()){
                        System.out.println("List is empty");
                    }else {
                        System.out.println("enter id customer who you want remove");
                        sc.nextLine();
                        id = sc.nextLine();
                        customer.removeCustomer(customerList,id);
                    }
                    break;
                case 5:
                    System.out.println("close program");
                    break;
                default:
                    System.out.println("choose is not correct");
                    break;
            }
        }while (choice != 5);


    }
}