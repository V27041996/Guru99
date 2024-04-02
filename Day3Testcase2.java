package Guru99;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day3Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
	
		//TestCase1 valid userid invalid password
		
		driver.findElement(By.name("uid")).sendKeys("mngr563814");
		driver.findElement(By.name("password")).sendKeys("qYsaje");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Login failed");

	}

}
