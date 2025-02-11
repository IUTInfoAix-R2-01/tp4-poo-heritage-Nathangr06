package tp3exosYaip5;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
		height=1.0;
	}
	
	
	public Circle getBase() {
		return this.base;
	}
	
	@Override
	public String toString() {
		return "Cylinder["+this.base+", height="+this.height+"]";
	}
	
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println(c1);
		System.out.println(c1.getBase().getColor());

	}
}
