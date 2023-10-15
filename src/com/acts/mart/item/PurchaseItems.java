package com.acts.mart.item;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.acts.mart.items.Items;

public class PurchaseItems {

	public static void main(String[] args) throws InterruptedException {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("::Welcome to SuperMart:: \n Good Morning Mr. Manager\nEnter the total number of items :");
		int size = scanner.nextInt();
		Items[] item = new Items[size];
		double discount = 0;
		double total = 0;
		int choice, choice1, choice2, choice3, choice4;
		
		System.out.println("\nMr. Manager Please Add the initial stock "
				+ "\n(Item Name, Price, Discount, GST, Quantity)\n");
		for(int i = 0; i<size;i++) {
			System.out.printf("Enter the Item %d\n",i+1);
			item[i]= new Items(scanner.next().toUpperCase(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble());
		}
		
		do {
			
			System.out.println("::Welcome to SuperMart::\n1. Show Stock\n2. Update the stock"
					+ "\n3. Add to cart\n4. Generate Bill\n5. Close the Mall \n");			
			choice = scanner.nextInt();
			
			switch (choice) {
			
			case 1 : for(int k = 0; k<size; k++) {
				     System.out.println(item[k].display());
					}
					break;
			
			case 2 : do{
						System.out.println("::List of Items::");
						for(int i = 0; i<size; i++) {
							System.out.printf("%d.  %s\n", i+1, item[i].getItemName());
						}
						System.out.println("0. End.. \nChoose Item to update :)");
						choice3 = scanner.nextInt();
						if (choice3 !=0) {
						System.out.println("Enter the quantity : ");
						choice4 = scanner.nextInt();
						item[choice3-1].setStock(choice4);
						}
						else {
						  break;	
						}
						}while(choice3 !=0);
						break;
						
			case 3 : do{
						System.out.println("::List of Items::");
						for(int i = 0; i<size; i++) {
							System.out.printf("%d.  %s\n", i+1, item[i].getItemName());
						}
						System.out.println("0. Done... \nChoose your Item Please :)");
						choice1 = scanner.nextInt();
						if (choice1 !=0) {
						System.out.println("Enter the quantity : ");
						choice2 = scanner.nextInt();
						item[choice1-1].setQuantityPurchased(choice2);
						}
						else {
						  break;	
						}
						}while(choice1 !=0);
						break;
			case 4	: System.out.println("\nGenerating Bill....\n\n");
					   TimeUnit.SECONDS.sleep(3);
					  for(int j = 0; j<size; j++) {
						  if(item[j].getQuantityPurchased() !=0 ) {// if !=0 then purchased.
							  discount += item[j].discountPrice(); //
							  total += item[j].totalPrice(); // add all item price to total price
							  System.out.println(item[j].toString());
						  }
					  }
					  System.out.println("  Total Amount Payable : Rs "+total);
					  System.out.println("  Total Discount Received : Rs "+discount);
					  System.out.println();
					  break;
					  
			case 5  : System.out.println("\n  Good Bye!!\n::Mall Closed::");
			          System.exit(choice);
			
			default : System.out.println("\n Wrong Choice Entered....\nPlease try again!!");
					
			}
							
		}while(choice !=5 );

	scanner.close();
	}

}
