package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 9/3/2024
 * Objective: Q5: Define a class, BankAccount, that implements an interface, Account.
 */

interface Account {
    
    public int deposit(int amountA);

    public boolean withdraw(int amountB);
    
}

public class BankAccount implements Account{
    
    private int balance;
    
    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }
    
    public int deposit(int amountA){
        balance += amountA;
        return (int)balance;
    }
    
    public boolean withdraw(int amountB){
        if (amountB <= balance){
            balance -= amountB;
            return true;
        }
        else{
            return false;
        }
    }
}