package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement WebUser = driver.findElement(By.id("username"));
		WebUser.sendKeys("demosalesmanager");

		WebElement WebPassword = driver.findElement(By.id("password"));
		WebPassword.sendKeys("crmsfa");

		WebElement WebLogin = driver.findElement(By.className("decorativeSubmit"));
		WebLogin.click();
		WebElement WebCLick = driver.findElement(By.linkText("CRM/SFA"));
		WebCLick.click();

		WebElement Lead = driver.findElement(By.linkText("Leads"));
		Lead.click();
		WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
		CreateLead.click();
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("GKR");

		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Gokulraj");

		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Sugumar");

		WebElement CountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		CountryCode.clear();
		CountryCode.sendKeys("+91");

		WebElement SourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceField = new Select(SourceDropDown);
		SourceField.selectByValue("LEAD_EXISTCUST");

		WebElement MarketingCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MarketingCampaignField = new Select(MarketingCampaignDropDown);
		MarketingCampaignField.selectByValue("9001");
		
		WebElement FirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		FirstNameLocal.sendKeys("Test1");

		WebElement LastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		LastNameLocal.sendKeys("Test2");
		
		WebElement Salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		Salutation.sendKeys("MR");
		
		WebElement Dob = driver.findElement(By.id("createLeadForm_birthDate"));
		Dob.sendKeys("15/08/1997");
		
		WebElement ProfileTitle = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		ProfileTitle.sendKeys("Software Tester");
		
		WebElement Department = driver.findElement(By.id("createLeadForm_departmentName"));
		Department.sendKeys("IT");
		
		WebElement AnnualRevenue = driver.findElement(By.id("createLeadForm_annualRevenue"));
		AnnualRevenue.sendKeys("7945454777");
		
		WebElement CurrencyDropDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select CurrencyField = new Select(CurrencyDropDown);
		CurrencyField.selectByValue("INR");
		
		WebElement IndustryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select IndustryField = new Select(IndustryDropDown);
		IndustryField.selectByIndex(2);
		
		WebElement NumberOfEmployees = driver.findElement(By.id("createLeadForm_numberEmployees"));
		NumberOfEmployees.sendKeys("10");
		
		WebElement OwnershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipField = new Select(OwnershipDropDown);
		OwnershipField.selectByVisibleText("Corporation");
		
		WebElement SICCode = driver.findElement(By.id("createLeadForm_sicCode"));
		SICCode.sendKeys("1320");
		
		WebElement TickerSymbol = driver.findElement(By.id("createLeadForm_tickerSymbol"));
		TickerSymbol.sendKeys("Yes");
		
		WebElement Description = driver.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("Test Description");
		
		WebElement ImportantNote = driver.findElement(By.id("createLeadForm_importantNote"));
		ImportantNote.sendKeys("Test ImportantNote");
		
		//Contact Information:
		
		WebElement AreaCode = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		AreaCode.sendKeys("600056");
		
		WebElement PhoneNumber = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		PhoneNumber.sendKeys("997777444");
		
		WebElement Extension = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		Extension.sendKeys("+91");
		
		WebElement PersontoAskFor = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		PersontoAskFor.sendKeys("query");
		
		WebElement EMailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		EMailAddress.sendKeys("becivo9931@error57.com");
		
		WebElement WebUrl= driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		WebUrl.sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
		
		//Primary Address:
		
		WebElement ToName = driver.findElement(By.id("createLeadForm_generalToName"));
		ToName.sendKeys("Surya");
		
		WebElement AttentionName = driver.findElement(By.id("createLeadForm_generalAttnName"));
		AttentionName.sendKeys("Vijay");
		
		WebElement AddressLine1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		AddressLine1.sendKeys("22, New Main Road");
		
		WebElement AddressLine2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		AddressLine2.sendKeys("Poonamallee");
		
		WebElement City = driver.findElement(By.id("createLeadForm_generalCity"));
		City.sendKeys("Chennai");
		
		WebElement StateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select StateField = new Select(StateDropDown);
		StateField.selectByIndex(10);
		
		WebElement PostalCode = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		PostalCode.sendKeys("600056");
			
		WebElement CountryDropDown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select CountryField = new Select(CountryDropDown);
		CountryField.selectByIndex(5);
		
		WebElement ZipPostalCodeExtension = driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		ZipPostalCodeExtension.sendKeys("60");
		
		WebElement CreateButton = driver.findElement(By.className("smallSubmit"));
		CreateButton.click();
		
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
									
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
