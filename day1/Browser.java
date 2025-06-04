package week2.day1;

public class Browser {
		
		
	public String launchBrowser(String msg) {
		System.out.println(msg);
		return msg;
	}
	public void loadUrl()
	{
		System.out.println("https://platform.testleaf.com/#/");
	}

	public static void main(String[] args) {
		Browser launch=new Browser();
		String launchBrowser= launch.launchBrowser("Browser Launched Successfully");
		launch.loadUrl();
	}

}
