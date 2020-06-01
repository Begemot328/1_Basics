package by.module1.task31;

import java.io.IOException;
import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 3.1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

public class Task31 {

	
	public static void main (String[] args ){
		int i;
		int sum;
		int n;
		
		sum = 0;
		i = 1;
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				n = input.nextInt();
				if (n <= 0) {
					throw new IOException("Число не положительное!");
				}
				System.out.println("n=" + n);
				input.close();
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		while (i <= n) {
			sum = sum + i;
			System.out.println(i);
			i++;
		}
		System.out.println("Сумма " + (i-1)  + " чисел равна " + sum);	
	}		
}
