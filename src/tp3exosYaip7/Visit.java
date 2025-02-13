package tp3exosYaip7;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name, Date date) {
		this.customer= new Customer(name);
		this.date=date;
	}
	
	
	public String getName(){
		return this.customer.getName();
	}
	
	public double getServiceExpense() {
		return this.serviceExpense;
	}
	
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense=serviceExpense;
	}
	
	public double getProductExpense() {
		return this.productExpense;
	}
	
	public void setProductExpense(double productExpense) {
		this.productExpense=productExpense;
	}
	
	public double getTotalExpense() {
		return this.productExpense +this.serviceExpense;
	}
	
	public String toString() {
		return "Visit["+this.customer.toString()+", date="+this.date+
				", serviceExpense="+this.serviceExpense+", productExpense="+this.productExpense+"]";
	}
}
