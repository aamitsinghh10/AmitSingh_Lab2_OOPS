package PizzaPastaOrderingSystem;

public class WhiteSauce extends Pasta{
    private double price = 10;

    public WhiteSauce(PastaTypes pastaTypes){
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
