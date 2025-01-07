package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockPriceObservable implements Observable{

    public int stockPrice = 10;

    public int allTimeHighPrice = 10;

    public List<Observer> observerList = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for(Observer o : observerList){
            o.update();
        }

    }

    @Override
    public void setPrice(int updatedPrice) {
        if (updatedPrice > allTimeHighPrice){
            allTimeHighPrice = updatedPrice;
            notifyObservers();
        }
        stockPrice = updatedPrice;
    }

    @Override
    public int getPrice() {
        return stockPrice;
    }
}
