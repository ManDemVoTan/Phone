package anhtuan.com;

public interface Subject {
    void notifyObservers();

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);
}
