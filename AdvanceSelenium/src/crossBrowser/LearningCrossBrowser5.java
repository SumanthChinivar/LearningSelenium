package crossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser5 {
	@Test
	@Parameters("flower")
	public void flower3(String flower) {
		System.out.println(flower);
	}
}
