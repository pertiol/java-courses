package com.lessons;
/**
 * Calculate in command line
 * Use: java ArgRunner firstNumber operation secondNumber
 * @author pertiol
 * @version 1.0
 */

public class ArgRunner {
	
	public static void main(String[] args) throws UserException {
		/**
		 * Generate UserException if there are no three args
		 */
		if (args.length != 3) throw new UserException("You should insert 2 number and operation, i.e. (2 / 2)");
		/**
		 * Initialize numbers and operation type
		 */
		double first = Double.valueOf(args[0]);
		String operation = args[1];
		double second = Double.valueOf(args[2]);
		Calculator calc = new Calculator();
		/**
		 * Check operation for performing, if incorrect - show message to user
		 */
        switch (operation) {
            case "+":
                calc.add(first, second);
                break;
            case "*":
                calc.mult(first, second);
                break;
            case "-":
                calc.sub(first, second);
                break;
            case "/":
                calc.div(first, second);
                break;
            default:
                System.out.println("Incorrect operation.");
                break;
        }
		/**
		 * Show result
		 */
		System.out.println("Result is " + calc.getResult());
	}
	
}