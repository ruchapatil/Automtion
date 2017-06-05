package com.demo.automation;

import org.testng.annotations.Test;

public class TestNGExample {

	@Test(priority = 2)
	//@Test(dependsOnMethods = {"m2"})
	public void m1() {

		System.out.println("this is my M1 method");
	}
	@Test(description = "This method defined by rucha")
	//@Test(priority = 0)
	public void m2() {
		System.out.println("This is my M2 method");
	}

	@Test(priority = 1)
	public void m3() {
		System.out.println("This is my M3 method");
	}
}