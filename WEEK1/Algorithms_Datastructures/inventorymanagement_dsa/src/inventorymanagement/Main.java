package inventorymanagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Inventory inventory = new Inventory();

		        // Adding products
		        Product product1 = new Product("P001", "Laptop", 10, 999.99);
		        Product product2 = new Product("P002", "Smartphone", 20, 499.99);

		        inventory.addProduct(product1);
		        inventory.addProduct(product2);

		        // Updating a product's price
		        inventory.updateProduct("P001", 949.99);

		        // Updating a product's details
		        product1.setProductName("Gaming Laptop");
		        inventory.updateProduct(product1);

		        // Getting and displaying a product
		        Product retrievedProduct = inventory.getProduct("P001");
		        if (retrievedProduct != null) {
		            System.out.println("Retrieved Product: " + retrievedProduct.getProductName() +
		                               ", Quantity: " + retrievedProduct.getQuantity() +
		                               ", Price: $" + retrievedProduct.getPrice());
		        }

		        // Listing all products
		        System.out.println("All Products:");
		        for (Product product : inventory.getAllProducts()) {
		            System.out.println(product.getProductName() + ": " + product.getQuantity() + " units");
		        }

		        // Checking availability
		        System.out.println("Is product P001 available? " + inventory.isProductAvailable("P001"));

		        // Updating product quantity
		        inventory.updateProductQuantity("P001", 15);

		        // Deleting a product
		        inventory.deleteProduct("P002");

		        // Calculating total inventory value
		        System.out.println("Total Inventory Value: $" + inventory.getTotalInventoryValue());
		    }
		

	}


