import Strategy.PaymentStrategy;

public abstract class Order {
    PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(){
        paymentStrategy.pay();
    }
}
