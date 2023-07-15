package eRoomReant_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC09_getPageSource {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/about.php");
		D.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(D.getPageSource());
	}

}
