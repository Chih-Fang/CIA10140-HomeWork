package hw5_Feb07;

public class MyRectangleMain {

	public static void main(String[] args) {
	MyRectangle test1=new MyRectangle();
	test1.setWidth(10);
	test1.setDepth(20);
	test1.getArea();
	
	MyRectangle test2=new MyRectangle(10,20);
	test2.getArea();

	}

}
