package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserfb {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("saras@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		driver.findElement(By.name("login")).click();
		

	}

}
