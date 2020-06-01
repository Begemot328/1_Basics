/*
 * class name Task4
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task14;

public class Spinner {
	
	public double spin(double a) throws Exception {
		double b;
		String[] sub;
		sub = String.valueOf(a).split("\\.");
		b = Double.parseDouble(sub[1] + "." + sub[0]);
		return b;
	}
}
