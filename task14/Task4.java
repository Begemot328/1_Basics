/*
 * class name Task4
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task14;

/*  @author Yury Zmushko
 * 	Task 1.4 Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */	

public class Task4 {

	
	public static void main (String[] args ){
		double a;  						//
		double b;  						//
		
		a = 199.283;
		Spinner spinner = new Spinner();
		try {
			b = spinner.spin(a);
			System.out.println("Результат вычислений");
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}