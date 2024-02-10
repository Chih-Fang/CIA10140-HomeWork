package hw5_Feb07;

public class MyRectangle {

	private double width;
	private double depth;
	
	public MyRectangle() {
	}
	
	public MyRectangle(double width, double depth) {
		this.width=width;
		this.depth=depth;
	}
	
	void setWidth(double width) {
		this.width=width;
	}
	
	void setDepth(double depth) {
		this.depth=depth;
	}
	
	double getWidth() {
		return width;
	}
	
	double getDepth() {
		return depth;
	}
	
	void getArea() {
		double area=width*depth;
		System.out.println(area);
	}
	
	

	

}
