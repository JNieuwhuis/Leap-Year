package leapYear;
import java.util.Scanner;

public class leapYear {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What year do you want to check for leap year?  ");
		int year = input.nextInt();
		input.close();
		
		if (year%400 == 0) {
			System.out.println("This year is a leap year!");
		}
		else if (year%100 == 0) {
			System.out.println("This year is not a leap year.");
		}
		else if (year%4 == 0) {
			System.out.println("This year is a leap year!");
		}
		else {
			System.out.println("This year is not a leap year!");
		}
	}
}
/* Things to work on:
*Make the program output all the years(from a setpoint) that are leap years.
*Work with OO.
*Correct for wrong entries.
*/