package week3.day2;

//Main class to demonstrate
	public class TestDemo {
	    public static void main(String[] args) {
	        // Create object of superclass
	        TestData testData = new TestData();
	        testData.enterCredentials();
	        testData.navigateToHomePage();

	        System.out.println("--------------------------");

	        // Create object of subclass
	        LoginTestData loginData = new LoginTestData();
	        loginData.enterUsername();
	        loginData.enterPassword();
	        loginData.enterCredentials();       // inherited from superclass
	        loginData.navigateToHomePage();     // inherited from superclass
	    }
	}