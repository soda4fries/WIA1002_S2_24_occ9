
package Q1;

import java.util.Scanner;

public class CandyMachine {
    private Dispenser[] dispenser;
    private CashRegister register;

    public CandyMachine() {
        this.dispenser = new Dispenser[]{Dispenser.CANDY,Dispenser.CHIPS,Dispenser.COOKIES,Dispenser.GUMS};
        this.register = new CashRegister();   
    }
     
    public void showItem(){
        System.out.printf("   %-20s | %2s\n","Product","Price");
        for (int i=0; i < dispenser.length; i++){
            System.out.printf(i+1 + ". %-20s | %.2f\n",dispenser[i].getProductName() , dispenser[i].getPricePerItem());    
        }
    }
    
    public void operate(){
        System.out.println("******************************");
        showItem();
        System.out.println("*******************************");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the product index: ");
        int i = sc.nextInt()-1;
        Dispenser temp = dispenser[i];
        System.out.println("Price: RM" + temp.getPricePerItem());
        register.setCostOfItem(temp.getPricePerItem());
        
        while (!register.isEnough()){
            System.out.printf("Current Payment: %.2f; Payment: ",register.getPayment());
            register.getTotalCash(sc.nextDouble());
        }
        
        register.getChange();
        dispenser[i].dispense();
        sc.close();
    }
}
