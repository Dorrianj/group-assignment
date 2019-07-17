package day7;

import java.util.Scanner;

public class theDubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner code = new Scanner(System.in);
		
		
	int bye = 5;
	int hi = 10; 
	int back = 0;
	String name = "";
	String color = "";
			
		
		
		System.out.println("welcome to dubs calculator");
		System.out.println("enter your name");
		name= code.next();
		System.out.println("whats your favorite color");
		color= code.next();
		System.out.println("enter a number");
		bye= code.nextInt(); 
		System.out.println("enter a number");
		back= code.nextInt();
		System.out.println("this is the sum "+hi);
		hi= bye+ back;
		System.out.println(hi);
		System.out.println("this is the difference "+hi);
		hi= bye- back;
		System.out.println(hi);
		System.out.println("this is the quotion "+hi);
		hi= bye/ back;
		System.out.println(hi);
		System.out.println("this is the product "+hi);
		hi= bye* back;
		System.out.println(hi);
		 System.out.println("thanks for your participation " + name + ( "rate the calculator on a scale from 1-5"));
		 int be1 = 2;
				 int be11 = code.nextInt();
		 System.out.println("thank you "+ name + " for rating the calculator a " + be11);
		code.close();
		
		
	}

}
