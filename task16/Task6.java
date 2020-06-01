package by.module1.task16;

/*  @author Yury Zmushko
 * 	Task 1.6 Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */	

public class Task6 {

	
	public static void main (String[] args ){
	int a1 = -2;
	int b1 = 2;
	int c1 = 0;
	int d1 = 4;
	int a2 = -4;
	int b2 = 4;
	int c2 = 0;
	int d2 = -3;
	int x = 0;
	int y = 1;
	
	Block block1 = new Block(a1, b1, c1, d1);
	Block block2 = new Block(a2, b2, c2, d2);
	Area area = new Area();
	Searcher searcher = new Searcher();
	area.addBlock(block1);
	area.addBlock(block2);
	System.out.println(searcher.search(area, x, y));
	}
	
		
}
