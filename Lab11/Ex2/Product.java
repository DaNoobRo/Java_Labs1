package Lab11.Ex2;

import java.util.Observable;

public class Product extends Observable {

    String name;
    int quantity;
    double price;

    Product(){}
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

        this.setChanged();
        System.out.println(1);
        this.notifyObservers();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public  String toString(){
        return("Name Product : " + this.name +" Price : "+ this.price+" Quantity"+ this.quantity+"\n");
    }

}
