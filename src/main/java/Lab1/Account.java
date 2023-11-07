package Lab1;

import java.util.Date;
import java.util.Scanner;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

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
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public static void main(String[] args) {
//        Account acc1 = new Account(1122,20000);
//        acc1.setAnnualInterestRate(4.5);
//        acc1.withdraw(2500);
//        acc1.deposit(3000);
//        System.out.printf("The balance is RM %.2f with the montly interest of RM %.2f on %s",acc1.balance,acc1.getMonthlyInterest(),acc1.getDateCreated());
        Account[] acc = new Account[10];
        for (int i = 0; i < 10; i++) {
            acc[i] = new Account(i, 100);
        }
        System.out.println("Welcome to UM ATM Machine");
        Scanner key = new Scanner(System.in);

        while (true) {
            int id = -1;
            while (id < 0 || id > 9) {
                System.out.println("Please enter your id (0-9):");
                id = key.nextInt();
                if (id >= 0 && id < 10) {
                    break;
                }
            }
            int num = 0;
            while (num < 4) {
                displayMenu();
                System.out.println("Please choose your menu :");
                num = key.nextInt();
                switch (num) {
                    case 1:
                        viewBalance(acc, id);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw :");
                        double amount = key.nextDouble();
                        while (amount < 0) {
                            System.out.println("Enter the amount again. The amount should be positive.\nAmount:");
                            amount = key.nextDouble();
                        }
                        withdraw(acc, id, amount);
                        break;

                    case 3:
                        System.out.println("Enter amount to deposit :");
                        amount = key.nextDouble();
                        while (amount < 0) {
                            System.out.println("Enter the amount again. The amount should be positive.\nAmount:");
                            amount = key.nextDouble();
                        }
                        deposit(acc, id, amount);
                        break;

                    default:
                        break;
                }

            }
        }

    }

    public static void viewBalance(Account[] acc, int id) {
        System.out.println("Balance : " + acc[id].getBalance());
    }

    public static void withdraw(Account[] acc, int id, double amount) {
        acc[id].balance -= amount;
        viewBalance(acc, id);
    }

    public static void deposit(Account[] acc, int id, double amount) {
        acc[id].balance += amount;
        viewBalance(acc, id);
    }

    public static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("1 - view your balance");
        System.out.println("2 - withdraw money");
        System.out.println("3 - deposit money");
        System.out.println("4 - exit the main menu");
    }
}
