package baseClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Example1 {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
}
