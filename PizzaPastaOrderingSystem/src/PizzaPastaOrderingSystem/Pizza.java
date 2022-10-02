package PizzaPastaOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements PriceDetails{
    private PizzaCrust crust;
    private PizzaSize size;
    private double price;
    private List<Toppings> toppings;

    public Pizza(PizzaCrust crust, PizzaSize size){
        this.crust = crust;
        this.size = size;
        toppings = new ArrayList<>();
    }

    public PizzaCrust getCrust() {
        return crust;
    }

    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }
}
