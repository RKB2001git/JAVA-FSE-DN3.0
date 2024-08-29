package Ecommerce_platform_search_dsa;

import java.util.Arrays;
import java.util.Comparator;

public class seachAlgorithms {

		public static Product linearSearch(Product[] products, String productName) {
	        for (Product product : products) {
	            if (product.getProductName().equalsIgnoreCase(productName)) {
	                return product;
	            }
	        }
	        return null; // Product not found
	    }

	    public static Product binarySearch(Product[] products, String productName) {
	        int left = 0;
	        int right = products.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            int result = productName.compareToIgnoreCase(products[mid].getProductName());

	            // Check if productName is present at mid
	            if (result == 0) {
	                return products[mid];
	            }

	            // If productName is greater, ignore the left half
	            if (result > 0) {
	                left = mid + 1;
	            } else {
	                // If productName is smaller, ignore the right half
	                right = mid - 1;
	            }
	        }
	        return null; // Product not found
	    }

	    public static void main(String[] args) {
	        Product[] products = {
	            new Product(1, "Laptop", "Electronics"),
	            new Product(2, "Smartphone", "Electronics"),
	            new Product(3, "Table", "Furniture"),
	            new Product(4, "Chair", "Furniture"),
	            new Product(5, "Headphones", "Electronics")
	        };

	        // Perform Linear Search
	        Product result = linearSearch(products, "Table");
	        System.out.println("Linear Search Result: " + (result != null ? result : "Product not found"));

	        // Sort before Binary Search
	        Arrays.sort(products, Comparator.comparing(Product::getProductName));

	        // Perform Binary Search
	        result = binarySearch(products, "Smartphone");
	        System.out.println("Binary Search Result: " + (result != null ? result : "Product not found"));
	    }
	}



