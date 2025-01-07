package Observable;

import Observer.Observer;

public interface Observable {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);

    void notifyObservers();
    void setPrice(int updatedPrice);
    int getPrice();
}
