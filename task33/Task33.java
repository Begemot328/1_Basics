package by.module1.task33;

/*  @author Yury Zmushko
 * 	Task 3.3 Найти сумму квадратов первых ста чисел.
 */

public class Task33 {

	
	public static void main (String[] args ){
		int i;
		int sum;
		
		sum = 0;
		i = 0;
		while (i <= 100) {
			sum = sum + i * i;
			System.out.println(i);
			i++;
		}
		System.out.println("Сумма квадратов " + (i-1)  + " чисел равна " + sum);	
	}		
}
