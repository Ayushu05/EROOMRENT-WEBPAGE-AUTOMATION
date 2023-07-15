package eRoomReant_Application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC17_Count_PathOfHyperlink {

	public static void main(String[] args) {
		// Create an automation script to find the path of all the hyperlink and findout how many link have path or not
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/about.php");
		D.manage().window().maximize();
		
		List<WebElement> E = D.findElements(By.tagName("a"));
		int enable = 0;
		int disable = 0;
		
		for(WebElement ex:E) {
			String S = ex.getAttribute("href");
			int Position = S.lastIndexOf("/");
			System.out.println(Position);
			String S1 = S.substring(Position);
			System.out.println(S1);
			if(S1.equals("")||S1.equals("#")) {
				disable++; 
			}else {
				enable++;
			}
			System.out.println("Link path is "+S);
		}
		System.out.println("Total Hyperlinks are "+ E.size());
		System.out.println("---------------------------------------------");
		System.out.println("Total enabled links are "+ enable);
		System.out.println("---------------------------------------------");
		System.out.println("Total disabled links are "+ disable);
		
	}

}
