package com.acts.mart.item;

public class ItemClass {
	private String itemName; 
	private int itemId; 
	private static int ITEM_ID_COUNT = 100; 
	private double price; 
	private int quantity;
	private double amount;
	private int gst; 
	
	
	public ItemClass(String itemName, double price, int quantity, int gst) {
		this.itemId = ITEM_ID_COUNT++; 
		this.itemName = itemName.toLowerCase();
		this.price = price; 
		this.quantity = quantity; 
		this.gst = gst; 
	}
	
	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public ItemClass(String itemName, int quantity) {
		//this.itemId = ITEM_ID_COUNT++; 
		this.itemName = itemName.toLowerCase();
		this.quantity = quantity;
		this.amount=0.0;
	}
	
	
	public String getItemName() {
		return itemName.toLowerCase();
	}

	public void setItemName(String itemName) {
		this.itemName = itemName.toLowerCase();
	}

	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public static int getITEM_ID_COUNT() {
		return ITEM_ID_COUNT;
	}



	public static void setITEM_ID_COUNT(int iTEM_ID_COUNT) {
		ITEM_ID_COUNT = iTEM_ID_COUNT;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getItemDetails() {
		return  "Name : "+ itemName+
				"Price: " + price + 
				"Quantity : " + quantity + 
				"Item ID : " + itemId;  
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}