/**
	Calculate in interaction mode
*/

import java.util.Scanner;
import java.util.*;

public class InteractRunner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Calculator calc = new Calculator();
		String exit = "no";
		String enter = "";
		boolean saveResult = false;
		double first = 0, second = 0;
		try{
			while(!exit.equals("yes")) {
				System.out.println("Enter the first number: ");
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
				if (second == 0) {
					System.out.println("Error. Dividing by zero.");
					continue;
				}
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
				System.out.println("Do you want to quit? (\"yes\" or \"no\")");
				exit = scan.next();
				if (exit.equals("yes"))
					break;
				System.out.println("Do you want to save result? (\"yes\" or \"no\")");
				if (scan.next().equals("yes")) {
					saveResult = true;
					System.out.println("Type \"MR\" instead needed operand to recall result from memory.");
				} else {
					calc.clearResult();
				}
			}
		} catch (NumberFormatException | InputMismatchException e) {
			System.out.println("Error occurred.");
		}
		scan.close();		
		
	}
	
}