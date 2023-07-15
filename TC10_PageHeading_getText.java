package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10_PageHeading_getText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/about.php");
		D.manage().window().maximize();
		
		WebElement Heading = D.findElement(By.tagName("h1"));
		String S = Heading.getText();
		System.out.println(S);

	}

}
