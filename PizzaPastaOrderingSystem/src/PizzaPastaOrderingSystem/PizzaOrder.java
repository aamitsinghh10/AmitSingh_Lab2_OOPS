package PizzaPastaOrderingSystem;

import java.util.List;

public class PizzaOrder {
    private PizzaSize size;
    private PizzaCrust crust;
    private PizzaFlavour flavour;
    private List<Toppings> toppings;
    private int totalItems;

    public PizzaOrder(PizzaSize size, PizzaCrust crust, PizzaFlavour flavour, List<Toppings> toppings, int items){
        this.size = size;
        this.crust = crust;
        this.flavour = flavour;
        this.toppings = toppings;
        this.totalItems = items;
    }

    public PizzaCrust getCrust() {
        return crust;
    }

    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public PizzaFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(PizzaFlavour flavour) {
        this.flavour = flavour;
    }
}
