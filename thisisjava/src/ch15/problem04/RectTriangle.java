package ch15.problem04;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	RectTriangle(double w, double h){
		super(3);
		this.width = w;
		this.height = h;
	}

	@Override
	double getArea() {
		return this.width * this.height/2;
	}

	@Override
	double getPerimeter() {
		return this.width + this.height + Math.sqrt((Math.pow(this.width, 2) + Math.pow(this.height, 2)));
	}

}
