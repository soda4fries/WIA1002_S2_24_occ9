package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 9/3/2024
 * Objective: Q1: Write definition of a class Telephone.
 */

public class Telephone {
    
    //instance variable
    public String areaCode;
    public String number;
    
    //static instance variable
    public static int numberOfTelephoneObject;
    
    //constructor
    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    //accessor
    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    //mutator
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    //method
    public String makeFullNumber(){
        return areaCode+"-"+number;
    }

    
    //main method
    public static void main (String[] args){
        Telephone [] telephone = new Telephone[5];
        telephone[0] = new Telephone("03", "79676300");
        telephone[1] = new Telephone("03", "79676301");
        telephone[2] = new Telephone("03", "79676302");
        telephone[3] = new Telephone("03", "79676303");
        telephone[4] = new Telephone("03", "79676304");
        
        for(Telephone value: telephone){
            System.out.println(value.makeFullNumber());
        }
        
        
    }
    
    
}
