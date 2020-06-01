package by.module1.task23;

/*  @author Yury Zmushko
 * 	Task 2.3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task23 {

	
	public static void main (String[] args ){
		int x1 = 4;
		int y1 = 2;
		int x2 = 5;
		int y2 = 4;
		int x3 = 6;
		int y3 = 6;
		double tan1;
		double tan2;
		Point point1 = new Point(x1, y1);
		Point point2 = new Point(x2, y2);
		Point point3 = new Point(x3, y3);

		if ((point1.getX() == point2.getX()) && (point1.getX() == point2.getX())) {
			System.out.println("точки 1 и 2 совпадают");
		} else if ((point1.getX() == point3.getX()) && (point1.getX() == point3.getX())) {
			System.out.println("точки 1 и 3 совпадают");
		} else if (point1.getX() == point2.getX() || (point1.getX() == point3.getX())) {
			tan1 = (double) (point1.getY() - point2.getY()) / (double) (point1.getX() - point2.getX());
			tan2 = (double) (point3.getY() - point2.getY()) / (double) (point3.getX() - point2.getX());
			if (tan1 == tan2) {
				System.out.println("На одной прямой");
			} else {
				System.out.println("Не повезло");
			}
		} else {
			tan1 = (double) (point1.getX() - point2.getX()) / (double) (point1.getY() - point2.getY());
			tan2 = (double) (point3.getX() - point2.getX()) / (double) (point3.getY() - point2.getY());
			if (tan1 == tan2) {
			System.out.println("На одной прямой");
			} else {
				System.out.println("Не повезло");
			}
		}	
	}
	
		
}
