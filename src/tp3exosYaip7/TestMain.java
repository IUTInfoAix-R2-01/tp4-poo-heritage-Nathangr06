package tp3exosYaip7;

import java.util.Date;

public class TestMain{
	public static void main(String[] args) {
		Customer c1 = new Customer("nathan");
		Visit v1 = new Visit(c1.getName(),new Date());
		c1.setMemberType("Gold");
		
		System.out.println(v1);
		
		v1.setProductExpense(100);
		v1.setServiceExpense(50);
		
		System.out.println(DiscountRate.getServiceDiscountRate(c1.getMemberType()));
	}
}