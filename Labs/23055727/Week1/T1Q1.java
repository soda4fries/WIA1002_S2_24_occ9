/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class T1Q1 {
    public static void main(String[] args) {
        Telephone t1 = new Telephone("03","79676300");
        Telephone t2 = new Telephone("03","79676301");
        Telephone t3 = new Telephone("03","79676302");
        Telephone t4 = new Telephone("03","79676303");
        Telephone t5 = new Telephone("03","79676304");
        Telephone[] ts = {t1,t2,t3,t4,t5};
        for (Telephone t : ts)
            System.out.println(t.makeFullNumber());
        System.out.println(t1.getNumberOfTelephones());
    }
    
}

class Telephone {
    private String areaCode, number;
    static int numberOfTelephoneObject = 0;
    
    public Telephone(String areaCode,String number ) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }
    
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public void setNumber (String number) {
        this.number = number;
    }
    public String getAreaCode(){
        return areaCode;
    }
    public String getNumber(){
        return number;
    }
    public int getNumberOfTelephones(){
        return numberOfTelephoneObject;
    }
    public String makeFullNumber() {
        return areaCode + "-" + number;
    }
}
