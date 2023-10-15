package com.acts.mart;
import java.util.Scanner;
import com.acts.mart.item.*;

public class YAAMartApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		byte choice1=0, choice2=0,choice3=0; 

		// Choose if you're administrator staff or customer. 

		do {
			System.out.println(
					"\n\n---------------- Main Menu ------------------" 
							+ "\nSelect if you're : \n\n"
							+ "\n1. Customer" 
							+ "\n2. Staff." 
							+ "\n0. Exit the program."
					);

			choice1 = scanner.nextByte();

			switch(choice1) {
			case 1: {
				do {

					// printing prompt for Customer. 
					System.out.println(
							"\n\n--------------- Customer Menu ------------------" 
									+ "\n1. Display available Items list with their price. " 
									+ "\n2. Item name and quantity to add to shopping cart." 
									+ "\n3. Show Shopping cart." 
									+ "\n4. Remove item from shopping cart." 
									+ "\n5. Print receipt and exit."
							);

					choice2 = scanner.nextByte();

					switch(choice2) 
					{

					case 1 : // showItemsList
						// TODO
						Stock.printStockItems();
						break;

					case 2: // addItemToCart 
						// TODO 
						// itemNotFound
						System.out.println("Enter name and quantity");
						ItemClass item = new ItemClass(scanner.next(), scanner.nextInt());
						Cart.addItem(item);
						break;

					case 3 : // showCart
						// TODO
						Cart.printItems();

						break; 

					case 4 : // Enter stock items 
						System.out.println("Enter item name to remove from the cart. ");
						Cart.removeItem(scanner.next());
						break;

					case 5: // printReceipt
						// TODO
						// also display individual item price.
						Stock.updateStock(Cart.getCartList());
						Cart.generateBill(Stock.getStockList());
						break; 

					case 0 : // exitProgram
						// TODO 
						break; 

					default:
						System.out.println("Invalid choice!!! Please make a valid choice. \n\n");	
					}


				} while( choice2 != 5 );
			}
			break;
			case 2 : {
				do {
					// printing prompt for user . 
					System.out.println(
							"\n\n--------------- Staff Menu ------------------" 
									+ "\n1. Enter new Stock items." 
									+ "\n2. Display available Items list with their price." 
									+ "\n3. Update existing item inventory."
									+ "\n0. Exit the program."
							);


					choice3 = scanner.nextByte();

					// defining switch cases. 
					switch(choice3) 
					{
					case 1 : // Enter stock items 
						System.out.println("Enter name, price, quantity, GST rates");
						ItemClass item2 = new ItemClass(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt());
						Stock.addNewStock(item2);
						break;


					case 2 : 
						// TODO
						Stock.printStockItems();
						break;

					case 3: 
						// TODO
						System.out.println("Enter name and quantity to update inventory.");
						Stock.updateInventory(scanner.next(), scanner.nextInt());
						break; 

					case 0 : // exitProgram
						// TODO 
						break; 

					default:
						System.out.println("Invalid choice!!! Please make a valid choice. \n\n");	
					}


				} while( choice3 != 0 );

			}
			break;
			}
		}while(choice1 !=0);
	}
}
