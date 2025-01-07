package Observer;

import Observable.Observable;
import Observable.StockPriceObservable;

public class StockObserver implements Observer{

    String email;

    Observable stockPriceObservable;

    public StockObserver(String email, Observable observable){
        this.email = email;
        this.stockPriceObservable = observable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        sendNotification(email, "Stock crossed all time high!");
    }

    public void sendNotification(String email, String s) {

        System.out.println("Mail sent to "+ email);
        System.out.println("Content of the mail: " + s);
    }
}
