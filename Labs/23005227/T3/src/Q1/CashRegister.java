
package Q1;

public class CashRegister {
    private double profit;
    private double balance;
    private double costOfItem;
    private double payment;

    public CashRegister() {
    }
    
    public void getChange(){
        double change = payment - costOfItem;
        if (change < balance){
            System.out.println("Not enough balance");
        } else {
            balance -= change;
            payment = costOfItem = 0;
            System.out.printf("Your change: RM %.2f\n", change);
        }
    }
    
    public boolean isEnough(){
        return payment > costOfItem;
    }
    
    public double getCostOfItem(){
        return costOfItem;
    }
    
    public void setCostOfItem(double costOfItem) {
        this.costOfItem = costOfItem;
    }
    
    public void getTotalCash(double userPayment){
        profit += costOfItem;
        payment += userPayment;
    }
    
    public double getPayment() {
        return payment;
    }    
}
