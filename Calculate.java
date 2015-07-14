public class Calculate {
	public static void main(String[] args){
		System.out.println("Calculate..");
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double sum =  first +  second;
		System.out.println("Sum  " + sum);
		double division = first / second;
		System.out.println("Division  " + division);
		double sub = first - second;
		System.out.println("Subtraction  " + sub);
		double multiply = first * second;
		System.out.println("Multiplication  " + multiply);
		double pow = Math.pow(first, second);
		System.out.println("Power  " + pow);
	}
}