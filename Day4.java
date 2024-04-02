package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class Day4 {
WebDriver driver;


@BeforeMethod()
public void TestNgStarted()
{
System.out.println("TestNgStarted");	
}


@Test(priority=1)
public void launchbrowser()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4/index.php");
	driver.manage().window().maximize();
}

@Test(priority=2)
public void InvalidUserIDvalidPassword() throws InterruptedException
{
	driver.findElement(By.name("uid")).sendKeys("mngr56381");
	driver.findElement(By.name("password")).sendKeys("qYsajem");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	System.out.println("Login failed1");
}

@Test(priority=3)
public void validUserIDinvalidPassword() throws InterruptedException
{
	driver.findElement(By.name("uid")).sendKeys("mngr563814");
	driver.findElement(By.name("password")).sendKeys("qYsaje");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	System.out.println("Login failed2");
}

@Test(priority=4)
public void InvalidUserIDinvalidPassword() throws InterruptedException
{
	driver.findElement(By.name("uid")).sendKeys("mngr56381");
	driver.findElement(By.name("password")).sendKeys("qYsaje");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	System.out.println("Login failed3");
}

@Test(priority=5)
public void closebrowser()
{
driver.quit();	
}

@AfterMethod()
public void TestNgEnded()
{
System.out.println("TestNgEnded");	
}
}
