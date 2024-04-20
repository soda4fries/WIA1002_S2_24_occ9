/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class T4Q5 {
    
}

class BankAccount implements Account {
    int balance;
    BankAccount(int n){
        balance = n;
    }
    @Override
    public int deposit (int amount){
        balance += amount;
        return balance;
    }
    @Override
    public boolean withdraw (int amount){
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

interface Account {
    abstract int deposit(int n);
    abstract boolean withdraw (int n);
}
