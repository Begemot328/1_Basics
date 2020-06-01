package by.module1.task11;

public class EquationSolver {

	
	public double solveEquation(Equation equation, double ... var) throws Exception {	
		try {
			return equation.convert(var);
		}	catch (ArithmeticException e) {
		System.out.println("Некорректные исходные данные" + e);
		e = new ArithmeticException("Некорректные исходные данные" + e);
		throw e; 			
		}	
	}
}
