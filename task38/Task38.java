package by.module1.task38;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 3.8. 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task38 {

	
	public static void main (String[] args ) {
		int [] digits = new int[10];
		int m = 0;
		int n = 0;
		int i = 0;
		
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
				System.out.println("m=" + m);
				break;
				
			} catch (InputMismatchException e) { 
				System.out.println(e.getMessage());
				input.next();
			}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		for (int c = 0; c <= 9; c++) {
			if (Integer.toString(m).contains(Integer.toString(c)) && Integer.toString(n).contains(Integer.toString(c))) {
				digits[i] = c;
				i++;
			}
		}
	
		System.out.println("В числах " + m + " и " +  n + " встречаются цифры: ");
		for (int c = 0; c < i; c++) {
			System.out.print(digits[c] + ", ");
		}		
	}
}
