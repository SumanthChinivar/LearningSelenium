package crossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser1 {
	@Test
	@Parameters({"a","b","c"})
	public void add(int a, int b) {
		System.out.println(a + b);
	}
}
