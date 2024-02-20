package crossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser2 {
	@Test
	@Parameters({"a","b","c"})
	public void subtract(int a, int b) {
		System.out.println(a - b);
	}
}
