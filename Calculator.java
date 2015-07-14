/**
	Calculator for command line
*/

public class Calculator {
	private double result;
	
	void add(double first, double second){
		result = first + second;
	}
	
	void div(double first, double second){
		result = first / second;
	}
	
	void mult(double first, double second){
		result = first * second;
	}
	
	void sub(double first, double second){
		result = first - second;
	}
	
	void pow(double first, double second) {
		result = Math.pow(first, second);
	}
	void clearResult(){
		result = 0;
	}
	
	double getResult() {
		return result;
	}
}