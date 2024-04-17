
package Q1;

public class T1 {

    public static void main(String[] args) {
        
        Telephone t1 = new Telephone("03","79676300");
        Telephone t2 = new Telephone("03","79676301");
        Telephone t3 = new Telephone("03","79676303");
        Telephone t4 = new Telephone("03","79676304");
        Telephone t5 = new Telephone("03","79676305");
        
        Telephone[] tel = {t1,t2,t3,t4,t5};
        for (Telephone t : tel){
            System.out.println(t.makeFullNumber());
        }
        
        System.out.println("Number of telepbone objects created: " + Telephone.getNumberOfTelephoneObject());
    }
    
}
