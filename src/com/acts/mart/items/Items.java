package com.acts.mart.items;

public class Items {
			private int itemNumber;
			private String itemName;
			private double price;
			private double discount;
			private double gstSlab;
			private double stock;
			private double quantityPurchased;
			public static final double ZERO = 0;
			public static final String EMPTY = "";
			public static int count = 1;
			
			public Items() {
				this.itemNumber = 0;
				this.itemName = EMPTY;
				this.price = ZERO;
				this.discount = ZERO;
				this.gstSlab = ZERO;
				this.stock = ZERO;
				this.quantityPurchased = ZERO;
			}
			
			public Items(String itemName, double price, double discount, double gstSlab, double stock) {
				this.itemNumber = count++;
				this.itemName = itemName;
				this.price = price;
				this.discount = discount;
				this.gstSlab = gstSlab;
				this.stock = stock;
				this.quantityPurchased = ZERO;
			}
			
			public double costPrice() {
				return (this.price*(1-this.discount/100))*(1+gstSlab/100);
			}
			public double discountPrice() {
				return (this.price*this.discount/100);
			}
			
			public double totalPrice() {
				return this.quantityPurchased*this.costPrice();
			}

			public int getItemNumber() {
				return itemNumber;
			}

			public void setItemNumber(int itemNumber) {
				this.itemNumber = itemNumber;
			}

			public String getItemName() {
				return itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public double getDiscount() {
				return discount;
			}

			public void setDiscount(double discount) {
				this.discount = discount;
			}

			public double getGstSlab() {
				return gstSlab;
			}

			public void setGstSlab(double gstSlab) {
				this.gstSlab = gstSlab;
			}

			public double getStock() {
				return stock;
			}

			public void setStock(double stock) {
				this.stock += stock;
			}

			public double getQuantityPurchased() {
				return quantityPurchased;
			}

			public void setQuantityPurchased(double quantityPurchased) {
				stock -= quantityPurchased;// dec stock increase qty
				this.quantityPurchased += quantityPurchased; 
			}

			
			public String display() {
				return "[ Item Name = " + this.itemName + ", Price = Rs " + this.price  + ", Stock = "+this.stock + " ] ";
			}
			
			@Override
			public String toString() {
				return "[ Item Name = " + this.itemName + ", Price = Rs " + this.price + ", Discount = " + this.discount + "%, GST = "
						+ this.gstSlab + "%, Quantity Purchased = " + this.quantityPurchased + ", Total Price = Rs " + this.totalPrice() + " ] ";
			}
			
			
			
			
}
