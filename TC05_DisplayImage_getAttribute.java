package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05_DisplayImage_getAttribute {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in");
		D.manage().window().maximize();
	
		WebElement imgElement = D.findElement(By.className("img-fluid"));
		String S = imgElement.getAttribute("src");
		D.get(S);
		System.out.println(S);
	}

}
