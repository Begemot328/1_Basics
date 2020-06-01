package by.module1.task22;


/*  @author Yury Zmushko
 * 	Task 2.2. Найти max{min(a, b), min(c, d)}.
 */

public class Task22 {

	
	public static void main (String[] args ){
		double a;
		double b;
		double c;
		double d;
		double z;

		a = 1;
		b = 6;
		c = 3;
		d = 4;
		
		z = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println("Искомое " + z);	
	}		
}
