package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateFb {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("saraswathi");
		
		driver.findElement(By.name("lastname")).sendKeys("mani");
		
	
		WebElement Day = driver.findElement(By.id("day"));
		
		Select dropdown=new Select(Day);
		
		dropdown.selectByVisibleText("9");
		
		WebElement Month = driver.findElement(By.id("month"));
		
		Select dropdown1=new Select(Month);
		
		dropdown1.selectByVisibleText("Jan");
		
		WebElement Year = driver.findElement(By.id("year"));
		
		Select dropdown2=new Select(Year);
		
		dropdown2.selectByVisibleText("1992");
		
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("sex")).sendKeys("Female");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8610486185");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		
		driver.close();
		

	}

}
