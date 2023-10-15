package com.acts.mart.item;

import java.util.ArrayList;

public class Stock {
	
	static ArrayList<ItemClass> stockList = new ArrayList<>();
	
	public static ArrayList<ItemClass> getStockList() {
		return stockList;
	}

	public static void setStockList(ArrayList<ItemClass> stockList) {
		Stock.stockList = stockList;
	}

	// add new item to the stock 
	static public void addNewStock(ItemClass newItem ) {
		stockList.add(newItem);
	}
	
	// addStock
	// TODO to increase the stock of the available items. 
	
	
	static public void updateStock(ArrayList<ItemClass> userCart) {
		for( ItemClass c : userCart) {
			
			// check if the stock has that item available 
			// and update its quantity 
			
			//if(stockList.contains(i.getItemName())){
				for(ItemClass s : stockList) {
					
					// if the item name that the user entered 
					// is in stock decrease its quantity from the stock 
					
					if(s.getItemName().equals(c.getItemName())) {
						s.setQuantity(s.getQuantity() - c.getQuantity());
					}
				}	
		}
	}
	
	public static void printStockItems()
	{
		if(stockList.isEmpty()) {
			System.out.println("No items in inventory. ");
		}
		else {
			for(ItemClass c:stockList) {
				System.out.println("Item Name: "+ c.getItemName()+
						   " Quantity: "+c.getQuantity()+
						   " Price : " + c.getPrice());
			}
			
		}
		
	}

	public static void updateInventory(String stockName, int stockQuantity) {
		// TODO Auto-generated method stub
		for(ItemClass c : stockList) {
			if(c.getItemName().equals(stockName.toLowerCase())) {
				c.setQuantity(c.getQuantity() + stockQuantity);
				break;
			}
		}
	}
}	
