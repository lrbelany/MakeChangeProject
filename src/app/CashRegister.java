package app;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);

 boolean inStore = true;		
		boolean oweStore = false;
		System.out.print("\n\nHello! Welcome to Balloons N' Thangs!\n\nWhat is the price of your item? ");
		double cost = scc.nextDouble();
		
		System.out.print(
				"\nNow don't be alarmed....but this is a stick up!!!\n\nJust kidding.... It's called \"inflation\".\n\nBut you do need to fork over some money, how much are you coughing up?: ");
		Double have = scc.nextDouble();
scc.nextLine();
		int remainingBalance = (int)(cost - have);
		int needPay = (int)(remainingBalance);
		while (cost < have) {

			int lincon = (int) (have * 100);

			int george = lincon / 100;
			lincon = lincon % 100;

			int abe = george / 5;
			george = george % 5;

			int hamilton = abe / 2;
			abe = abe % 2;

			int samJackson = hamilton / 2;
			hamilton = hamilton % 2;

			int washington = lincon / 25;
			lincon = lincon % 25;

			int fdr = lincon / 10;
			lincon = lincon % 10;

			int jefferson = lincon / 5;
			lincon = lincon % 5;

			if (cost == have)
				System.out.println("\n\nThank you for paying with exact change, have a nice day!");
			
			else if (samJackson > 0)
				System.out.println("you get: " + samJackson + " twenty dollar bills");
			
			 if (hamilton == 1)
				System.out.println("you get: " + hamilton + " ten dollar bill");
			else if (hamilton > 0)
				System.out.println("you get: " + hamilton + " ten dollar bills");

			 if (abe == 1)
				System.out.println("you get: " + abe + " five dollar bill");
			else if (abe > 0)
				System.out.println("you get: " + abe + " five dollar bills");

			 if (george == 1)
				System.out.println("you get: " + george + " one dollar bill");
			else if (george > 0)
				System.out.println("you get: " + george + " one dollar bills");

			 if (washington == 1)
				System.out.println("you get: " + washington + " quarter");
			else if (washington > 0)
				System.out.println("you get: " + washington + " quarters");

			 if (fdr == 1)
				System.out.println("you get: " + fdr + " dime");
			else if (fdr > 0)
				System.out.println("you get: " + fdr + " dimes");

			if (jefferson == 1)
				System.out.println("you get: " + jefferson + " nickel");
			else if (jefferson > 0)
				System.out.println("you get: " + jefferson + " nickels");

			if (lincon == 1)
				System.out.println("you get: " + lincon + " cent");
			else if (lincon > 0)
				System.out.println("you get: " + lincon + " cents");
break;		}
		while(cost > have)	 
		if (cost > have) {
			 System.out.println("Please add the remaining balance of: " + needPay);
			 needPay = scc.nextInt();
			 System.out.println("Thank you for settling up!");
			 
			 scc.nextInt();
		}
	scc.close();
	}

}
