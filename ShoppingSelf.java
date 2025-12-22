import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingSelf{
    public static void main(String[]args){
    
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh-mm-ss");

    String date = now.format(dateFormat);
    String time = now.format(timeFormat);

    Scanner input = new Scanner(System.in);

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

            String userName;
            String cashierName;
            int discount;
        do{
            userName = getLegitLetter(input,"What is the customer's Name?: " ); 
            
            String userItem = getLegitLetter(input,"What did the user buy?: ");

            int quantity = getLegitInt(input, "How many pieces?: ");
        
            double price = getLegitDouble(input, "How much per item?: ");
        
            System.out.print("Would you like to continue (yes / no): ");

            items.add(userItem);
            prices.add(price);
            quantities.add(quantity);
           
        }while(input.nextLine().trim().equalsIgnoreCase("yes"));

        cashierName = getLegitLetter(input,"What is your name?: " ); 
        discount = getLegitInt(input, "How much discount will he get?: ");

        double subTotal = printInvoice(date, time, userName, items, quantities, prices, discount, cashierName);

        double amountPaid = amountPaid(input, "Hou much did the customer give to you", subTotal);

        printReceipt(date, time, userName, items, quantities, prices, discount, cashierName, subTotal, amountPaid);

        
      
    }//main
    public static int getLegitInt(Scanner input, String prompt){
    while(true){
    System.out.println(prompt);
    String value = input.nextLine().trim();
        try{
            int userInput = Integer.parseInt(value);
            if(userInput <= 0){
                System.out.println("Value cannot be zero or less. Try again!!");
                continue;
            }
            return userInput;
        }catch(NumberFormatException e){
            System.out.println("Enter a valid whole number");
        }
    }

    }//getlegitNumber
    
    public static String getLegitLetter(Scanner input, String prompt){
    while(true){    
    System.out.println(prompt);
    String value = input.nextLine().trim();

        if(value.isEmpty()){
         System.out.println("User input cannot be empty");
            continue;
        }
        return value;
        
        
    }//whileclosed
    

    }//getligitletter

    public static double getLegitDouble(Scanner input, String prompt){
    while(true){
    System.out.println(prompt);
    String value = input.nextLine().trim();
        try{
            double userInput = Double.parseDouble(value);
            if(userInput <= 0){
                System.out.println("Value cannot be zero or less. Try again!!");
                continue;
            }
            return userInput;
        }catch(NumberFormatException e){
            System.out.println("Enter a valid whole number");
        }
    }

    }//getlegitdouble

    //print receipt
    public static double printInvoice(String date, String time, 
                                    String userName,
                                    ArrayList<String>items,
                                    ArrayList<Integer>quantities,
                                    ArrayList<Double>prices,
                                    int discount,
                                    String cashierName
                                    ){
    System.out.println(String.format(
    """
    SEMICOLON STORES
    MAIN BRANCH
    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
    TEL: 03293828343 
    Date: %s  Time: %s
    Cashier: %s
    Customer Name: %s    
    """, date, time, userName, cashierName
    ));   
    
    System.out.println("=================================================================");
    System.out.printf("%-15s %10s %10s %10s %15s%n", " ","ITEM", "QTY", "PRICE", "TOTAL(₦)");
    System.out.println("-----------------------------------------------------------------");
    
        double subTotal = 0;
         
        for(int index = 0; index < items.size(); index++){
        double itemTotal = quantities.get(index) * prices.get(index);
        subTotal += itemTotal;

        System.out.printf("%-15s %8s %10d %11.2f %13.2f%n", " ", items.get(index), quantities.get(index), prices.get(index), itemTotal);
        }//loopclosed

        double discountValue = (discount / 100.0) * subTotal;
        double VAT = 0.175 * (subTotal - discountValue);
        double billTotal = subTotal - discountValue + VAT;
System.out.println("-----------------------------------------------------------------");
System.out.printf("%-15s %15s %15.2f %n", " ", "Sub Total:", subTotal );
System.out.printf("%-15s %14s %16.2f %n", " ", "Discount:", discountValue);
System.out.printf("%-15s %18s %12.2f %n", " ", "VAT @ 17.50%:", VAT);

System.out.println("=================================================================");

System.out.printf("%-16s %15s %14.2f %n", " ", "Bill Total:", billTotal);

System.out.println("=================================================================");

System.out.printf("%s %.2f %n","THIS IS NOT A RECEIPT KINDLY PAY ", billTotal);

System.out.println("=================================================================");

        return subTotal;
    }//printinvoice
    
    public static double amountPaid(Scanner input, String prompt, double billTotal){
    while(true){
    System.out.println(prompt);
    String amountPaidString = input.nextLine();
    
        try{
            double amountPaid = Double.parseDouble(amountPaidString);
            if(amountPaid < billTotal){
            System.out.println("Insufficient amount. Try again!!");
            continue;
            }
            System.out.println("Payment successful");
            return amountPaid;
        }catch(NumberFormatException e){
            System.out.println("Invalid value. Value must be a number!!");
        }
    }//while
    
    }//amount paid
    
    public static void printReceipt(String date, String time, 
                                    String userName,
                                    ArrayList<String>items,
                                    ArrayList<Integer>quantities,
                                    ArrayList<Double>prices,
                                    int discount,
                                    String cashierName,
                                    double subTotal,
                                    double amountPaid
                                    ){
    System.out.println(String.format(
    """
    SEMICOLON STORES
    MAIN BRANCH
    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
    TEL: 03293828343 
    Date: %s  Time: %s
    Cashier: %s
    Customer Name: %s    
    """, date, time, userName, cashierName
    ));   
    
    System.out.println("=================================================================");
    System.out.printf("%-15s %10s %10s %10s %15s%n", " ","ITEM", "QTY", "PRICE", "TOTAL(₦)");
    System.out.println("-----------------------------------------------------------------");
    
      
         
        for(int index = 0; index < items.size(); index++){
        double itemTotal = quantities.get(index) * prices.get(index);
        

        System.out.printf("%-15s %8s %10d %11.2f %13.2f%n", " ", items.get(index), quantities.get(index), prices.get(index), itemTotal);
        }//loopclosed

        double discountValue = (discount / 100.0) * subTotal;
        double VAT = 0.175 * (subTotal - discountValue);
        double billTotal = subTotal - discountValue + VAT;
        double balance = amountPaid - billTotal;
System.out.println("-----------------------------------------------------------------");
System.out.printf("%-15s %15s %15.2f %n", " ", "Sub Total:", subTotal );
System.out.printf("%-15s %14s %16.2f %n", " ", "Discount:", discountValue);
System.out.printf("%-15s %18s %12.2f %n", " ", "VAT @ 17.50%:", VAT);

System.out.println("=================================================================");

System.out.printf("%-16s %15s %14.2f %n", " ", "Bill Total:", billTotal);

System.out.printf("%-16s %15s %14.2f %n", " ", "Amount Paid:", amountPaid);

System.out.printf("%-16s %15s %14.2f %n", " ", "Balance:", balance);

System.out.println("=================================================================");

System.out.println("                  THANK YOU FOR YOUR PATRONAGE");

System.out.println("=================================================================");

    }//printinvoice
        
    
}//class
