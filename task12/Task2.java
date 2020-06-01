package by.module1.task12;

import by.module1.task11.*;

/*  @author Yury Zmushko
 * 	Task 1.2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * 
 */

public class Task2 {

	
	public static void main (String[] args ){
		double solution; 					 
		double a, b, c;  				
		double[] var = new double[3];			
			
		a = 0;
		b = 1;
		c = 3;
		var[0] = a;
		var[1] = b;
		var[2] = c;
		Equation2 equation = new Equation2();
		EquationSolver es = new EquationSolver();
		
		try {
			solution = es.solveEquation(equation, a, b, c);
			System.out.println("Результат вычислений");
			System.out.println(solution);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}
}