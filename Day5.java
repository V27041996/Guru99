package Datadriven;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Day5 {
	WebDriver driver;
	@Test(dataProvider = "create")
	
	public void test(String username, String Password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		Thread.sleep(3000);
		
		driver.findElement(By.name("uid")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("Password");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		driver.close();
		
		
	}
	@DataProvider(name="create")
	public Object[][] dataSet()
	{
	return new Object [][] 
	{{"mngr56381","qYsajem"},
	{"mngr563814","qYsaje"},
	{"mngr56381","qYsaje"},
	{"mngr563814","qYsajem"}};
	}

	

}
