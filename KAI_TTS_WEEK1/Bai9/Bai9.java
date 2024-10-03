package KAI_TTS_WEEK1.Bai9;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.List;
import java.util.Arrays;
import KAI_TTS_WEEK1.Bai1.Bai1;
import KAI_TTS_WEEK1.Bai2.Bai2;
import KAI_TTS_WEEK1.Bai3.Bai3;
import KAI_TTS_WEEK1.Bai4.Bai4;
import KAI_TTS_WEEK1.Bai5.Bai5;
import KAI_TTS_WEEK1.Bai6.Bai6;
import KAI_TTS_WEEK1.Bai7.Bai7;
import KAI_TTS_WEEK1.Bai8.Bai8;
public class Bai9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+ \t.................................+");
            System.out.println("1.\tTính tiền điện");
            System.out.println("2.\tKiểm tra tam giác");
            System.out.println("3.\tĐảo ngược số nguyên");
            System.out.println("4.\tĐổi sang nhị phân");
            System.out.println("5.\tDãy con lớn nhất");
            System.out.println("6.\tTìm ký tự lặp");
            System.out.println("7.\tChia tiền");
            System.out.println("8.\tKiểm tra số điện thoại");
            System.out.println("9.\tThoát");
            System.out.println("+ \t..................................+");

            System.out.print("Choose function : ");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    while(true){
                        Bai1 bai1 = new Bai1();
                    
                        try {
                            System.out.println("the electricity consumption : ");
                            int electCount = scanner.nextInt();
                            if (electCount <= 0) {
                                System.out.println("Please enter the electricity consumption");
                            } else {
                                
                                int cost =  bai1.ElectCost(electCount);
                                System.out.println("cost electric: " + cost + " VND");
                                break; // Thoát khỏi vòng lặp sau khi nhập đúng và tính toán
                            }
            
                        } catch (Exception e) {
                            System.out.println("Please enter a valid number!");
                            scanner.nextInt();
                        }
                    }
                    break;
                      
                case 2:
                    Bai2 bai2 = new Bai2();
                    while (true) {
                        try {
                            System.out.print("a: ");
                            int a = scanner.nextInt();
                            System.out.print("b: ");
                            int b = scanner.nextInt();
                            System.out.print("c: ");
                            int c = scanner.nextInt();
                        
                            bai2.Triangle(a, b, c);
                            break;
                        } catch (Exception e) {
                            System.err.println("Error.Please enter again");
                            scanner.nextLine();
                        }
                       
                    }
                    break;
                case 3:
                
                    while (true) {
                        Bai3 bai3 = new Bai3();
                        
                        try {
                       
                            System.out.println("Enter number you want reverve :");
                            int number = scanner.nextInt();
                            int reverseNum = bai3.NumberReverse(number);
                            
                            System.out.println("Reverse num :"+ reverseNum);
                            break;
                        } catch (Exception e) {
                           
                            System.out.println("Error. Enter number again");
                            scanner.nextLine();
                        }
                        
                    }
                    break;
                case 4:
                    while (true) {
                        Bai4 bai4 = new Bai4();
                        try {
                        
                            System.out.println("Enter number you want tranfer to binary :");
                            int dec = scanner.nextInt();
                            if(dec < 0 ){
                                System.out.println(" Error. Please enter a positive integer .");
                            }else{
                                String bina = bai4.DecBina(dec);
                                System.out.println("Binary :" +  bina);
                                break;
                            }
                            
                        } catch (Exception e) {
                            System.out.println("Error: Invalid input. Please enter a positive integer.");
                            scanner.nextLine(); 
                        }
                        
                    }
                    break;
                case 5:
                    while (true) {
                        Bai5 bai5 = new Bai5();
                        try {
                            
                            List<Integer> arr = new ArrayList<>();
                            System.out.print("Size Array : ");
                            int size = scanner.nextInt();
                            
                            int[] a = new int[size];
                    
                            System.out.println("Enter Array:");
                            for (int i = 0; i < size; i++) {
                                System.out.print("Enter num array " + (i + 1) + ": ");
                                a[i] = scanner.nextInt(); // Đọc số từ bàn phím và lưu vào mảng
                            }
                            System.out.println("Init Array :" + Arrays.toString(a));
                            arr = bai5.IncreaseArr(a);
                            System.out.println("result :" + arr);
                            break;
                        } catch (Exception e) {
                            System.out.println("Error. Enter again");
                            scanner.nextLine();
                        }
                        
                    }
                    break;
                case 6:
                    while (true) {
                        Bai6 bai6 = new Bai6();
                        try {
                            System.out.print("Enter String : ");
                            String a = scanner.nextLine();
                            System.out.println();
                            
                            bai6.LoopString(a);
                            break;
                        } catch (Exception e) {
                            System.out.println("Error . Please enter String again");
                            scanner.nextLine();
                        }
                    }
                    break;
                case 7:
                    while (true) {
                        Bai7 bai7 = new Bai7();

                        try {
                            System.out.print("Enter money: ");
                            int n = scanner.nextInt();  
                    
                        
                            bai7.DividedMoney(n);
                            break;
                        } catch (Exception e) {
                        
                            System.out.println("Please enter again :");
                            scanner.next();
                        }
                        
                    }
                    break;
                case 8:
                    while (true) {
                        Bai8 bai8 = new Bai8();
                        try {
                            System.out.print("Enter phone number : ");
                            String phoneNum = scanner.nextLine();
                    
                            
                            if (bai8.isValidPhoneNum(phoneNum)) {
                                System.out.println("phone number valid");
                                break;
                            } else {
                                System.out.println("Phone number not valid. Please enter again !");
                            
                            }
                    
                        
                        } catch (Exception e) {
                            System.out.println("Error . Please enter phone number again");
                        
                            scanner.nextLine();
            
                        }
                    }
                    break;
                case 9:
                    System.out.println("Exiting.");
                    scanner.close();
                    System.exit(4);;;
                    break;
                
                default:
                    break;
            }
            
        }

    }
}
