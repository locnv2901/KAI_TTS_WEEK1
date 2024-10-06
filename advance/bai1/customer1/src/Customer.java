import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Customer {

    private String id;
    private String name;
    private String type;
    private String address;
    private String email;
    private Date timeUpdate;

    public Customer() {
    }

    public Customer(String id, String name, String type, String address, String email, Date timeUpdate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.email = email;
        this.timeUpdate = timeUpdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public void insert(ArrayList<Customer> customers){
        String dateTime ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter customer id:");
        id = sc.nextLine();
        if(id.isEmpty()){
            System.out.println("customer id can't be empty");
            return;
        } else {
            for(Customer customer : customers){
                if(customer.getId().equals(id)){
                    System.out.println("customer is existed");
                    return;
                }
            }
        }
        System.out.println("enter customer name:");
        name = sc.nextLine();
        System.out.println("enter customer type:");
        type = sc.nextLine();
        System.out.println("enter customer address:");
        address = sc.nextLine();
        System.out.println("enter customer email:");
        email = sc.nextLine();
        customers.add(new Customer(id,name,type,address,email,timeUpdate));
        System.out.println("insert success !");
    }

    public void displayCustomers(ArrayList<Customer> customers){
        if(customers.isEmpty()){
            System.out.println("list is empty");
        }else {
            System.out.println("Id----Name----Type----Address----Email----Time update");
            for (Customer customer : customers){
                System.out.println(customer.getId()+"    "+ customer.getName() +"    "+ customer.getType() +"    "
                                   +customer.getAddress() +"    "+ customer.getEmail()+"    "+customer.getTimeUpdate());
            }
        }
    }

    public void updateCustomer(ArrayList<Customer> customers , String id){
        for(Customer customer : customers){
            if (customer.getId().equals(id)){
                Scanner sc = new Scanner(System.in);

                System.out.println("enter new customer name ");
                String newName = sc.nextLine();
                customer.setName(newName);

                System.out.println("enter new customer address ");
                String newAddress = sc.nextLine();
                customer.setAddress(newAddress);

                System.out.println("enter new customer type ");
                String newTpye = sc.nextLine();
                customer.setType(newTpye);

                System.out.println("enter new customer email ");
                String newEmail = sc.nextLine();
                customer.setEmail(newEmail);

                System.out.println("enter time update (dd/mm/yyyy)");
                String dateTime = sc.nextLine();

                try{
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    timeUpdate = dateFormat.parse(dateTime);
                    customer.setTimeUpdate(timeUpdate);
                    System.out.println("update success!");
                } catch (ParseException e) {
                    throw new RuntimeException("not in correct format");
                }
            }else {
                System.out.println("id customer does't exit");
            }
        }
    }

    public void removeCustomer(ArrayList<Customer> customers,String id){
        for(int i = 0 ; i < customers.size() ; i++){
            Customer customer = customers.get(i);
            if(customer.getId().equals(id)){
                customers.remove(i);
                System.out.println("remove " +customer.getId()+" success");
            }
        }
    }

}
