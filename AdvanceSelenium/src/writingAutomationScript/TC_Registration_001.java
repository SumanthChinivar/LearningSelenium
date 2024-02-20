package writingAutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Registration_001 {
	public static void main(String[] args) {
		// TestData
		String url = "https://demowebshop.tricentis.com/";
		String gender = "Male";
		String firstName = "Komal";
		String lastName = "Gupta";
		String emailID = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";

		// opening the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("The browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get(url);
		System.out.println("Demowebshop is launched");

		// clicking on register
		driver.findElement(By.linkText("Register")).click();
		if (driver.getTitle().contains("Register")) {
			System.out.println("Register page is opened");
		} else
			System.out.println("Register page is not opened");

		// Selecting the gender
		if (gender.toLowerCase().equals("male")) {
			driver.findElement(By.id("gender-male")).click();
			System.out.println("Male is selected");
		} else {
			driver.findElement(By.id("gender-female")).click();
			System.out.println("Female is selected");
		}

		// Entering the first name
		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		String enteredFirstName = driver.findElement(By.id("FirstName")).getAttribute("value");
		System.out.println("First name is entered");
		System.out.println("The first name is:" + enteredFirstName);

		// Entering the last name
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		String enteredLastName = driver.findElement(By.id("LastName")).getAttribute("value");
		System.out.println("Last name is entered");
		System.out.println("The last name is:" + enteredLastName);

		// Enter the email
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(emailID);
		String enteredEmail = driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println("Email id is entered");
		System.out.println("The email id is:" + emailID);

		// Entering the password
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
		String enteredPassword = driver.findElement(By.id("Password")).getAttribute("value");
		System.out.println("Password is entered");
		System.out.println("Entered password is:" + enteredPassword);

		// Confirming the password
		driver.findElement(By.id("ConfirmPassword")).clear();
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		enteredPassword = driver.findElement(By.id("ConfirmPassword")).getAttribute("value");
		System.out.println("Password is confirmed");
		System.out.println("The confirmed password is:" + enteredPassword);

		// Click on register button
		driver.findElement(By.id("register-button")).click();
		System.out.println("Clicked on register buuton");

		if (driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed()) {
			System.out.println("Registered successfully");
		} else
			System.out.println("Please check the details are entered correctly");

		// Click on continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
}
