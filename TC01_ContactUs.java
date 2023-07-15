package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_ContactUs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/brokerreg.php");
		D.manage().window().maximize();
		
		System.out.println(D.getTitle());
		System.out.println("Chromedriver launched successfully");
		D.findElement(By.id("txtfname")).sendKeys("Anant Saraf");
		D.findElement(By.id("txtmobile1")).sendKeys("9898909096");
		D.findElement(By.id("txtpass")).sendKeys("Anant@*");
		D.findElement(By.id("txtcpass")).sendKeys("Anant@*");
		D.findElement(By.name("txtEmail")).sendKeys("Anant@123");
		D.findElement(By.name("btnsubmit")).click();
	}

}
