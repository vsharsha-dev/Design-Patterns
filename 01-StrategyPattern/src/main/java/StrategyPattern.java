import Strategy.PaymentStrategy;
import Strategy.UpiPaymentStrategy;

public class StrategyPattern {
    public static void main(String[] args){


        Order onlineOrder = new OnlineOrder();

        Order streetOrder = new StreetVendorOrder();

        onlineOrder.pay();

        streetOrder.pay();
    }




}
