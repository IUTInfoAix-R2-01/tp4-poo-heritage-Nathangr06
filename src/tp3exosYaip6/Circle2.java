package tp3exosYaip6;

public class Circle2 implements GeometricObject2{
	protected double radius;
	
	public Circle2(double radius) {
		this.radius=radius;
	}
	
	@Override
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	@Override
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
}
