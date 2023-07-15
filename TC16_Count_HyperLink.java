package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC16_Count_HyperLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/");
		D.manage().window().maximize();
		
		int CountLinks = D.findElements(By.tagName("a")).size();
		System.out.println(CountLinks);
		
	}


}