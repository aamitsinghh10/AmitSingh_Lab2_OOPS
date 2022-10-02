package PizzaPastaOrderingSystem;

public class PaymentStatus {
    private boolean sendMoney;

    public PaymentStatus(boolean sendMoney){
        this.sendMoney = sendMoney;
    }
    public boolean toPay() {
        return sendMoney;
    }

    public void setSendMoney(boolean sendMoney) {
        this.sendMoney = sendMoney;
    }
}
