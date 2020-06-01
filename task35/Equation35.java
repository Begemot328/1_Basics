/*
 * class name Equation
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task35;

import by.module1.task11.Equation;

public class Equation35 extends Equation {
	
	
	public double convert(double ... var) 
			throws ArithmeticException {
		double y;
		double x;
		
		x = var[0];
		y = (1 / Math.pow(2, x)) + (1 / Math.pow(3, x));
		return y;
	}
}
