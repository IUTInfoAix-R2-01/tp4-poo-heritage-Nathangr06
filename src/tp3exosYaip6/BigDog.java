package tp3exosYaip6;

public class BigDog extends Dog{
	public BigDog(String name) {
		super(name);
	}
	@Override
	public void greets() {
		System.out.println("Wooow");
	}
	
	@Override
	public void greets(Dog another) {
		System.out.println("Wooooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Wooooooooooooww");	
	}
	
	public static void main(String[] args) {
		Dog d1= new Dog("caca");
		BigDog b1 = new BigDog("ccc");
		d1.greets();
		d1.greets(d1);
		b1.greets();
		b1.greets(d1);
		b1.greets(b1);
	}
}
