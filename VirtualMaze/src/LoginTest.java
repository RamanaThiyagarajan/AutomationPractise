import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	private WebDriver driver;

	@BeforeSuite
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation path\\VirtualMaze\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	// Login with Valid Credentials
	public void testLoginWithValidCredentials() throws InterruptedException {
		// Navigate to the login page

		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// Enter valid username and password
		WebElement usernameInput = driver.findElement(By.id("login-email"));
		WebElement passwordInput = driver.findElement(By.id("login-password"));

		usernameInput.sendKeys("vramana791@gmail.com");
		passwordInput.sendKeys("Ramana@2397");

		// Click the login button
		WebElement loginButton = driver.findElement(By.id("login-submit-text"));
		loginButton.click();
		Thread.sleep(3000);

		assertTrue(driver.getCurrentUrl().equals("https://accounts.vmmaps.com/dashboard.html"));

		WebElement Profile = driver.findElement(By.xpath("//button[@id='profile']"));
		Profile.click();
		WebElement Signout = driver.findElement(By.id("menu-logout"));
		Signout.click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	// Login with Invalid Credentials
	public void testLoginWithInValidCredentials() throws InterruptedException {
		// Navigate to the login page

		// Enter Invalid username and password

		WebElement usernameInput = driver.findElement(By.id("login-email"));
		WebElement passwordInput = driver.findElement(By.id("login-password"));

		usernameInput.sendKeys("vramana@gmail.com");
		passwordInput.sendKeys("automate");

		// Click the login button
		WebElement loginButton = driver.findElement(By.id("login-submit-text"));
		loginButton.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("signinFormError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "Invalid email, please signup and try again";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message Validtion Passed");

		assertTrue(driver.getCurrentUrl().equals("https://accounts.vmmaps.com/"));
	}

	@Test(priority = 3)
	// Login with InValid Username
	public void testLoginWithInValidUsernameAndValidPassword() throws InterruptedException {

		// Enter Invalid username and Valid password
		WebElement usernameInput = driver.findElement(By.id("login-email"));
		WebElement passwordInput = driver.findElement(By.id("login-password"));

		usernameInput.clear();
		usernameInput.sendKeys("vramana@gmail.com");
		passwordInput.clear();
		passwordInput.sendKeys("Ramana@2397");

		// Click the login button
		WebElement loginButton = driver.findElement(By.id("login-submit-text"));
		loginButton.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("signinFormError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "Invalid email, please signup and try again";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message Validtion Passed");

		assertTrue(driver.getCurrentUrl().equals("https://accounts.vmmaps.com/"));
	}

	@Test(priority = 4)
	public void testLoginWithValidUsernameAndInvalidPassword() throws InterruptedException {

		// Enter Valid username and InValid password
		WebElement usernameInput = driver.findElement(By.id("login-email"));
		WebElement passwordInput = driver.findElement(By.id("login-password"));

		usernameInput.clear();
		usernameInput.sendKeys("vramana791@gmail.com");
		passwordInput.clear();
		passwordInput.sendKeys("68");

		// Click the login button
		WebElement loginButton = driver.findElement(By.id("login-submit-text"));
		loginButton.click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElement(By.id("signinFormError"));

		String actualErrorMessage = ErrorMessage.getText();

		String expectedErrorMessage = "Incorrect emailId or Password, Try again";

		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message Validtion Passed");

		assertTrue(driver.getCurrentUrl().equals("https://accounts.vmmaps.com/"));
	}

	@Test(priority = 5)
	public void testLoginWithEmptyCredentials() throws InterruptedException {

		// Enter Valid username and InValid password
		WebElement usernameInput = driver.findElement(By.id("login-email"));
		WebElement passwordInput = driver.findElement(By.id("login-password"));

		usernameInput.clear();
		passwordInput.clear();

		// Click the login button
		WebElement loginButton = driver.findElement(By.id("login-submit-text"));
		loginButton.click();
		Thread.sleep(3000);

		assertTrue(driver.getCurrentUrl().equals("https://accounts.vmmaps.com/"));
	}

	@AfterSuite
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
