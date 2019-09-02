package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);


		// Create arrays to store item names, amount of customers who buy
		// each item, and how much of each item is bought.
		// count: total amount of potential items
		int count = scan.nextInt();
		String[] itemList = new String[count];
		int[] custAmt = new int[count];
		int[] itemQuant = new int[count];

		// Read items into an array.
		// Scan prices, just so the scanner doesn't get an error
		for (int i = 0; i < count; i++) {
			itemList[i] = scan.next();
			double price = scan.nextDouble();
		}
		
		// Read count of customers to process.
		int cust = scan.nextInt();
		
		// Make a loop so the scanner gets information from
		// every customer.
		// Information is not needed - just needs to be scanned so the 
		// scanner doesn't have an error.
		for (int i = 0; i < cust; i++) {
			// Read in customer information
			// itemAmt: number of items bought by the customer
			String firstName = scan.next();
			String lastName = scan.next();
			int itemAmt = scan.nextInt();

			// groceryList: a counter variable of sorts.
			// Used for when one customer has multiple of the same item, but purchased separately
			// - so as not to calculate each purchase as a new customer.
			int[] groceryList = new int[count];
			
			// Read through each item that a customer has.
			for (int j = 0; j < itemAmt; j++) {
				double quant = scan.nextDouble();
				String itemName = scan.next();
				
				// Read each of customer's items.
				// Put information into array, to see how many customers have
				// bought each item, and the how much of that item is bought.
				
				for (int k = 0; k < count; k++) {

					if (itemName.equals(itemList[k])) {
						itemQuant[k]+= quant;	
						if (groceryList[k] == 0) {
							custAmt[k]++;	
						}
						groceryList[k]++;
					} 
						
				}
			}
		}
		
		scan.close();
		
		// Print results
		for (int i = 0; i < count; i++) {
			if (itemQuant[i] == 0) {
				System.out.println("No customers bought " + itemList[i]);
			} else {
				System.out.println(custAmt[i] + " customers bought " + itemQuant[i] + " " + itemList[i]);
			}
		}
	}
}
