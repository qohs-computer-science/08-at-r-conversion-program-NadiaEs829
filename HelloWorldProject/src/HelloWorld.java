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
			string biNum = input.nextLine();
		}//end if

			BinaryToDeci(biNum);
		//next step is to make 2 classes for binary and decimal
		//after *return* the number

		public static void BinaryToDeci(string num){
			int ans = 0;
			int pow = 0;
			for(int i = num.length(); i >= 0; i--){
				if(num.charAt(i) == "1")
					ans += Math.pow(2,p);
				p++;
			}//end for loop
			System.out.println("Decimal equivialent of " + num + " is " + ans);
		}//end method
		
		public static int DeciToBinary(int num){
			
		}//end method
	}//end main
}//end class}