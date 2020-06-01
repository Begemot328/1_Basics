package by.module1.task11;

/*  @author Yury Zmushko
 * 	Task 1.1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c. 
 * 
 */

public class Task1 {

	
	public static void main (String[] args ){
		double solution; 					 
		double a, b, c;  						
		
		a = 4;
		b = 0;
		c = 3;
		
		Equation1 equation = new Equation1();
		EquationSolver es = new EquationSolver();
		
		try {	
			solution = es.solveEquation(equation, a, b, c);
			System.out.println("Результат вычислений");
			System.out.println(solution);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
}
}