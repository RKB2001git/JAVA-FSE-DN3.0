package observerpatternexample;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp = new MobileApp("MobileApp");
        WebApp webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(101.00);

        stockMarket.deregisterObserver(mobileApp);

        stockMarket.setStockPrice(102.75);
    }
}
