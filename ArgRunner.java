/**
 * Calculate in command line
 * Use: java ArgRunner firstNumber operation secondNumber
 * @author pertiol
 * @date 14/07/2015
 * @version 1.0
 */

public class ArgRunner {
	
	public static void main(String[] args) {
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
		if(operation.equals("+"))
			calc.add(first, second);
		else if(operation.equals("*"))
			calc.mult(first, second);
		else if(operation.equals("-"))
			calc.sub(first, second);
		else if(operation.equals("/"))
			calc.div(first, second);
		else {
			System.out.println("Incorrect operation.");
		}
		/**
		 * Show result
		 */
		System.out.println("Result is " + calc.getResult());
	}
	
}