
public class Rectangle extends Shape {
	
	private double width;
	private double length;
	
	Rectangle (double width, double length, String color){
		super(color); //call attribute color from Constructor method in Class Shape
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	@Override
	public double getArea() {
		return this.width*this.length; //implement getArea() method from abstract method from class Shape
	}
	
	@Override
	public String toString() {
		return "Rectangle[width="+this.width+",length="+this.length+","+super.toString();
	}
}
