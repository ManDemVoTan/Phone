package anhtuan.com;

import java.util.ArrayList;
import java.util.List;

public class NewsService implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);

    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

}
