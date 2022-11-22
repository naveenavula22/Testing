package testng;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	
	@Test(priority = 1, invocationCount = 2, enabled = true, dependsOnMethods = "modifycustomer")
	public void createcustomer() {
		Reporter.log("createcustomer");
	}
	@Test(priority = 3, invocationCount = 1)
	public void modifycustomer() {
		Reporter.log("modifycustomer");
	}
	@Test(priority = 1, invocationCount = 2)
	public void deletecustomer() {
		Reporter.log("deletecustomer");
	}
}
