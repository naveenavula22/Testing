package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Annoations {
	@BeforeClass
	public void openbroswer() {
		Reporter.log("openbroswer",true);
	}
	@AfterClass
	public void closebroswer() {
		Reporter.log("closebroswer",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority = 0,invocationCount=1)
	public void CreateCustomer() {
		Reporter.log("editcustomer",true);
	}
	@Test(priority = 1,invocationCount=2)
	public void ModifyCustomer() {
		Reporter.log("taskcustomer",true);
	}
	@Test(priority = 1,invocationCount=0)
	public void DeleteCustomer() {
		Reporter.log("projectmodule");
	}

}
