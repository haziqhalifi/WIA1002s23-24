package Lab3;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
    ArrayList<Transaction> trans = new ArrayList<>();

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0.1;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() / 100;
    }

    public double withdraw(double amount) {
        balance -= amount;
        Transaction t = new Transaction('W', amount, balance, "is successfully withdrawn.");
        trans.add(t);
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        Transaction t = new Transaction('W', amount, balance, "is successfully deposited");
        trans.add(t);
        return balance;
    }
    
    public String toString(){
        return "ID: "+id+"\nBalance: "+balance+"\nAnnual Interest Rate: "+annualInterestRate+"\nDate Created: "+dateCreated;
    }

    public static void viewBalance(Account[] acc, int id) {
        System.out.println("Balance : " + acc[id].getBalance());
    }

}

class Transaction{
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String toString(){
        String trans;
        if(type=='d'){
            trans = "Deposit";
        }else{
            trans = "Withdrawal";
        }
        return"Type of transaction : "+trans+"\nTransaction amount : "+amount+"\nBalance : "+balance+"\nDescription : RM "+amount+" "+description;
    }
}
