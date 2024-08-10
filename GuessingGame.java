package task2;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	
	    public static void main(String[] args) {
	      
	        Random random = new Random();
	        int numberToGuess = random.nextInt(100) + 1; 
	        int numberOfAttempts = 0;
	        int userGuess = 0;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Guessing Game!");
	        System.out.println("I have selected a number between 1 and 100.");
	        System.out.println("Try to guess it!");

	 
	        while (userGuess != numberToGuess) {
	            System.out.print("Enter your guess: ");
	            userGuess = scanner.nextInt();
	            numberOfAttempts++;

	            if (userGuess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (userGuess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the correct number.");
	                System.out.println("It took you " + numberOfAttempts + " attempts to guess the number.");
	            }
	        }

	        scanner.close();
	    }
	}

