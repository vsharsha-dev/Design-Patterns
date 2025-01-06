import Strategy.CashPaymentStrategy;

public class StreetVendorOrder extends Order{
    // Takes only Cash strategy
    public StreetVendorOrder(){
        super(new CashPaymentStrategy());
    }
}
