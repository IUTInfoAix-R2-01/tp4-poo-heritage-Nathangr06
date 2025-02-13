package tp3exosYaip6;

public class ResizableCircle extends Circle2 implements Resizable{
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public String toString() {
		return "ResizableCircle["+super.toString()+"]";
	}
	
	@Override
	public void resize(int percent) {
		this.radius*=percent/100.0;
	}
	
	
	public static void main(String[] args) {
		ResizableCircle c1 = new ResizableCircle(2);
		System.out.println(c1);
		
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		c1.resize(50);
		System.out.println(c1);



	}
}
