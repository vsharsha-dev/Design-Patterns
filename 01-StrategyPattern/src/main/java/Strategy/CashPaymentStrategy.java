package Strategy;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("Payment done through Cash.");
    }
}
