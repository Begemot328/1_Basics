package by.module1.task32;

import by.module1.task11.*;

/*  @author Yury Zmushko
 * 	Task 3.2. Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task32 {

	
	public static void main (String[] args ){
		double solution; 						// 
		double a;
		double b;
		double h;
		double x;  						//	
		
		a = 1;
		b = 2;
		h = 0.7;
		x = a;
		Equation32 equation = new Equation32();
		EquationSolver es = new EquationSolver();
		while (x <= b) {
			try {
				solution = es.solveEquation(equation, x);
				System.out.println("При x = " + x + ", у= " + solution);
			} catch (Exception e) {
				e.printStackTrace();
			}
			x = x + h;
		}
		
		
}
}