package tp3exosYaip6;

public class Rectangle implements GeometricObject{
	private double width;
	private double lenght;
	
	public Rectangle(double width, double lenght) {
		this.width=width;
		this.lenght=lenght;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width="+this.width+",lenght"+this.lenght+"]";
	}
	
	@Override
	public double getArea() {
		return this.lenght*this.width;
	}
	
	@Override
	public double getPerimeter() {
		return 2*this.lenght+2*this.width;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.4,5.6);
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
	}
}
