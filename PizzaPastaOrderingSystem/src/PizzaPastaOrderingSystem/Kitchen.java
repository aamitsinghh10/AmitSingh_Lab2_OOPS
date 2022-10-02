package PizzaPastaOrderingSystem;

import java.util.List;

public class Kitchen {
    //private OrderingSystem orderingSystem;
    private Pizza pizza;
    private Pasta pasta;
    private NotificationSystem notification;

    public void PrepareCustomerOrder(List<OrderRequest> orderRequest){
        for(OrderRequest order : orderRequest){
            if(order.getPizzaOrder()!=null){
                for(int i=0;i<order.getPizzaOrder().getTotalItems();i++){
                    preparePizza(order.getPizzaOrder());
                }
                notification.foodPrepared(pizza,order.getPizzaOrder().getTotalItems());
            }

            if(order.getPastaOrder()!=null){
                for(int i=0;i<order.getPastaOrder().getTotalItems();i++){
                    preparePasta(order.getPastaOrder());
                }
                notification.foodPrepared(pasta,order.getPastaOrder().getTotalItems());
            }
        }
    }

    public NotificationSystem getNotification() {
        return notification;
    }

    public void setNotification(NotificationSystem notification) {
        this.notification = notification;
    }

    private void preparePizza(PizzaOrder pizzaOrder){
        if(pizzaOrder.getFlavour().equals(PizzaFlavour.Vegetarian)){
            this.pizza = new Vegetarian(pizzaOrder.getSize(),pizzaOrder.getCrust());
            if(pizzaOrder.getToppings().size()!=0){
                this.pizza.setToppings(pizzaOrder.getToppings());
            }
        }
        else if(pizzaOrder.getFlavour().equals(PizzaFlavour.NonVeg)){
            this.pizza = new NonVeg(pizzaOrder.getSize(),pizzaOrder.getCrust());
            if(pizzaOrder.getToppings().size()!=0){
                this.pizza.setToppings(pizzaOrder.getToppings());
            }
        }
        else{
            this.pizza = new Vegan(pizzaOrder.getSize(),pizzaOrder.getCrust());
            if(pizzaOrder.getToppings().size()!=0){
                this.pizza.setToppings(pizzaOrder.getToppings());
            }
        }
    }

    private void preparePasta(PastaOrder pastaOrder){
        if(pastaOrder.getFlavour().equals(PastaFlavour.RedSauce)){
            this.pasta = new RedSauce(pastaOrder.getPastaTypes());
        }
        else{
            this.pasta = new WhiteSauce(pastaOrder.getPastaTypes());
        }
    }
}