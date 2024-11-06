//Author's name: Shawn Song-Yang Hee
//Matric Number: 227845
//Lab No: 4
import java.util.Scanner;
public class scorePrompt {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter your score: "); //Prompt user to submit their score
		int score = keyboard.nextInt(); //User inputs score
		if (score >= 60)
			System.out.println("You pass the exam"); //Pass the exam if score is greater or equals to 60
		else
			System.out.println("You dont pass the exam"); //Fail the exam if the score is less than 60
	}
}
