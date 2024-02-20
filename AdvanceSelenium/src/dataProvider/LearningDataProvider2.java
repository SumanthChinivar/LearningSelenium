package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider2 {
	@DataProvider
	public String[][] demo() {
		String[][] data = { { "komalgupta121@gmail.com", "Shakuni123.@", "https://demowebshop.tricentis.com/" },
				{ "komalgupta121@gmail.com", "Shakuni123.@", "https://demowebshop.tricentis.com/" } };
		return data;
	}
	
	@Test(dataProvider = "demo")
	public void print(String un,String pwd,String url)
	{
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(url);
		System.out.println("==========");
	}
}
