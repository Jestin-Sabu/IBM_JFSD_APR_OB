package com.ibm.shop;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> products;
	private int size;
	private double total;

	public ShoppingCart() {
		products = new ArrayList<>(5);
		total = 0;
		size = 0;
	}

	public void addToCart(Product product) throws ShoppingCartException {
		if (size < 5) {
			products.add(product);
			total += product.getPrice();
			size++;
		} else {
			throw new ShoppingCartException("Cart already full");
		}
	}

	public void checkOut() {
		System.out.printf("\n%-7s%-15s%-15s\n", "Sl.no", "Products", "Price");
		System.out.println("-------------------------------------");
		int i=0;
		for (Product product: products) {
			System.out.printf("%-7d%-15s%-15.2f\n", ++i, product.getName(), product.getPrice());
		}
		System.out.println("-------------------------------------");
		System.out.printf("%-7s%-15sRs %-12.2f\n", "", "Total:", total);
	}
}
