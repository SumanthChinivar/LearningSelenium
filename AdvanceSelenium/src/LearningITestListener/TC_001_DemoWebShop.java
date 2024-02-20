package LearningITestListener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001_DemoWebShop extends BaseClass {
	@Test
	public void demoTest() {
		Reporter.log("Test Case 1",true);
	}
}
