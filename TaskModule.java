package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {

	@Test(priority = 1, invocationCount = 1)
	public void createcustomer() {
		Reporter.log("createcustomer");
	}
	@Test(priority = 3, invocationCount = 3)
	public void modifycustomer() {
		Reporter.log("modifycustomer");
	}
	@Test(priority = 1, invocationCount = 5)
	public void deletecustomer() {
		Reporter.log("deletecustomer");

	}
}
