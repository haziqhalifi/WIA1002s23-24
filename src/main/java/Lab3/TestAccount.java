package Lab3;

import java.util.ArrayList;

public class TestAccount {

    public static void main(String[] args) {
        Account acc = new Account(1122, 1000);
        acc.setAnnualInterestRate(1.5);
  
        
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);        
        
        System.out.println(acc);
        ArrayList<Transaction> trans = acc.trans;
        System.out.println("\nTransaction History:");
        for(Transaction list : trans){
            System.out.println(list);
            System.out.println("");
        }
    }
}
