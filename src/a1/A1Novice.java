package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		// Read in count of customers to process
		// count: the total number of customers
		int count = scan.nextInt();

		// Make a loop so the scanner gets information from
		// every customer
		for (int i = 0; i < count; i++) {
			// Read in customer information
			// itemAmt: number of items bought by the customer
			String firstName = scan.next();
			String lastName = scan.next();
			int itemAmt = scan.nextInt();
			double total = 0;

			// Run for loop so that the scanner will get all the
			// information for EACH item
			for (int j = 0; j < itemAmt; j++) {
				// quant: quantity of the item bought
				// Read in item information for one item
				int quant =  scan.nextInt();;
				double price = scan.nextDouble();
				total += (quant * price);
			}
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + total);
		}


		scan.close();


	}

}
