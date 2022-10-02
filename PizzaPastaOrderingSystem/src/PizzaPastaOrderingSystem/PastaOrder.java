package PizzaPastaOrderingSystem;

public class PastaOrder{
    private PastaFlavour flavour;
    private PastaTypes pastaTypes;
    private int totalItems;

    public PastaOrder(PastaFlavour flavour, PastaTypes pastaTypes, int items){
        this.flavour = flavour;
        this.pastaTypes = pastaTypes;
        this.totalItems = items;
    }

    public PastaTypes getPastaTypes() {
        return pastaTypes;
    }

    public void setPastaTypes(PastaTypes pastaTypes) {
        this.pastaTypes = pastaTypes;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public PastaFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(PastaFlavour flavour) {
        this.flavour = flavour;
    }
}