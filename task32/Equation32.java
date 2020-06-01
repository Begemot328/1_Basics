/*
 * class name Equation
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task32;

import by.module1.task11.Equation;

public class Equation32 extends Equation {
	
	
	public double convert(double ... var) 
			throws ArithmeticException {
		double y;
		double x;
		
		x = var[0];
		if (x <= 2) {
			y = - x;
		} else {
			y = x;
		}
		return y;
	}
}
