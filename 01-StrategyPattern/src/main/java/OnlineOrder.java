import Strategy.PaymentStrategy;
import Strategy.UpiPaymentStrategy;

public class OnlineOrder extends Order{
    // Online order takes only UPI Payment
    public OnlineOrder(){
        super(new UpiPaymentStrategy());
    }
}
