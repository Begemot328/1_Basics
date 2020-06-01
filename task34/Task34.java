package by.module1.task34;

import java.math.BigInteger;

/*  @author Yury Zmushko
 * 	Task 3.4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task34 {

	
	public static void main (String[] args ){
		int i;
		BigInteger product;
		double prod;
		double quantity;
		
		product = BigInteger.valueOf(1);
		prod = 1;
		i = 1;
		quantity = 200;
		
		for (int j = 1; j <= quantity; j++) {
			prod = prod * j * j;
			if (prod == Double.POSITIVE_INFINITY) {
				System.out.println("Переполнение");
				break;
			}
		}

		if (prod != Double.POSITIVE_INFINITY) {
			System.out.println("произведение квадратов " + quantity + " чисел равно " + prod);
		}
		while (i <= quantity) {
			product = product.multiply(BigInteger.valueOf((i * i)));
			i++;
		}
		System.out.println("произведение квадратов " + quantity  + " чисел равно " 
							+ product);	
	}		
}
