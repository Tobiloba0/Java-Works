import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingReal{
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
        do{
            userName = getLegitLetter(input,"What is the customer's Name:" ); 
            
            String userItem = getLegitLetter(input,"What did the user buy?: ");

            int quantity = getLegitInt(input, "How many pieces?: ");
        
            double price = getLegitDouble(input, "How much per item?: ");
        
            System.out.print("Would you like to continue (yes / no): ");

            items.add(userItem);
            prices.add(price);
            quantities.add(quantity);
           
        }while(input.nextLine().trim().equalsIgnoreCase("yes"));

        printInvoice(date, time, userName);
      
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
    public static void printInvoice(String date, String time, String userName){
    System.out.println(String.format(
    """
    SEMICOLON STORES
    MAIN BRANCH
    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
    TEL: 03293828343 
    Date: %s  Time: %s
    Cashier: Cashier's Name
    Customer Name: %s    
    """, date, time, userName
    ));   
    }//print receipt
    
    System.out.println("===================================");
    System.out.printf("%-15s %10s %10s %15s", "ITEM", "QTY" "PRICE" "TOTAL(₦)");
    System.out.println("------------------------------------");
    double itemtotal = 0;
        for(int index = 0; index < items.size(); index++){
        itemtotal += quantities.get(index) * prices.get(index);

        System.out.printf("%-15s %10d %10.2f %15.2f", " ", item.get(index), quantities.get(index), prices.get(index), itemTotal);
        }
        
    
}//class
