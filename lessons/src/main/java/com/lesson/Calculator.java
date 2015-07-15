package com.lesson;
/**
 * Calculations for ordinary operations
 * @author pertiol
 * @version 1.1
 */

public class Calculator {
	/**
	 * Instance variable for storing result
	 */
	private double result;
	/**
	* Adding two numbers
	* @param first the first number
	* @param second the second number
	* @since 1.0
	*/
	void add(double first, double second){
		result = first + second;
	}
	/**
	* Division of two numbers
	* @param first the first number
	* @param second the second number
	* @since 1.0
	*/
	void div(double first, double second){
		result = first / second;
	}
	/**
	* Multiply two numbers
	* @param first the first number
	* @param second the second number
	* @since 1.0
	*/
	void mult(double first, double second){
		result = first * second;
	}
	/**
	* Subtract two numbers
	* @param first the first number
	* @param second the second number
	* @since 1.0
	*/
	void sub(double first, double second){
		result = first - second;
	}
	/**
	* The value of the first argument raised to the power of the second argument
	* @param first the base
	* @param second the exponent
	* @since 1.1
	*/
	void pow(double first, double second) {
		result = Math.pow(first, second);
	}
	/**
	* Set result to zero
	* @since 1.0
	*/
	void clearResult(){
		result = 0;
	}
	/**
	* Return result value
	* @return current value of Result
	* @since 1.0
	*/
	double getResult() {
		return result;
	}
}