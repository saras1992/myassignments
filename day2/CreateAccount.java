package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Saraswathi");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDrop = driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(industryDrop);
		dropdown.selectByContainsVisibleText("Computer Software");

		WebElement ownershipDrop = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(ownershipDrop);
		dropdown1.selectByVisibleText("S-Corporation");

		WebElement sourceDrop = driver.findElement(By.id("dataSourceId"));
		Select dropdown2 = new Select(sourceDrop);
		dropdown2.selectByValue("LEAD_EMPLOYEE");

		WebElement marketingCampaignDrop = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown3 = new Select(marketingCampaignDrop);
		dropdown3.selectByIndex(6);

		WebElement stateProvinceDrop= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown4 = new Select(stateProvinceDrop);
		dropdown4.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
