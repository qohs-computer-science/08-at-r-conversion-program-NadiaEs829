/*
 * TO DO: Name: Nadia Escamilla
 * TO DO: Date:9/17/24
 * TO DO: Class Period:7
 * TO DO: Program Description: Decimal and Binary conversions
 */

import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Welcome! You have the following options");
		System.out.println("1. Decimal to Binary");
		System.out.println("2. Binary to Decimal");
		System.out.println("Which type of conversion would would you like to preform?");
		int option = input.nextInt();

		while(option != 1 && option != 2){
			System.out.println("You have two conversion options. Which one do you want to do?");
			int option1 = input.nextInt();
		}//end while

		if(option == 1){
			System.out.println("What is the decimal number?");
			int deciNum = input.nextInt();
		}//end if

		if(option == 2){
			System.out.println("What is the binary number?");
			int BiNum = input.nextInt();
		}//end if

		//next step is to make 2 classes for binary and decimal
		//after *return* the number
		
	}//end main

}//end class