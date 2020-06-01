package by.module1.task12;


import static java.lang.Math.*;

import by.module1.task11.Equation;

public class Equation2 extends Equation{
	
	double z;
	
	public double convert(double ... var) throws ArithmeticException {
		double a = var[0];
		double b = var[1];
		double c = var[2];
		
		if (a==0) {
			throw new ArithmeticException("Некорректные исходные данные");
		} 
		try {
			z = (b + sqrt(pow(b,2) + 4 * a * c)) / (2 * a) - (pow(a,3) * c) 
				+ pow(b,(-2));
			return z;
		}	catch (ArithmeticException e) {
		System.out.println("Некорректные исходные данные" + e);
		e = new ArithmeticException("Некорректные исходные данные" + e);
		throw e; 			
		}	
	}
}
