/*
 * TO DO: Name: Nadia Escamilla
 * TO DO: Date:9/17/24
 * TO DO: Class Period:7
 * TO DO: Program Description: To do Decimal and Binary conversions
 */

import java.util.Scanner;//to get user input
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;

	while(run != false){
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
			int binaryNum = deciToBinary(deciNum);
			System.out.println("Binary equivialent of " + deciNum + " is " + binaryNum);
		}//end if

		if(option == 2){
			System.out.println("What is the binary number?");
			int binary = input.nextInt();
			int decimalNum = binaryToDeci(binary);
			System.out.println("Decimal equivialent of " + binary + " is " + decimalNum);
		}//end if

		System.out.println("Do you want to continue - yes or no?");
		input.nextLine();
		String answer = input.nextLine();
		if(answer.equals("yes"))
			run = true;
		else
			run = false;
		}//end while loop
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

	public static int deciToBinary(int num){
		int ans = 0;
		int remain;
		int reverse = 1; //to reverse the order of the remainder to show up correctly
		
		while(num > 0){
			remain  = num % 2;
			num = num / 2;
			ans += remain * reverse;
			reverse *= 10;
		}//end while
		return ans;
	}//end method
}//end class