package app;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner scc = new Scanner(System.in);

		System.out.print("\n\nHello! Welcome to Balloons N' Thangs!\n\nWhat is the price of your item? ");

		double cost = scc.nextDouble();

		System.out.print(

				"\nNow don't be alarmed....but this is a stick up!!!\n\nJust kidding.... It's called \"inflation\".\n\nBut you do need to fork over some money, how much are you coughing up?: ");

		double have = scc.nextDouble();

		scc.nextLine();

		double needPay = (cost - have);
		Math.round((needPay * 100) / 100.);

		int lincon = (int) ((have - cost) * 100);

		int franklin = lincon / 10000;
		lincon = lincon % 10000;

		int grant = lincon / 5000;
		lincon = lincon % 5000;

		int samJackson = lincon / 2000;
		lincon = lincon % 2000;

		int hamilton = lincon / 1000;
		lincon = lincon % 1000;

		int abe = lincon / 500;
		lincon = lincon % 500;

		int george = lincon / 100;
		lincon = lincon % 100;

		int washington = lincon / 25;

		lincon = lincon % 25;

		int fdr = lincon / 10;

		lincon = lincon % 10;

		int jefferson = lincon / 5;

		lincon = lincon % 5;

		if (cost > have) {

			System.out.println("\n\nPlease add the remaining balance of: " + Math.round(needPay * 100) / 100.0
					+ "\n\nany combination of cash, credit, debit, and first born... will be accepted");
			needPay = scc.nextDouble();

			System.out.println("Thank you for settling up!");
		}

		if (cost == have) {
			zero();

		}

		if (franklin == 1)

			System.out.println("\nyou get: " + franklin + " hundred dollar bill");
		else if (franklin > 0)

			System.out.println("\nyou get: " + franklin + " hundred dollar bills");
		if (grant == 1)

			System.out.println("\nyou get: " + grant + " fifty dollar bill");
		else if (grant > 0)

			System.out.println("\nyou get: " + grant + " fifty dollar bills");
		if (samJackson == 1)

			System.out.println("\nyou get: " + samJackson + " twenty dollar bill");
		else if (samJackson > 0)

			System.out.println("\nyou get: " + samJackson + " twenty dollar bills");

		if (hamilton == 1)

			System.out.println("\nyou get: " + hamilton + " ten dollar bill");

		else if (hamilton > 0)

			System.out.println("\nyou get: " + hamilton + " ten dollar bills");

		if (abe == 1)

			System.out.println("\nyou get: " + abe + " five dollar bill");

		else if (abe > 0)

			System.out.println("\nyou get: " + abe + " five dollar bills");

		if (george == 1)

			System.out.println("\nyou get: " + george + " one dollar bill");

		else if (george > 0)

			System.out.println("\nyou get: " + george + " one dollar bills");

		if (washington == 1)

			System.out.println("\nyou get: " + washington + " quarter");

		else if (washington > 0)

			System.out.println("\nyou get: " + washington + " quarters");

		if (fdr == 1)

			System.out.println("\nyou get: " + fdr + " dime");

		else if (fdr > 0)

			System.out.println("\nyou get: " + fdr + " dimes");

		if (jefferson == 1)

			System.out.println("\nyou get: " + jefferson + " nickel");

		else if (jefferson > 0)

			System.out.println("\nyou get: " + jefferson + " nickels");

		if (lincon == 1)

			System.out.println("\nyou get: " + lincon + " cent");

		else if (lincon > 0)

			System.out.println("\nyou get: " + lincon + " cents");

		scc.close();
	}

	public static void zero() {
		System.out.println("\n\nThank you for paying with exact change, have a nice day!");
	}
}
