package by.module1.task16;

import java.util.ArrayList;

public class Area {
	
	
	private ArrayList<Block> array = new ArrayList<>();

	public void addBlock (Block b) {
		array.add(b);		
	}
	
	public ArrayList<Block> getArea() {
		return array;
	} 
}
