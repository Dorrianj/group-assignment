package day7;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sncr = new Scanner(System.in); 
		System.out.println("welcome to coding");
		
		int color = 15;
		int blue = 14;
		int yellow = 12;
		
		double bananna = 1.2;
		double computer = 1.5;
		double basics = 1.1;
		String green = "";

		System.out.println("name");
		green = sncr.next();
		System.out.println("how old are you");
		sncr.nextInt();
		
		
		
		System.out.println("enter a number");
		bananna = sncr.nextDouble();
		
		System.out.println("enter a number");
		computer = sncr.nextDouble();
		
		System.out.println("this is the sum");
	    double basics1 = computer + bananna;
		System.out.println(basics1);
		
		System.out.println("this is the difference");
		double basics11 = bananna + computer;
		System.out.println(basics11);
		
		System.out.println("this is the quotion");
		double basics3 = bananna/ computer;
		System.out.println(basics3);
		
		System.out.println("this is the product");
		double basics2 = computer* bananna;
		System.out.println(basics2);
		
		System.out.println("thanks for particpating "+ green);
		sncr.close();
		
		
		
		
	}

}
