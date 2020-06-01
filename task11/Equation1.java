package by.module1.task11;

public class Equation1 extends Equation{
	
	double z;
	
public double convert(double ... var) throws Exception {
		double a = var[0];
		double b = var[1];
		double c = var[2];

		z = ((a - 3) * b / 2) + c;
		return z;
	}
}
