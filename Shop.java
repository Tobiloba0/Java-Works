import java.util.Scanner;
import java.util.ArrayList;
public class Shop{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    System.out.print("What is the customer's name? : ");
    String customerName = input.nextLine().trim();

    do {
        System.out.print("What did the user buy? ");
        String item = input.nextLine().trim();
        
        while (item.isEmpty()){
            System.out.print("Item cannot be empty. Try again!!");
            item = input.nextLine().trim();
        }

        int quantity = getQuantity(input, "How many pieces? ");

        double price = getPrice(input, "How much per unit? ");

        items.add(item);
        prices.add(price);
        quantities.add(quantity);
        
        System.out.print("Add more items? (yes/no): ");
    
    }while(input.nextLine().trim().equalsIgnoreCase("yes"));
 
    //print invoice
    double total = printInvoice(items, prices, quantities);

    //cashiers questions 2 input
    System.out.print("What is your name? ");
    String cashierName = input.nextLine().trim();

    int discountPercent = getQuantity(input, "How much discount would he he get? ");
    double discountAmount = total * discountPercent / 100;
    double finalTotal = total - discountAmount;
   
    double amountPaid = getPrice(input, "Enter amount paid (₦): ");
    double balance = amountPaid - finalTotal;

    //printreceipt
    printReceipt(items, prices, quantities, finalTotal, balance, customerName, cashierName, discountPercent, discountAmount, amountPaid);


    }
    public static int getQuantity(Scanner input, String prompt){
        while(true){
            System.out.print(prompt);
            String value = input.nextLine().trim();
            
            try{
            int number = Integer.parseInt(value);
                if(number <= 0){
                    System.out.println("value cannot be less than zero, \n");
                    continue;
                }
                return number;
            }catch(NumberFormatException e){
                System.out.println("Please enter a valid whole number.");
        
            }//catchclosed
            
        }//while closed
    }//method closed

    //getting price
    public static double getPrice(Scanner input, String prompt){
    while (true){    
    System.out.print(prompt);
    String userInput = input.nextLine();
        try{
        double price = Double.parseDouble(userInput);
            if(price <= 0){
               System.out.println("Price cant be less than or = to zero. Retry!");
                continue;
            }
            return price;    
        }catch(NumberFormatException e){
            System.out.println("Enter a valid price");
        }
    
    }//while closed   
    }//methodclosed
    //print invoice method
    public static double printInvoice(ArrayList<String> items,
                                      ArrayList<Double> prices,
                                      ArrayList<Integer> quantities){

            if(items.isEmpty()){
            System.out.print("No item entered, Invoice not generated.");
            return 0;
        }
    
        double subTotal = 0;

        System.out.println("\n================= INVOICE =================");
        System.out.printf("%-15s %5s %10s %10s %n", "ITEM", "QTY", "PRICE", "TOTAL(₦)");
        System.out.println("--------------------------------------------");
        
        for(int index = 0; index < items.size(); index++){
        double itemTotal = prices.get(index) * quantities.get(index);
        subTotal+= itemTotal;

        System.out.printf("%-15s %5d %10.2f %10.2f%n", items.get(index), quantities.get(index), prices.get(index), itemTotal);
        
        }

        double discount = 0.10 * subTotal;
        double vat = 0.075 * (subTotal - discount);
        double total = subTotal - discount + vat;

        System.out.println("------------------------------------------");
        System.out.printf("%-25s ₦%.2f%n", "Sub Total", subTotal);
        System.out.printf("%-25s ₦%.2f%n", "Discount (10%):", discount);
        System.out.printf("%-25s ₦%.2f%n", "VAT (7.5%)", vat);
        System.out.println("==========================================");
        System.out.printf("%-25s ₦%.2f%n", "Bill Total", total);
        System.out.println("==========================================");
        System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + total);
        System.out.println("==========================================");
        

        return total; 
    }

    //PAYMENT
    
    static double processPayment(Scanner input, double total){
    double amountPaid;
    while(true){
        amountPaid = getPrice(input, "Enter amount paid (₦): ");   
        if(amountPaid < total){
            System.out.println("Insufficient amount. Try again!!\n");
        }else{
            System.out.println("Payment successful.\n");
            break;        
        } 
    }
    return amountPaid - total;
    }//processpayment

    //printing invoice
    public static void printReceipt(ArrayList<String> items,
                                 ArrayList<Double> prices,
                                 ArrayList<Integer> quantities,
                                   double total,
                                   double balance,
                                   String customerName,
                                   String cashierName,
                                   int discountPercent,
                                   double discountAmount,
                                   double amountPaid){

   System.out.println("\n-------- PAYMENT RECEIPT --------");
   System.out.println("Customer: " + customerName);
   System.out.println("Cashier: " + cashierName);
   System.out.println("==========================================");
   System.out.printf("%-15s %5s %10s %10s%n", "Item", "Qty", "Price", "Total");
   System.out.println("-----------------------------------------------");

    double itemTotal = 0;
    for(int index = 0; index < items.size(); index++){
        itemTotal += prices.get(index) * quantities.get(index);
         System.out.printf("%-15s %5d %10.2f %10.2f%n", items.get(index), quantities.get(index), prices.get(index), itemTotal);
    
    }
        System.out.println("-----------------------------------------------");
        System.out.printf("%-25s ₦%.2f%n", "Sub Total:", itemTotal);
        System.out.printf("%-25s ₦%.2f%n", "Total Discount:", discountAmount);
        System.out.printf("%s %d%% %16s ₦%.2f %n", "VAT @", discountPercent, " ", discountAmount);
        System.out.println("==========================================");
        System.out.printf("%-25s ₦%.2f%n", "Bill Total:", total);
        System.out.printf("%-25s ₦%.2f%n", "Amount Paid:", amountPaid);
        System.out.printf("%-25s ₦%.2f%n", "Balance:", balance);
        System.out.println("==========================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==========================================");

    }//printrecipt
    
    




















}
