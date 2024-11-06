import java.util.Scanner;
public class DaysCalculatorSwitchCase {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a month: ");
		int month = keyboard.nextInt();
		System.out.print("Please enter a year:");
		int year = keyboard.nextInt();

	    boolean leapYear = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	        	leapYear = true;
	        else
	        	leapYear = false;
	      }
	      
	      // if the year is not century
	      else
	        leapYear = true;
	    }
	    
	    else
	    	leapYear = false;
	    
		switch(month) {
			case 1 : System.out.println("January "+year+" has 31 days");
			break;
			case 2 : if (leapYear) {
				System.out.println("February "+year+" has 29 days");
			}
			else {
				System.out.println("February "+year+" has 28 days");
			}
			break;
			case 3 : System.out.println("March "+year+" has 31 days");
			break;
			case 4 : System.out.println("April "+year+" has 30 days");
			break;
			case 5 : System.out.println("May "+year+" has 31 days");
			break;
			case 6 : System.out.println("June "+year+" has 30 days");
			break;
			case 7 : System.out.println("July "+year+" has 31 days");
			break;
			case 8 : System.out.println("August "+year+" has 31 days");
			break;
			case 9 : System.out.println("September "+year+" has 30 days");
			break;
			case 10 : System.out.println("October "+year+" has 31 days");
			break;
			case 11 : System.out.println("November "+year+" has 30 days");
			break;
			case 12 : System.out.println("December "+year+" has 31 days");
			break;
			default: System.out.println("Invalid input!");
			break;
		}
	}
}
