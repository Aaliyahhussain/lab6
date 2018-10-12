package lab6;

import java.util.Scanner;
import java.util.Random;

public class Lab6DiceRolling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
			String again = "y";
			int die1 = rand.nextInt(20) + 1;
			int die2 = rand.nextInt(20) + 1;
			int sides = 20;
			int userInput;
			
		
		
		System.out.println("Welcome to the Grand Circus Casino!" + " ");
	  
		 
	    System.out.println("How many sides should each die have? " + " ");
	    System.out.println("Roll 1: ");

		userInput = scnr.nextInt();
		
		  die1 = (int)(Math.random()*20) + 1;
	      die2 = (int)(Math.random()*20) + 1;
	      int roll = die1 + die2;
	        
	        System.out.println(die1);
	        System.out.println(die2);
	        
	        char userContinue = 'y';
	        while( userContinue == 'y') {
		
		System.out.print("Roll again (y = yes)? ");
		userContinue = scnr.next().charAt(0);
		
			for (int i = 1; i <= userInput; i++) {
			
			}
	        
	}
	}
			private static int generateRandomDieRoll(int i) {
			generateRandomDieRoll(20);
					return i;
		
	  	}
	      
		
		}
		
		
	
