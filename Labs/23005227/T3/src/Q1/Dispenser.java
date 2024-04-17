
package Q1;

//enum is predefined constant
public enum Dispenser {
    CANDY("Candies", 3),
    CHIPS("Chips", 2.8),
    GUMS("Gums", 6.7),
    COOKIES("Cookies", 5.9);
    
    private String productName;
    private double pricePerItem;
    
    
    Dispenser(String productName, double pricePerItem) {
        this.productName = productName;
        this.pricePerItem = pricePerItem;
    }
        
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    public void dispense(){
        System.out.println(productName + " is dispensed!");
    }
}
