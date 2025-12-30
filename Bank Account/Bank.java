import java.util.ArrayList;
public class Bank{
    private static ArrayList<Account> customerAccounts = new ArrayList<Account>();
    
    public void addAccount(Account account){
    customerAccounts.add(account);    
    }
    
    public void removeAccount(Account account){
    customerAccount.remove(account);
    }
    
    public void deposit(double amount){
    balance += customerAccounts.getBalance() + amount;
    }

    public void withdraw(double amount){
    balance += customerAccounts.getBalance() - amount;  
    }

public class Account{
    private String customerName;
    private double balance;
    
    public Account(String customerName, double balance){
    this.customerName = customerName;
    this.balance = balance;    
    }

    public void setName(String name){
    this.name = name;
    }
    
    public String getName(){
    return name;    
    }
    
    public void setBalance(double balance){
    this.balance = balance;
    }
    
    public double getSalary(){
    return salary;    
    }
    
}
