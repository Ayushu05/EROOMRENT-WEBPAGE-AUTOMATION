package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC03_SearchRoom_DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://eroomrent.in/index.php");
		D.manage().window().maximize();
		
		Select Category = new Select(D.findElement(By.id("cat")));
		Category.selectByVisibleText("Hostel");
		
		Select SubCategory = new Select(D.findElement(By.id("subcat")));
		SubCategory.selectByIndex(1);
		
		Select Location = new Select(D.findElement(By.id("location")));
		Location.selectByIndex(1);
		
		D.findElement(By.className("btn-one")).click();
	}

}
