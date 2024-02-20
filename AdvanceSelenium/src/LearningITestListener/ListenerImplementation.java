package LearningITestListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Execution of test case is a success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./screenShots/DWS.png");
		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Screenshot Taken",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Execution of test case started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Execution is finished",true);
	}

}
