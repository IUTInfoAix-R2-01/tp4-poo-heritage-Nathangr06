package tp3exosYaip4;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school=school;
		this.pay=pay;
	}
	
	public String getSchool() {
		return this.school;
	}
	
	public void setSchool(String school) {
		this.school=school;
	}
	
	public double getPay() {
		return this.pay;
	}
	
	public void setPay(double pay) {
		this.pay=pay;
	}
	
	@Override
	public String toString() {
		return "Staff[Person[name="+this.getName()+",address="+this.getAddress()
		+"], school="+this.school+",pay="+this.pay+"]";
	}
	
	
	public static void main(String[] args) {
		Staff s1 = new Staff("nathan","ez","aix",10000);
		System.out.println(s1);
	}
}
