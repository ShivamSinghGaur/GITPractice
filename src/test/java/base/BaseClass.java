package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	//@Parameters("browser")
	@BeforeSuite
	public void suitestart() {
		
		System.out.println("suite start!");
	}
	
	@AfterSuite
	public void suiteend() {
		
		System.out.println("suite end!");
	}
	
	@BeforeClass
	public void classstart() {
		
		System.out.println("class start!");
	}
	
	@AfterClass
	public void classend() {
		
		System.out.println("class end!");
	}
	
	/*@BeforeTest	
	public void teststart() {
		
		System.out.println("test start!");
	}
	
	@AfterTest
	public void testend() {
		
		System.out.println("test end!");
	}*/
	
	@BeforeMethod
	public void methodstart() {
		
		System.out.println("method start!");
	}
	
	@AfterMethod
	public void methodend() {
		
		System.out.println("method end!");
	}

}
