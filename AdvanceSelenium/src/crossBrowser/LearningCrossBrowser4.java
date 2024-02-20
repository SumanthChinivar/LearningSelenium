package crossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser4 {
	@Test
	@Parameters("flower")
	public void flower2(String flower) {
		System.out.println(flower);
	}
}
