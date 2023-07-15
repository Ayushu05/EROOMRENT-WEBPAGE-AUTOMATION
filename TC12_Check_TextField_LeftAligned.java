package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12_Check_TextField_LeftAligned {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		D.manage().window().maximize();
		
		WebElement E = D.findElement(By.id("txt1"));
		int S = E.getLocation().x;
		System.out.println(S);
		
		WebElement E1 = D.findElement(By.id("txt2"));
		int S1 = E1.getLocation().x;
		System.out.println(S1);
		
		WebElement E2 = D.findElement(By.id("txt3"));
		int S2 = E2.getLocation().x;
		System.out.println(S2);
		
		WebElement E3 = D.findElement(By.id("txt4"));
		int S3 = E3.getLocation().x;
		System.out.println(S3);
		
		WebElement E4 = D.findElement(By.className("abc"));
		int S4 = E4.getLocation().x;
		System.out.println(S4);
		
		WebElement E5 = D.findElement(By.id("b"));
		int S5 = E5.getLocation().x;
		System.out.println(S5);
		
		WebElement E6 = D.findElement(By.xpath("//html/body/input[8]"));
		int S6 = E6.getLocation().x;
		System.out.println(S6);
		
		WebElement E7 = D.findElement(By.xpath("//html/body/input[10]"));
		int S7 = E7.getLocation().x;
		System.out.println(S7);
		
		WebElement E8 = D.findElement(By.xpath("//html/body/input[11]"));
		int S8 = E8.getLocation().x;
		System.out.println(S8);
		
		WebElement E9 = D.findElement(By.xpath("//html/body/input[16]"));
		int S9 = E9.getLocation().x;
		System.out.println(S9);
		
		WebElement E10 = D.findElement(By.xpath("//html/body/input[17]"));
		int S10 = E10.getLocation().x;
		System.out.println(S10);
		
		WebElement E11 = D.findElement(By.xpath("//html/body/input[18]"));
		int S11 = E11.getLocation().x;
		System.out.println(S11);
		
		if(S==S1&&S2==S3&&S4==S5&&S6==S7&&S8==S9&&S10==S11) {
			System.out.println("TextFields are aligned from left");
		}else {
			System.out.println("TextFields are not aligned from left");
		}
		
		
	}

}
