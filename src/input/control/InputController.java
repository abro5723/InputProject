package input.control;

import java.util.Scanner;

public class InputController
{
	// Declaration section for instance variables.
	// Data member are always private.
	private Scanner inputScanner;

	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}

	public void start()
	{
		questions(); 
		questions();
	}
	private void questions()
	{
		System.out.println("Schreib dien name");
		String myInput;
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hallo " + myInput + ", Wie gehts?");
		System.out.println("Did you type more than one name? I am sorry, please type your full name ");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is: " + fullName);
		System.out.println("My name is Java");
		System.out.println("Wie Jahre alt bist du?");
		int age = inputScanner.nextInt();
		System.out.println("You are " + age + " years old? nice!");
	}

}
