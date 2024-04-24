package Lab_Q3;

public class Stock {
    private int price;
    private int amount;
    public Stock(int amount, int price) {
        this.amount = amount;
        this.price = price;
    }
    public int getAmount() {
        return this.amount;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
