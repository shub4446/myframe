package practice;

import org.testng.annotations.Test;

public class CustomerTest {

	@Test(priority = 1,invocationCount = 2)
	public void createCustomerTest() {
		System.out.println("create custonmer");
	}
	@Test(dependsOnMethods = "createCustomer", invocationCount = 2)
	public void modifycustomerTest() {
		System.out.println("modify customer");
	}
	@Test(dependsOnMethods = "createCustomer",invocationCount = 3)
	public void deletecustomerTest() {
		System.out.println("delete customer");
	}

}
