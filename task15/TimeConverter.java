/*
 * class name Equation
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task15;

//import static java.lang.Math.*;

public class TimeConverter {
	
	public String convert(int a) 
			throws Exception {
		int h, m, s;
		String z;
		if (a < 0) {
			throw new Exception("wrong number");
		}
		h = (int) Math.floor(a/3600);
		a = a - 3600 * h;
		m = (int) Math.floor(a/60);
		s = a - 60 * m;
		z = h + "ч " + m +  "м " + s + "с";  
		System.out.println(z);
		return z;
	}
}
