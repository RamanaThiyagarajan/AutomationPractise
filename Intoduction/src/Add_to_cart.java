import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Introduction\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		String[] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot", "Carrot"};
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//*[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='promoInfo']")).getText());
		
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded )
	
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
			
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			     
			{
			    j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (j==itemsNeeded.length)
					
				{
					break;
				}
			}
		}

	}

}
