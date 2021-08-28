package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class Test1 extends BaseClass{
	
	@Test(dependsOnMethods= {"test4"})
	public void test1() {
		
		System.out.println("Executing test 1");
	}
	@Test
	public void test2() {
		
		System.out.println("Executing test 2");
	}
	@Test(groups= {"sanity"})
	public void test3() {
		
		System.out.println("Executing test 3");
	}
	@Test
	public void test4() {
		
		System.out.println("Executing test 4");
	}

}
