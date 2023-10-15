package com.acts.mart.item;

import java.util.ArrayList;

public class Cart {
	// 
	static ArrayList<ItemClass> cartList = new ArrayList<>();

	public static void addItem(ItemClass userItem) {
		int flag=0;
		for(ItemClass s : cartList) {
			if(s.getItemName().equals(userItem.getItemName()))
			{
				s.setQuantity(s.getQuantity()+userItem.getQuantity());
				flag=1;
				break;
			}
		}
		if(flag == 0) {
			cartList.add(userItem);
		}


	}

	public static void printItems()
	{
		for(ItemClass c:cartList)
			System.out.println("Item Name: "+c.getItemName()+
					" Quantity: "+c.getQuantity());
	}

	public static ArrayList<ItemClass> getCartList() {
		return cartList;
	}

	public static void setCartList(ArrayList<ItemClass> cartList) {
		Cart.cartList = cartList;
	}

	public static void generateBill ( ArrayList <ItemClass> stockList)
	{
		double totalAmount = 0.0; 

		for(ItemClass c: cartList) {
			for(ItemClass s: stockList) {
				if(c.getItemName().equals(s.getItemName())) {
					c.setAmount(
							(c.getQuantity()*s.getPrice()) +  ((c.getQuantity()*s.getPrice()*s.getGst()) / 100) 
							);
					totalAmount += c.getAmount();
				}
			}
		}

		for(ItemClass c: cartList) {
			for(ItemClass s:stockList)
			{
				if(c.getItemName().equals(s.getItemName())){

					System.out.println("Item Name: "+c.getItemName()+
							" Quantity: "+ c.getQuantity()+
							" Price: "+s.getPrice()+
							" GST : "+s.getGst()+
							" Amount : " + c.getAmount());
				}
			}
		}
		System.out.println("\nTotal payable amount : " + totalAmount
							+ "\n\n THANK YOU FOR SHOPPING WITH US ! ");
	}

	public static void removeItem(String itemName) {
		for(ItemClass c : cartList) {
			if(c.getItemName().equals(itemName.toLowerCase())) {
				cartList.remove(c);
				break; 
			}
		}


	}
}









