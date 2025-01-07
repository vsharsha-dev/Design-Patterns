import Observable.Observable;
import Observable.StockPriceObservable;
import Observer.Observer;
import Observer.StockObserver;


public class ObserverPattern {
    public static void main(String[] args){
        Observable stockPriceObservable = new StockPriceObservable();

        Observer observer1 = new StockObserver("abc@mail.com", stockPriceObservable);
        Observer observer2 = new StockObserver("xyz@mail.com", stockPriceObservable);

        stockPriceObservable.addObserver(observer1);
        stockPriceObservable.addObserver(observer2);

        stockPriceObservable.setPrice(9);

        stockPriceObservable.setPrice(11);

        stockPriceObservable.setPrice(20);
    }
}
