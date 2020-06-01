package by.module1.task13;

import by.module1.task11.*;

/*  @author Yury Zmushko
 * 	Task 1.3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 */	

public class Task3 {
	
	public static void main (String[] args ){
		double solution; 						// 
		double a; 
		double b;  						//
		
		a = 4;
		b = 1;
		Equation3 equation = new Equation3();
		EquationSolver es = new EquationSolver();
		
		try {
			solution = es.solveEquation(equation, a, b);
			System.out.println("Результат вычислений");
			System.out.println(solution);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}