package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;

public class Test2 extends BaseClass{

	@Test(groups= {"smoke"})
	public void test5() {
		
		System.out.println("Executing test 5");
	}
	@Test
	public void test6() {
		
		System.out.println("Executing test 6");
		
	}
	@Test(dataProvider="getdata")
	public void test7(String usr,String pw) {
		
		System.out.println("Executing test 7");
		System.out.println(usr);
		System.out.println(pw);
	}
	@Test
	public void test8() {
		
		System.out.println("Executing test 8");
		
	}
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] obj=new Object[1][2];
		obj[0][0]="username";
		obj[0][1]="pwd";
		return obj;
	}
	
}
