package by.module1.task25;

import by.module1.task11.*;

/*  @author Yury Zmushko
 * 	Task 2.5. Вычислить значение функции:
 */

public class Task25 {

	
	public static void main (String[] args ){
		double solution; 						// 
		double x;  						//
		
		x = 5;
		Equation25 equation = new Equation25();
		EquationSolver es = new EquationSolver();
		
		try {
			solution = es.solveEquation(equation, x);
			System.out.println("Результат вычислений");
			System.out.println(solution);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}
}