/*
 * class name Equation
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task25;

import static java.lang.Math.*;

import by.module1.task11.Equation;

public class Equation25 extends Equation {
	
	
	public double convert(double ... var) 
			throws ArithmeticException {
		double y;
		double x;
		
		x = var[0];
		if (x <= 3) {
			y = x * x - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		return y;
	}
}
