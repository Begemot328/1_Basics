package by.module1.task37;

import java.io.IOException;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 3.7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
public class Task37 {

	
	public static void main (String[] args ){
		int n = 0;
		int m = 0;
		int x;
		int i;
		int y;

		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Введите n");
				if(input.hasNext()) {
					n = input.nextInt();
				}
				
				if (n <= 0) {
					throw new IOException("Число не натуральное!");
				}
				System.out.println("n=" + n);
				System.out.println("Введите m");
				if(input.hasNext()) {
					m = input.nextInt();
				}
				if (m <= 0) {
					throw new IOException("Число не натуральное!");
				}
				System.out.println("m= " + m);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (n > m) {
			x = m;
			y = n;
		} else {
			y = m;
			x = n;
		}
		while (x <= y) {
			i = 2;
			while (i < x) {
				if (isDivisor(x, i)) {
					System.out.println("Число " + i + " является делителем " + x);
				}
				i++;
			}
			x++;
		}
	}		
	
	public static boolean isDivisor (int x, int i) {
		boolean result;
		result = (x / i) * i == x;
		return result;
	}
}
