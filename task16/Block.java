package by.module1.task16;

public class Block {
	
	private int rightBorder;
	private int leftBorder;
	private int upperBorder;
	private int lowerBorder;

	
	public Block(int a, int b, int c, int d) {
		if (a > b) {
			this.rightBorder = a;
			this.leftBorder = b;
		} else {
			this.rightBorder = b;
			this.leftBorder = a;
		}
		if (c > d) {
			this.upperBorder = c;
			this.lowerBorder = d;
		} else {
			this.upperBorder = d;
			this.lowerBorder = c;
		}
	}

	public int getRightBorder() {
		return rightBorder;
	}


	public void setRightBorder(int rightBorder) {
		this.rightBorder = rightBorder;
	}


	public int getLeftBorder() {
		return leftBorder;
	}


	public void setLeftBorder(int leftBorder) {
		this.leftBorder = leftBorder;
	}


	public int getUpperBorder() {
		return upperBorder;
	}


	public void setUpperBorder(int upperBorder) {
		this.upperBorder = upperBorder;
	}


	public int getLowerBorder() {
		return lowerBorder;
	}


	public void setLowerBorder(int lowerBorder) {
		this.lowerBorder = lowerBorder;
	}
	
	

	 
}
