package observerpatternexample;

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers(); // Ensure this method signature is correct
}
