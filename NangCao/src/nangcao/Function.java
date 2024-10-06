/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nangcao;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LT MSI
 */
public class Function {

    public static Scanner sc = new Scanner(System.in);

    public int Menu() {
        System.out.println("----------------------------------------\n"
                + "1.Show all customers\n"
                + "2.Create new customer\n"
                + "3.Update customer\n"
                + "4.Delete customer information\n"
                + "5.Quit\n"
                + "Chose your option:");
        int choice = input();
        return choice;
    }

    public int input() {
        while (true) {
            try {
                int number = sc.nextInt();
                if (number < 0) {
                    System.err.println("Input must be a integer larger than 0!");
                    System.out.println(" Please enter again!");

                } else {
                    return number;
                }
            } catch (Exception e) {
                System.err.println("Input must be a integer!");
                System.out.println(" Please enter again!");
                sc.next();
            }

        }
    }

    public String inputName() {
        while (true) {
            sc.nextLine();
            String s = sc.nextLine();
            String str = s.toLowerCase();
            str.replaceAll(" ", "");
            if (str.matches("[^a-zA-Z]")) {
                System.err.println("Customer name cant have special chracter or number!");
                System.out.println("Please enter again!");
            } else {
                while (s.contains("  ")) {
                    str.replaceAll("  ", " ");
                }
                return s;
            }
        }
    }

    public String inputEmail() {
        while (true) {
            String s = sc.nextLine();
            if (s.contains("@gmail.com")) {
                return s;
            } else {
                System.out.println("This is not a email!");
            }
        }
    }

    public String inputCusID(List<Customer> list) {
        while (true) {
            String id = sc.next();
            boolean exist = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCustomer_id().equals(id)) {
                    exist = true;
                }
            }
            if (!exist) {
                return id;
            } else {
                System.out.println("This customer id already has in the list!");
            }
        }

    }

    public void showCustomerInformation(List<Customer> list) {
        System.out.printf("%-10s %-20s %-10s %-50s %-50s%n", "MaKH", "TenKH", "LoaiKH", "DiaChi", "Email");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-10s %-20s %-10s %-50s %-50s%n", list.get(i).getCustomer_id(), list.get(i).getCusomer_name(),
                    list.get(i).getCustomer_type(), list.get(i).getAddress(), list.get(i).getEmail());
        }
    }

    public void createNewCustomer(List<Customer> list) {
        System.out.println("Enter customer id:");
        String cusID = inputCusID(list);
        System.out.println("Enter customer name:");
        String cusName = inputName();
        System.out.println("Enter customer type:");
        String cusType = sc.nextLine();
        System.out.println("Enter customer address:");
        String address = sc.nextLine();
        System.out.println("Enter customer email:");
        String email = inputEmail();
        LocalDateTime now = LocalDateTime.now();
        list.add(new Customer(cusID, cusName, cusType, address, email, now));
        System.out.println("Create Successfully!");
    }

    public void updateCustomer(List<Customer> list) {
        System.out.println("Enter customer id:");
        String cusID = sc.next();
        int index = -1;
        boolean exist = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCustomer_id().equals(cusID)) {
                exist = true;
                index = i;
            }
        }

        if (exist) {
            System.out.println("Customer information:");
            System.out.printf("%-10s %-20s %-10s %-50s %-50s%n", list.get(index).getCustomer_id(), list.get(index).getCusomer_name(),
                    list.get(index).getCustomer_type(), list.get(index).getAddress(), list.get(index).getEmail());
            while (exist) {
                System.out.println("Which one you want to change:\n"
                        + "1.Customer name\n"
                        + "2.Customer type\n"
                        + "3.Customer address\n"
                        + "4.Customer email\n"
                        + "5.Quit\n"
                        + "Your choice:");
                int choice = input();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new customer name:");
                        list.get(index).setCusomer_name(inputName());
                        list.get(index).setTime_update(LocalDateTime.now());
                        break;
                    case 2:
                        System.out.println("Enter new customer type:");
                        list.get(index).setCustomer_type(sc.next());
                        list.get(index).setTime_update(LocalDateTime.now());
                        break;
                    case 3:
                        System.out.println("Enter new customer address:");
                        sc.nextLine();
                        list.get(index).setAddress(sc.nextLine());
                        list.get(index).setTime_update(LocalDateTime.now());
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.println("Enter new customer email:");
                        list.get(index).setEmail(inputEmail());
                        list.get(index).setTime_update(LocalDateTime.now());
                        break;
                    case 5:

                        return;
                    default:
                        System.out.println("Please enter again");
                        break;
                }
            }
        } else {
            System.out.println("Cant find customer!");
        }
    }

    public void removeCustomerInformation(List<Customer> list) {
        System.out.println("Enter customer id:");
        String cusID = sc.next();
        int index = -1;
        boolean exist = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCustomer_id().equals(cusID)) {
                exist = true;
                index = i;
            }
        }

        if (exist) {
            System.out.println("Customer information:");
            System.out.printf("%-10s %-20s %-10s %-50s %-50s%n", list.get(index).getCustomer_id(), list.get(index).getCusomer_name(),
                    list.get(index).getCustomer_type(), list.get(index).getAddress(), list.get(index).getEmail());
            System.out.println("Are you sure?\n"
                    + "1.Yes\n"
                    + "2.No");
            int choice = input();
            switch (choice) {
                case 1:
                    list.remove(index);
                    System.out.println("Remove customer information succeswfully!");
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Can only input 1 or 2!");
            }
        }
    }

    public void main()  {
        List<Customer> list = new ArrayList<Customer>();
        while (true) {
            int choice = Menu();
            switch (choice) {
                case 1:
                    showCustomerInformation(list);
                    break;
                case 2:
                    createNewCustomer(list);
                    break;
                case 3:
                    updateCustomer(list);
                    break;
                case 4:
                    removeCustomerInformation(list);
                    break;
                case 5:

                    return;
                default:
                    System.out.println("Enter integer from 1 to 5!");
            }
        }
    }

    
}
