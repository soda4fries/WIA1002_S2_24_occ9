
package Q5;

public class Tester {
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(500);
        b1.deposit(3000);
        b1.withdraw(200);
        b1.withdraw(5000);
        System.out.println(b1.toString());
        
    }
    
}
