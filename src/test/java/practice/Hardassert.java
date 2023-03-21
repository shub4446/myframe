package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {

	@Test
	public void create_cust() {
		System.out.println("shubham");
		System.out.println("vickey");
		Assert.assertEquals("A", "A");
		System.out.println("kunal");
		System.out.println("vivek");
	}
	
	@Test
	public void modify_cust() {
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
	}
	
}
