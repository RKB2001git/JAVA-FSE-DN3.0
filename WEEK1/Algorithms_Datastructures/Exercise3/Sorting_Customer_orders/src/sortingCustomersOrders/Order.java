package sortingCustomersOrders;

public class Order {

	    private int orderId;
	    private String customerName;
	    private double totalPrice;

	    // Constructor
	    public Order(int orderId, String customerName, double totalPrice) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.totalPrice = totalPrice;
	    }

	    // Getters
	    public int getOrderId() {
	        return orderId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public double getTotalPrice() {
	        return totalPrice;
	    }

	    // Setters
	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public void setTotalPrice(double totalPrice) {
	        this.totalPrice = totalPrice;
	    }

	    @Override
	    public String toString() {
	        return "Order{" +
	                "orderId=" + orderId +
	                ", customerName='" + customerName + '\'' +
	                ", totalPrice=" + totalPrice +
	                '}';
	    }
	}


