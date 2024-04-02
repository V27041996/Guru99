package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr563814");
		driver.findElement(By.name("password")).sendKeys("qYsajem");
		driver.findElement(By.name("btnLogin")).click();
		String Title = driver.getTitle();
		String Atitle = "Guru99 Bank Manager HomePage";
		if(Atitle.contentEquals(Title))
		{
			System.out.println("Title Verified");
		}
		else
		{
			System.out.println("Title not verified");
		}
		Thread.sleep(5000);
		driver.close();
		System.out.println("Login Sucess");
	}

}
