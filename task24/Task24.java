package by.module1.task24;


/*  @author Yury Zmushko
 * 	Task 2.4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */

public class Task24 {

	
	public static int max (int a, int b) {
		if (a > b) {
			return a;
			} else {
				return b;
		}
	} 
	
	public static int min (int a, int b) {
		if (a > b) {
			return b;
			} else {
				return a;
		}
	}
	
	public static void main (String[] args ){
		int a1;
		int b1;
		int a2;
		int b2;
		int x = 12;
		int y = 6;
		int z = 20;
		int a = 15;
		int b = 10;
		
		a1 = max(a, b);
		b1 = min(a, b);
		
		b2 = min(x, min(y, z));
		a2 = x + y +z - b2 - max(x, max (y,z));
		
		if (a2 <= a1 && b2 <= b1) {
			System.out.println("Пролезет");
		} else {
			System.out.println("Не пролезет");
		}		
	}		
}
