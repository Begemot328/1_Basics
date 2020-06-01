package by.module1.task21;

public class Triangle {
	double angle1;
	double angle2;
	double angle3;
	private static double ANGLE_SUM = 180;
	private static double RIGHT_ANGLE = 90;
	
	public Triangle(double a, double b) {
		this.angle1 = a;
		this.angle2 = b;
		this.angle3 = ANGLE_SUM - a - b;
		if ((this.angle1 <= 0) || (this.angle2 <= 0) || (this.angle3 <= 0)) {
			throw new ArithmeticException("No such triangle exists");
		}
		if (this.angle3 <= 0) {
			throw new ArithmeticException("No such triangle exists");
		}
	}
		
	public Triangle(double a, double b, double c) {
		this.angle1 = a;
		this.angle2 = b;
		this.angle3 = c;
		if ((this.angle1 <= 0) || (this.angle2 <= 0) || (this.angle3 <= 0)) {
			throw new ArithmeticException("No such triangle exists");
		}
		if ((a + b + c) != ANGLE_SUM) {
			throw new ArithmeticException("No such triangle exists");
		}
	}
	
	public boolean isEquilateral() {
		boolean z;
		z = ((this.angle1 == this.angle2) && (this.angle1 == this.angle3));
		return z;
	}
	
	public boolean isRightAngled() {
		boolean z;
		z = ((this.angle1 == RIGHT_ANGLE) || (this.angle2 == RIGHT_ANGLE) || (this.angle3 == RIGHT_ANGLE));
		return z;
		}
}
