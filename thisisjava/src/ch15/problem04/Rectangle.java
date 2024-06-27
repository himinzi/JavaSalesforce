package ch15.problem04;

public class Rectangle extends Shape implements Resizeable  {

	private double width;
	private double height;
	
	Rectangle(double w, double h){
		super(4);
		this.width = w;
		this.height= h;
	}

	@Override
	public void resize(double s) {
		this.width = width*s;
		this.height = height*s;
	}

	@Override
	double getArea() {
		return this.width*this.height;
	}

	@Override
	double getPerimeter() {
		return (this.width+this.height)*2;
	}

}
