package week3.day2;


//Superclass
public class TestData {
 public void enterCredentials() {
     System.out.println("Entering credentials...");
 }

 public void navigateToHomePage() {
     System.out.println("Navigating to the Home Page...");
 }
}

//Subclass
class LoginTestData extends TestData {
 public void enterUsername() {
     System.out.println("Entering username...");
 }

 public void enterPassword() {
     System.out.println("Entering password...");
 }
}



