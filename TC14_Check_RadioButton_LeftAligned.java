package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_Check_RadioButton_LeftAligned {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		D.manage().window().maximize();
		
		WebElement RButton1 = D.findElement(By.name("r1"));
		int R1 = RButton1.getLocation().x;
		System.out.println(R1);
		
		WebElement RButton2 = D.findElement(By.xpath("//html/body/input[13]"));
		int R2 = RButton2.getLocation().x;
		System.out.println(R2);
		
		if(R1==R2) {
			System.out.println("RadioButtons are aligned from left");
		}else {
			System.out.println("RadioButtons are not aligned from left");
		}
		
		System.out.println("-------------------------------------------------");
		
		WebElement RButton11 = D.findElement(By.name("r1"));
		int R11 = RButton11.getLocation().y;
		System.out.println(R11);
		
		WebElement RButton22 = D.findElement(By.xpath("//html/body/input[13]"));
		int R22 = RButton22.getLocation().y;
		System.out.println(R22);
		
		if(R11==R22) {
			System.out.println("RadioButtons are aligned from Top");
		}else {
			System.out.println("RadioButtons are not aligned from Top");
		}

		

	}

}
