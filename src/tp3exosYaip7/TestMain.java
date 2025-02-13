package tp3exosYaip7;

import java.util.Date;

public class TestMain{
	public static void main(String[] args) {
		Customer c1 = new Customer("nathan");
		c1.setMember(true);
		c1.setMemberType("Gold");
		
		System.out.println(c1);

		Visit v1 = new Visit(c1.getName(),new Date());

		v1.setProductExpense(100);
		v1.setServiceExpense(50);
		
		System.out.println(v1);
		
		System.out.println(DiscountRate.getServiceDiscountRate(c1.getMemberType()));
	}
}