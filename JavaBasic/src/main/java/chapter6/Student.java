package chapter6;

public class Student {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    public double getPriceTax() {
        return this.price * this.tax;
    }
}
