package PizzaPastaOrderingSystem;

public class NotificationSystem {
    private Kitchen kitchen;
    private OrderingSystem orderingSystem;
    private CustomerInfo customerInfo;

    public void orderList(){
        kitchen.PrepareCustomerOrder(customerInfo.getOrderRequest());
    }
    public void foodPrepared(PriceDetails totalPrice, int quantity){
        orderingSystem.foodCost(totalPrice,quantity);
    }

    public OrderingSystem getOrderingSystem() {
        return orderingSystem;
    }

    public void setOrderingSystem(OrderingSystem orderingSystem) {
        this.orderingSystem = orderingSystem;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }
}
