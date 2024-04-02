package Guru99;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr563814");
		driver.findElement(By.name("password")).sendKeys("qYsajem");
		driver.findElement(By.name("btnLogin")).click();
		File vsfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(vsfile,new File(".//SSSS/VIN.png"));
		
		System.out.println("Login Sucess");

	}

}
