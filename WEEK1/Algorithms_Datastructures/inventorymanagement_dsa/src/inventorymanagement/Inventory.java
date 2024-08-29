package inventorymanagement;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private HashMap<String, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    // Method to update an existing product's details
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product with ID " + product.getProductId() + " not found.");
        }
    }

    // Overloaded method to update only the price of an existing product
    public void updateProduct(String productId, double newPrice) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.setPrice(newPrice);
            inventory.put(productId, product);
            System.out.println("Product price updated successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Method to delete a product from the inventory
    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Method to retrieve a product by its ID
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    // Method to retrieve all products in the inventory
    public List<Product> getAllProducts() {
        return new ArrayList<>(inventory.values());
    }

    // Method to check if a product is available in the inventory
    public boolean isProductAvailable(String productId) {
        return inventory.containsKey(productId);
    }

    // Method to calculate the total value of the inventory
    public double getTotalInventoryValue() {
        double totalValue = 0.0;
        for (Product product : inventory.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    // Method to update the quantity of a specific product
    public void updateProductQuantity(String productId, int quantity) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            inventory.put(productId, product); // Update the inventory with the new quantity
            System.out.println("Product quantity updated successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
}
