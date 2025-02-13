package tp3exosYaip6;

public class MovablePoint implements Movable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	
	@Override
	public String toString() {
		return "("+this.x+","+this.y+") speed=("+this.xSpeed+","+this.ySpeed+")";
	}
	
	@Override
	public void moveUp() {
		this.y+= this.ySpeed;
	}
	
	@Override
	public void moveDown() {
		this.y-= this.ySpeed;
	}
	
	@Override
	public void moveLeft() {
		this.x-= this.xSpeed;
	}
	
	@Override
	public void moveRight() {
		this.x+= this.xSpeed;
	}
	
	public static void main(String[] args) {
		MovablePoint m1 = new MovablePoint(5,3,1,1);
		
		System.out.println("Position initiale :");
		System.out.println(m1);
		
		m1.moveRight();
		m1.moveRight();
		m1.moveUp();
		m1.moveUp();
		System.out.println("Premiers déplacements :");
		System.out.println(m1);
		
		m1.moveDown();
		m1.moveLeft();
		System.out.println("Deuxièmes déplacements :");
		System.out.println(m1);
	}
	
}
