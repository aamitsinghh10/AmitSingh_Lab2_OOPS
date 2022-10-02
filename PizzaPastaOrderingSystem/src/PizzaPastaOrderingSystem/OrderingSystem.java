package PizzaPastaOrderingSystem;

public class OrderingSystem {
    private CustomerInfo customerDetails;
    private double totalPrice;

    public OrderingSystem(CustomerInfo customerDetails){
       this.customerDetails = customerDetails;
    }
    public String OrderSummary(){
        return customerDetails.getOrderRequest() +"\t$"+this.totalPrice;
    }

    public void foodCost(PriceDetails priceDetails, int quantity){
        this.totalPrice += quantity*priceDetails.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public CustomerInfo getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerInfo customerDetails) {
        this.customerDetails = customerDetails;
    }
}
