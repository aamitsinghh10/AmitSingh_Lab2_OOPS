package PizzaPastaOrderingSystem;

public class Pasta implements PriceDetails{
    private PastaTypes pastaTypes;
    private double price;

    public Pasta(PastaTypes pastaTypes){
        this.pastaTypes = pastaTypes;
        //this.price = price;
    }

    public PastaTypes getPastaTypes() {
        return pastaTypes;
    }

    public void setPastaTypes(PastaTypes pastaTypes) {
        this.pastaTypes = pastaTypes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
