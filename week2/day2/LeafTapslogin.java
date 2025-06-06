package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafTapslogin {
	public static void main(String[] args) {
	
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.manage().window().maximize();
		
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
      
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         
         driver.findElement(By.className("decorativeSubmit")).click();
         
         driver.findElement(By.linkText("CRM/SFA")).click();
         
         driver.findElement(By.linkText("Leads")).click();
         
         driver.findElement(By.linkText("Create Lead")).click();
         
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tesser Insights");
         
 		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saraswathi");
 		
 		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
 		
 		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Quality Analyst");
 		
 		driver.findElement(By.className("smallSubmit")).click();
 driver.close();
	}


}
