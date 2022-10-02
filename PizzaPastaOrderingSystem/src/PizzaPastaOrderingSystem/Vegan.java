package PizzaPastaOrderingSystem;

public class Vegan extends Pizza{
    private double price = 15;

    public Vegan(PizzaSize size,PizzaCrust crust){
        super(crust,size);
        setPrice(price);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {

        if(getSize().equals(PizzaSize.Medium)){
            this.price = price*2;
        }
        else if(getSize().equals(PizzaSize.Large)){
            this.price = price*3;
        }
        else{
            this.price = price;
        }
    }
}
