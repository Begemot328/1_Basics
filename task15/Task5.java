package by.module1.task15;


/*  @author Yury Zmushko
 * 	Task 1.5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

public class Task5 {
	
	public static void main (String[] args ){
		int t; 			
		String date;
		
		t = 36780;
		TimeConverter converter = new TimeConverter();
		try {
			date = converter.convert(t);
			System.out.println("Результат вычислений " + date);
		} catch (Exception e) {
			System.out.println("ошибка");
			e.printStackTrace();
		}
		
}
}