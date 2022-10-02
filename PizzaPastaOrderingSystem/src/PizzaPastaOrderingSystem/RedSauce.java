package PizzaPastaOrderingSystem;

public class RedSauce extends Pasta{
    private double price = 20;

    public RedSauce(PastaTypes pastaTypes){
         super(pastaTypes);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
