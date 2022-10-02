package PizzaPastaOrderingSystem;

public class OrderRequest {
    private PizzaOrder pizzaOrder;
    private PastaOrder pastaOrder;

    //public OrderRequest(PizzaOrder pizzaOrder, PastaOrder pastaOrder){
    //    this.pizzaOrder = pizzaOrder;
    //    this.pastaOrder = pastaOrder;
    //}

    public PizzaOrder getPizzaOrder() {
        return pizzaOrder;
    }

    public void setPizzaOrder(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public PastaOrder getPastaOrder() {
        return pastaOrder;
    }

    public void setPastaOrder(PastaOrder pastaOrder) {
        this.pastaOrder = pastaOrder;
    }
}
