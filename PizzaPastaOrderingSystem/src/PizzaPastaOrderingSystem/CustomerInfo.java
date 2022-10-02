package PizzaPastaOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class CustomerInfo {
    private String name;
    private long mobNo;
    private List<OrderRequest> orderRequest = new ArrayList<>();
    private PaymentStatus payment;
    private NotificationSystem notification;

    public CustomerInfo(String name, long mobNo){
        this.name = name;
        this.mobNo = mobNo;
    }
    public void addOrder(OrderRequest order){
        orderRequest.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }

    public List<OrderRequest> getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(List<OrderRequest> orderRequest) {
        this.orderRequest = orderRequest;
    }

    public PaymentStatus getPayment() {
        return payment;
    }

    public void setPayment(PaymentStatus payment) {
        this.payment = payment;
    }

    public NotificationSystem getNotification() {
        return notification;
    }

    public void setNotification(NotificationSystem notification) {
        this.notification = notification;
    }
}
