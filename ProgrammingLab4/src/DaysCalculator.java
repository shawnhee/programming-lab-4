//Author's name: Shawn Song-Yang Hee
//Matric Number: 227845
//Lab No: 4
import java.util.Scanner;
public class DaysCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a month: "); //Prompt user input month
		int month = keyboard.nextInt(); //User input month in integer e.g. January as 1
		System.out.print("Please enter a year:"); //Prompt user input year
		int year = keyboard.nextInt(); //User inputs year
		
		//If user inputs the month of february which is 2, check for leap year
		if (month==2) {
			//If leap year: the year is divisible by 4, and if it is century leap year, only if divisible by 400
			if (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println ("February "+year+" has 29 days");
			}
			//If not leap year
			else {			
				System.out.println ("February "+year+" has 28 days");
			}
		}
		else if (month==1) {
			System.out.println ("January "+year+" has 31 days"); //Print days for January if user input month as 1
		}
		else if (month==3) {
			System.out.println ("March "+year+" has 31 days"); //Print days for March if user input month as 3
		}
		else if (month==4) {
			System.out.println ("April "+year+" has 30 days"); //Print days for April if user input month as 4
		}
		else if (month==5) {
			System.out.println ("May "+year+" has 31 days"); //Print days for May if user input month as 5
		}
		else if (month==6) {
			System.out.println ("June "+year+" has 30 days"); //Print days for June if user input month as 6
		}
		else if (month==7) {
			System.out.println ("July "+year+" has 31 days"); //Print days for July if user input month as 7
		}
		else if (month==8) {
			System.out.println ("August "+year+" has 31 days"); //Print days for August if user input month as 8
		}
		else if (month==9) {
			System.out.println ("September "+year+" has 30 days");//Print days for September if user input month as 9
		}
		else if (month==10) {
			System.out.println ("October "+year+" has 31 days"); //Print days for October if user input month as 10
		}
		else if (month==11) {
			System.out.println ("November "+year+" has 30 days"); //Print days for November if user input month as 11
		}
		else if (month==12) {
			System.out.println ("December "+year+" has 31 days"); //Print days for December if user input month as 12
		}
		else {
			System.out.println ("Invalid Value"); //Print error if user inputs month more than 12
		}
	}
}