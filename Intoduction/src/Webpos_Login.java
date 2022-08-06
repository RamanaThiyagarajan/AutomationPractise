import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpos_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\WORK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://web.lingapos.com");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("java123@mail.com");
		driver.findElement(By.xpath("//*[@type = 'password']")).sendKeys("123java");
		driver.findElement(By.id("btnSubmit")).click(); 
	}

}