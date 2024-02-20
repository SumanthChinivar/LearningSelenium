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

public class LearningConfigAnnotation3 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

}
