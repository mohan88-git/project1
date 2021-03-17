package seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class test {

	WebDriver driver;

	@BeforeSuite

	public void LaunchBrwoser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\src\\Lib\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactin.com/HotelApp/index.php");

	}
 
	@BeforeTest 

	public void add() {
		
		System.out.println("open");  
	

	}
	
	@Test (invocationCount=6)

	public void add1() {
		
		System.out.println("runn");
	

	}


@AfterSuite

public void verify() {
	
System.out.println("close");
	
}

}
