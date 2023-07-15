package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07_SubString_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/about.php");
		D.manage().window().maximize();
		
		WebElement IMG = D.findElement(By.className("img-fluid"));
		String S = IMG.getAttribute("src");
	    int position = S.lastIndexOf("/");
	    String imgName = S.substring(position +1);
	    System.out.println(imgName);
	    

	}

}
