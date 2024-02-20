package configurationAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningConfigAnnotation4 {
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

}
