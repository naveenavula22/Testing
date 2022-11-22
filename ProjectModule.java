package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class ProjectModule {

	@Test(priority = 1, invocationCount = 2)
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