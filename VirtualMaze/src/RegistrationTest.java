

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationTest {

	private WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation path\\VirtualMaze\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
// Signup with Valid Credentials
	public void testSignUpWithValidCredentials() throws InterruptedException {
		// Navigate to the Signup page

		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(3000);
		WebElement Signup = driver.findElement(By.id("signupToggle"));
		Signup.click();
		Thread.sleep(3000);
		WebElement Fullname = driver.findElement(By.id("signup-username"));
		WebElement EmailAddress = driver.findElement(By.id("signup-email"));
		WebElement Mobile = driver.findElement(By.id("signup-mobile"));
		WebElement Password = driver.findElement(By.id("signup-password"));
		WebElement ConfirmPassword = driver.findElement(By.id("signup-confirmPassword"));
		WebElement TermsCheckbox = driver.findElement(By.id("terms-vms-policy"));
		WebElement Register = driver.findElement(By.id("signup-submit-text"));

		Fullname.sendKeys("Ramana23");
		EmailAddress.sendKeys("vramana7911@gmail.com");
		Mobile.sendKeys("9629517150");
		Password.sendKeys("Ramana@2397");
		ConfirmPassword.sendKeys("Ramana@2397");
		TermsCheckbox.click();
		Register.click();
		Thread.sleep(3000);
		WebElement popup = driver.findElement(By.id("OtpPopup"));
		Assert.assertTrue(popup.isDisplayed(), "Popup is not displayed");
	}

	@Test(priority = 2)

	public void testSignUpWithExistingUsername() throws InterruptedException {
		// Navigate to the Signup page

		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(3000);
		WebElement Signup = driver.findElement(By.id("signupToggle"));
		Signup.click();
		Thread.sleep(3000);
		WebElement Fullname = driver.findElement(By.id("signup-username"));
		WebElement EmailAddress = driver.findElement(By.id("signup-email"));
		WebElement Mobile = driver.findElement(By.id("signup-mobile"));
		WebElement Password = driver.findElement(By.id("signup-password"));
		WebElement ConfirmPassword = driver.findElement(By.id("signup-confirmPassword"));
		WebElement TermsCheckbox = driver.findElement(By.id("terms-vms-policy"));
		WebElement Register = driver.findElement(By.id("signup-submit-text"));

		Fullname.sendKeys("Ramana");
		EmailAddress.sendKeys("vramana7911@gmail.com");
		Mobile.sendKeys("9629517150");
		Password.sendKeys("Ramana@2397");
		ConfirmPassword.sendKeys("Ramana@2397");
		TermsCheckbox.click();
		Register.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("signupFormError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "username already exist";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "username already exist");

	}

	@Test(priority = 3)

	public void testSignUpWithExistingEmailId() throws InterruptedException {
		// Navigate to the Signup page

		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(3000);
		WebElement Signup = driver.findElement(By.id("signupToggle"));
		Signup.click();
		Thread.sleep(3000);
		WebElement Fullname = driver.findElement(By.id("signup-username"));
		WebElement EmailAddress = driver.findElement(By.id("signup-email"));
		WebElement Mobile = driver.findElement(By.id("signup-mobile"));
		WebElement Password = driver.findElement(By.id("signup-password"));
		WebElement ConfirmPassword = driver.findElement(By.id("signup-confirmPassword"));
		WebElement TermsCheckbox = driver.findElement(By.id("terms-vms-policy"));
		WebElement Register = driver.findElement(By.id("signup-submit-text"));

		Fullname.sendKeys("Ramana23");
		EmailAddress.sendKeys("vramana791@gmail.com");
		Mobile.sendKeys("9629517150");
		Password.sendKeys("Ramana@2397");
		ConfirmPassword.sendKeys("Ramana@2397");
		TermsCheckbox.click();
		Register.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("signupFormError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "EmailId already exist";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "EmailId already exist");

	}

	@Test(priority = 3)

	public void testSignUpWithMismatchInPassword() throws InterruptedException {
		// Navigate to the Signup page

		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(3000);
		WebElement Signup = driver.findElement(By.id("signupToggle"));
		Signup.click();
		Thread.sleep(3000);
		WebElement Fullname = driver.findElement(By.id("signup-username"));
		WebElement EmailAddress = driver.findElement(By.id("signup-email"));
		WebElement Mobile = driver.findElement(By.id("signup-mobile"));
		WebElement Password = driver.findElement(By.id("signup-password"));
		WebElement ConfirmPassword = driver.findElement(By.id("signup-confirmPassword"));
		WebElement TermsCheckbox = driver.findElement(By.id("terms-vms-policy"));
		WebElement Register = driver.findElement(By.id("signup-submit-text"));

		Fullname.sendKeys("Ramana23");
		EmailAddress.sendKeys("vramana7911@gmail.com");
		Mobile.sendKeys("9629517150");
		Password.sendKeys("Ramana@2397");
		ConfirmPassword.sendKeys("Ramana@2398");
		TermsCheckbox.click();
		Register.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("conFirmPassError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "Password must match and min 8 characters";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Password must match and min 8 characters");

	}

	@Test(priority = 3)

	public void testSignUpWithMinimumPasswordLength() throws InterruptedException {
		// Navigate to the Signup page

		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(3000);
		WebElement Signup = driver.findElement(By.id("signupToggle"));
		Signup.click();
		Thread.sleep(3000);
		WebElement Fullname = driver.findElement(By.id("signup-username"));
		WebElement EmailAddress = driver.findElement(By.id("signup-email"));
		WebElement Mobile = driver.findElement(By.id("signup-mobile"));
		WebElement Password = driver.findElement(By.id("signup-password"));
		WebElement ConfirmPassword = driver.findElement(By.id("signup-confirmPassword"));
		WebElement TermsCheckbox = driver.findElement(By.id("terms-vms-policy"));
		WebElement Register = driver.findElement(By.id("signup-submit-text"));

		Fullname.sendKeys("Ramana23");
		EmailAddress.sendKeys("vramana7911@gmail.com");
		Mobile.sendKeys("9629517150");
		Password.sendKeys("Ramana@2397");
		ConfirmPassword.sendKeys("Ramana@2398");
		TermsCheckbox.click();
		Register.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("conFirmPassError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "Password must match and min 8 characters";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Password must match and min 8 characters");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}