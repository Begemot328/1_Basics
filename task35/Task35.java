package by.module1.task35;

import by.module1.task11.*;

/*  @author Yury Zmushko
 * 	Task 3.5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид.
 */

public class Task35 {

	
	public static void main (String[] args ){
		double solution; 						// 
		double sum;		
		double e;								//
		int n;

		n = 0;
		e = 0.05;
		sum = 0;
		solution = 0;
		Equation35 equation = new Equation35();
		EquationSolver es = new EquationSolver();
		do {
			try {
				solution = es.solveEquation(equation, n);
			} catch (Exception exception) {
				exception.printStackTrace();
			}	
			sum = sum + solution;
			n++;
		} while (solution >= e);
		System.out.println("Сумма " + (n - 1) + " членов равна " 
				+ sum);	
	}
}