/**
 * Calculate in interaction mode
 * @author pertiol
 * @date 14.07.2015
 * @version 1.1
 */

import java.util.Scanner;
import java.util.*;

public class InteractRunner {
	
	public static void main(String[] args) {
		/**
		 * Create new instance of Scanner class
		 */
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		/**
		 * Create new instance of Calculator class
		 */
		Calculator calc = new Calculator();
		/**
		 * Strings for storing user inputs
		 */
		String exit = "no";
		String enter = "";
		/**
		 * Variable for check whether need to save result
		 */
		boolean saveResult = false;
		double first = 0, second = 0;
		try{
			/**
			 * Loop performing while user won't input "yes"
			 */
			while(!exit.equals("yes")) {
				System.out.println("Enter the first number: ");
				/**
				 * Check whether user wanted to save result <br>
				 * if no - take next number for scan <br>
				 * if yes - get result
				 */
				if(!saveResult)
					first = scan.nextDouble();
				else {
					enter = scan.next();
					if (enter.equals("MR"))
						first = calc.getResult();
					else
						first = Double.valueOf(enter);
				}
				System.out.println("Choose operation for calculation (/, *, +, -, ^): ");
				String operation = scan.next();
				System.out.println("Enter the second number: ");
				if(!saveResult)
					second = scan.nextDouble();
				else {
					enter = scan.next();
					if (enter.equals("MR"))
						second = calc.getResult();
					else
						second = Double.valueOf(enter);
				}
				/**
				 * Prevent dividing by zero
				 */				
				if (second == 0) {
					System.out.println("Error. Dividing by zero.");
					continue;
				}
				/**
				 * Check operation for performing, if incorrect - continue loop from beginning
				 */
				if(operation.equals("+"))
					calc.add(first, second);
				else if(operation.equals("*"))
					calc.mult(first, second);
				else if(operation.equals("-"))
					calc.sub(first, second);
				else if(operation.equals("/"))
					calc.div(first, second);
				else if(operation.equals("^"))
					calc.pow(first, second);
				else {
					System.out.println("Incorrect operation.");
					continue;
				}
				System.out.println("Result is " + calc.getResult());
				/**
				 * Ask if user want to quit and store answer to "exit"
				 */
				System.out.println("Do you want to quit? (\"yes\" or \"no\")");
				exit = scan.next();
				if (exit.equals("yes"))
					break;
				/**
				 * Ask if user want to save, if yes - change saveResult to true
				 */
				System.out.println("Do you want to save result? (\"yes\" or \"no\")");
				if (scan.next().equals("yes")) {
					saveResult = true;
					System.out.println("Type \"MR\" instead needed operand to recall result from memory.");
				} else {
					saveResult = false;
					calc.clearResult();
				}
			}
		/**
		 * Catch possible exceptions
		 */
		} catch (NumberFormatException | InputMismatchException e) {
			System.out.println("Error occurred.");
		}
		scan.close();		
		
	}
	
}