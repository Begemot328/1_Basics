package by.module1.task36;


/*  @author Yury Zmushko
 * 	Task 3.6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task36 {
	
	public static void main (String[] args ) {
		for (char c='A'; c<='z'; c++) {
			  System.out.println("код = " + (int) c + "\t \t символ = " + c);
		}
	}		
}
