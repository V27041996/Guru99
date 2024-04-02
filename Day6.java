package Guru99;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr563814");
		driver.findElement(By.name("password")).sendKeys("qYsajem");
		driver.findElement(By.name("btnLogin")).click();
		WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee"));
		String S1 = ele.getText();
		System.out.println(S1);
		String S2 = "Welcome To Manager's Page of Guru99 Bank";
		if(S1.contentEquals(S2))
		{
			System.out.println("Text verified");
		}
		else
		{
			System.out.println("Text not verified");
		}
		File vsfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(vsfile,new File(".//SSSS/HOME.png"));
		System.out.println("Screenshot Taken");
	}

}
