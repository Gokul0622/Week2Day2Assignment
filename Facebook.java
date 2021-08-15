package week2.day3assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/

		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.linkText("Create New Account")).click();

		
		driver.findElement(By.name("firstname")).sendKeys("Gokulraj");

		

		driver.findElement(By.name("lastname")).sendKeys("Sugumar");

	

		driver.findElement(By.name("reg_email__")).sendKeys("9884025910");



		driver.findElement(By.name("reg_passwd__")).sendKeys("Gokulrajsugumar@gmail.com");

		

		WebElement Date = driver.findElement(By.id("day"));
		Select drpdwn = new Select(Date);
		drpdwn.selectByIndex(5);

		WebElement Month = driver.findElement(By.id("month"));
		Select drpdwn1 = new Select(Month);
		drpdwn1.selectByValue("12");

		WebElement Year = driver.findElement(By.id("year"));
		Select drpdwn2 = new Select(Year);
		drpdwn2.selectByValue("1997");

		

		driver.findElement(By.className("_58mt")).click();

	}


}
