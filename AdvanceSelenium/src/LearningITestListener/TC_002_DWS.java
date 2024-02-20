package LearningITestListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_DWS extends BaseClass {
	@Test
	public void demoTest() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "demowebshop");
	}
}
