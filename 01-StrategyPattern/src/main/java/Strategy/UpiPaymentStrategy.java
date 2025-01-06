package Strategy;

public class UpiPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Payment done through UPI.");
    }
}
