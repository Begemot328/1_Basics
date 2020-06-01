package by.module1.task21;

/*  @author Yury Zmushko
 * 	Task 2.1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */	

public class Task21 {

	
	public static void main (String[] args ){
		double angle1 = 40.;
		double angle2 = 50.;
		double angle3 = 90.;
		try {
			Triangle triangle = new Triangle (angle1, angle2, angle3);
			if (triangle.isEquilateral()) {
				System.out.println("Равносторонний");
			}
			if (triangle.isRightAngled()) {
				System.out.println("Прямоугольный");
			}
		} catch (Exception e) {
			System.out.println("ошибка");
			e.printStackTrace();
		}
		
	}
	
		
}
