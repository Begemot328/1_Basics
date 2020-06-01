/*
 * class name Equation
 * 
 * @version 1.0 18.01.2020
 * 
 * @author Yury
 */
package by.module1.task16;

import java.util.ArrayList;
import java.util.Iterator;

public class Searcher {
	
	public boolean search(Area area, int x, int y)  {
		boolean z = false;
		ArrayList<Block> array = new ArrayList<>();
		Block block;
		
		array = area.getArea();
		Iterator<Block> it = array.iterator();
		while (it.hasNext()) {
			block = it.next();
			if(block.getLeftBorder() <= x && x <= block.getRightBorder()) {
				if(block.getLowerBorder() <= y && y <= block.getUpperBorder()) {
					z = true;
					break;	
				}	
			}
		}
		return z;
	}
}
