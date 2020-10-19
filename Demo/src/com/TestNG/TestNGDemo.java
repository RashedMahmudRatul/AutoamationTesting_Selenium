package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	static int a=10;
	static int b=5;
	
	
	@BeforeMethod
	  public void before() {
		  
		  System.out.println("I am from BeforeM");
		  
	  }
	@AfterMethod
	  public void after() {
		  
		System.out.println("I am from AfterM");
		  
	  } 
	

  @Test(priority=-2)
  public void sum() {
	  System.out.println("I am from BeforeT");
	  int sum = a+b;
	  
	  System.out.println("BeforeTSun: "+sum);
	  
  }
  
  @Test(priority=-1)
  public void sub() {
	  System.out.println("I am from t");
	  int sub = a-b;
	  
	  System.out.println("Sub: "+sub);
	  
  }
  
  /// enable true /false
  @Test(enabled=false)
  public void demo() {
	  System.out.println("I am from @test");
	  
	  
  }
  
  
  @AfterTest
  public void mul() {
	  System.out.println("I am from AfterT");
	  int mul = a*b;
	  
	  System.out.println("Mul: "+mul);
	  
  }
}
