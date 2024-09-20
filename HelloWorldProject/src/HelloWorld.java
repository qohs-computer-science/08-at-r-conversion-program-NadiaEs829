/*
 * TO DO: Name: Nadia Escamilla
 * TO DO: Date:9/17/24
 * TO DO: Class Period:7
 * TO DO: Program Description: Decimal and Binary conversions
 */

import java.util.Scanner;//to get user input
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Welcome! You have the following options");
		System.out.println("1. Decimal to Binary");
		System.out.println("2. Binary to Decimal");
		System.out.println("Which type of conversion would you like to preform?");
		int option = input.nextInt();

		while(option != 1 && option != 2){
			System.out.println("You have two conversion options. Which one do you want to do?");
			option = input.nextInt();
		}//end while

		if(option == 1){
			System.out.println("What is the decimal number?");
			int deciNum = input.nextInt();

		}//end if

		if(option == 2){
			System.out.println("What is the binary number?");
			//input.nextLine();
			int binary = input.nextInt();
			int decimalNum = binaryToDeci(binary);
			System.out.println("Decimal equivialent of " + binary + " is " + decimalNum);
		}//end if

			//BinaryToDeci(biNum);
		//next step is to make 2 classes for binary and decimal
		//after *return* the number

		//public int DeciToBinary(int num){

		//}//end method
	}//end main

	 public static int binaryToDeci(int num){
		int ans = 0;
		int i = 0;
		int remain = 0;

		while(num !=0){
			remain = num % 10;
			num /= 10;
			ans += remain * Math.pow(2,i);
			i++;
		}//end while loop
		return ans;
	}//end method

}//end class}