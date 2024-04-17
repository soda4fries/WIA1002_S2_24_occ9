
package Q1;

public class Telephone {
    //public no need accesor and mutator
    private String areaCode;
    private String number;
    public static int numberOfTelephoneObject = 0;

    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public static int getNumberOfTelephoneObject() {
        return numberOfTelephoneObject;
    }
    
    public String makeFullNumber(){
        return areaCode + "-"  + number;
    }
    
}
