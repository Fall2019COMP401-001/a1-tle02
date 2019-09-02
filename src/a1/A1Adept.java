package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Create arrays to store item name and price information.
		// count: number of total potential items
		int count = scan.nextInt();

		// Make arrays to store info on the list of items and their prices.
		String[] itemList = new String[count];
		double[] priceList = new double[count];
		
		// Put values into the arrays.
		for (int i = 0; i < count; i++) {
			itemList[i] = scan.next();
			priceList[i] = scan.nextDouble();
		}
		
		// Read in count of customers to process.
		// cust: amount of customers 
		int cust = scan.nextInt();
		String[] custNames = new String[cust];
		// custTotals: total amount of money one customer spends
		double[] custTotals = new double[cust];
		
		// Make a loop so the scanner gets information from
		// every customer
		for (int i = 0; i < cust; i++) {
			// Read in customer information
			// itemAmt: number of items bought by the customer
			String firstName = scan.next();
			String lastName = scan.next();
			double itemAmt = scan.nextDouble();
			
			custNames[i] = firstName + " " + lastName;
		
			double total = 0;
			
			// Read through what items a customer has, and how much of it.
			for (int j = 0; j < itemAmt; j++) {
				double quant = scan.nextDouble();
				String itemName = scan.next();
				
				// Read each of customer's items to find total cost.
				for (int k = 0; k < count; k++) {
					if (itemName.equals(itemList[k])) {
						total += (quant * priceList[k]);
					}
				}
				
			}
			
			// Put each customer's total in array for future comparison use.
			custTotals[i] = total;

			
		}
		
		scan.close();
		
		// Loop through the totals to find the smallest spender
		// Declare variables to store the current customer's information
		double currentMin = custTotals[0];
		String currentCust1 = custNames[0]; 
		
		// Compare values in array with current minimum.
		// Replace if new value is smaller.
		for (int i = 0; i < custTotals.length; i++) {
			if (custTotals[i] < currentMin) {
				currentMin = custTotals[i];
				currentCust1 = custNames[i];
			}
		}
		String small =  String.format("%.2f", currentMin);
		String smallCust = currentCust1;

		// Loop through the totals to find the biggest spender
		// Declare variables to store the current customer's information
		double currentMax = custTotals[0];
		String currentCust2 = custNames[0]; 
		
		// Compare values in array with current maximum.
		// Replace if new value is bigger.
		for (int i = 0; i < custTotals.length; i++) {
			if (custTotals[i] > currentMax) {
				currentMax = custTotals[i];
				currentCust2 = custNames[i];
			}
		}
		String big =  String.format("%.2f", currentMax);
		String bigCust = currentCust2;
		
		// Go through each customer's total to calculate the average
		double total = 0;
		
		for(int i = 0; i < custTotals.length; i++) {
			total += custTotals[i];
		}
		String avg = String.format("%.2f", (total / custTotals.length));
		
		// Print results
		System.out.println("Biggest: " + bigCust + " (" + big + ")");
		System.out.println("Smallest: " + smallCust + " (" + small + ")");
		System.out.println("Average: " + avg);
		
	}
	

	
}
