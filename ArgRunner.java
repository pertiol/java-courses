/**
	Calculate in command line
*/

public class ArgRunner {
	
	public static void main(String[] args) {
		
		double first = Double.valueOf(args[0]);
		String operation = args[1];
		double second = Double.valueOf(args[2]);
		Calculator calc = new Calculator();
		
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
		System.out.println("Result is " + calc.getResult());
	}
	
}