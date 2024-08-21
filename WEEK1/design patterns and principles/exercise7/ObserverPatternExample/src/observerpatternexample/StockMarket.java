package observerpatternexample;

import java.util.List;
import java.util.ArrayList;

// Implements the Stock interface, which manages observers
public class StockMarket implements Stock {
    // List to keep track of all registered observers
    private List<Observer> observers;
    
    // The current stock price
    private double stockPrice;

    // Constructor initializing the observers list
    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    // Registers an observer
    @Override
    public void registerObserver(Observer observer) {
        // Check if the observer is not null and add it to the list
        if (observer != null) {
            observers.add(observer);
        }
    }

    // Deregisters an observer
    @Override
    public void deregisterObserver(Observer observer) {
        // Remove the observer from the list if it's not null
        if (observer != null) {
            observers.remove(observer);
        }
    }

    // Notifies all registered observers about a
