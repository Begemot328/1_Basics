/*
 * class name Equation
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task13;

import static java.lang.Math.*;

import by.module1.task11.Equation;

public class Equation3 extends Equation {
	
	double z;
	
	public double convert(double ... var) throws ArithmeticException {
		double a = var[0];
		double b = var[1];
		
		try {
			z = (sin(a) + cos(b)) / (cos(b) - sin(a)) * tan(a + b);
		}	catch (ArithmeticException e) {
			System.out.println("Некорректные исходные данные" + e);
			e = new ArithmeticException("Некорректные исходные данные" + e);
			throw e; 			
		}
		z = (sin(a) + cos(b)) / (cos(b) - sin(a)) * tan(a + b);
		return z;
	}
}
