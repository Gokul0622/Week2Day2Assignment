package week2.day3assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		driver.findElement(By.name("UserFirstName")).sendKeys("Gokulraj");

		driver.findElement(By.name("UserLastName")).sendKeys("Sugumar");

		driver.findElement(By.name("UserEmail")).sendKeys("Gokulrajsugumar1@gmail.com");

		driver.findElement(By.name("CompanyName")).sendKeys("FoyerTech");

		driver.findElement(By.name("UserPhone")).sendKeys("9094139972");

		
		WebElement Title = driver.findElement(By.name("UserTitle"));
		Select drpdwn = new Select(Title);
		drpdwn.selectByIndex(4);

		WebElement Employees = driver.findElement(By.name("CompanyEmployees"));
		Select drpdwn1 = new Select(Employees);
		drpdwn1.selectByValue("9");

		WebElement Country = driver.findElement(By.name("CompanyCountry"));
		Select drpdwn2 = new Select(Country);
		drpdwn2.selectByVisibleText("India");

		driver.findElement(By.className("checkbox-ui")).click();


	}

}
