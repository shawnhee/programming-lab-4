//Author's name: Shawn Song-Yang Hee
//Matric Number: 227845
//Lab No: 4
import java.util.Scanner;
public class weightCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter an object's mass in kg: "); //Prompt user to input object mass
		double mass = keyboard.nextDouble(); //User inputs object mass
		double weight = mass * 9.8; //System converts object mass to weight in Newtons
		if (weight > 1000)
			System.out.println("It is too heavy"); //If weight is more than 1000Newtons, display as overweight
		else if (weight < 0) 
			System.out.println("Invalid input"); //If weight is negative, display as invalid
		else if (weight < 10) 
			System.out.println("It is too light"); //If weight is less than 10Newtons, display as underweight
		else
			System.out.println("It is normal"); //If weight between 10 t0 1000Newton, display as normal
				
	}
}
