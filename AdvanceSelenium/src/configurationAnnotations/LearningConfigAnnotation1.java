package configurationAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningConfigAnnotation1 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("@Test Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
}
