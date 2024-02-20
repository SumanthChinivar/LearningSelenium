package assertions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HowToUseReporterDotLog {
	@Test
	public void demo() {
		Reporter.log("Hai");
		Reporter.log("Hello",true);
	}
}
