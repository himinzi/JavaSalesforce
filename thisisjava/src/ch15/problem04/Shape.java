package ch15.problem04;

public abstract class Shape {

	private int countSides;
	
	Shape(int countSides){
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}
	
	abstract double getArea();
	
	abstract double getPerimeter();
	
	
}
