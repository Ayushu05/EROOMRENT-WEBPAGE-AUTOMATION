package eRoomReant_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC15_CheckBox_Left_Top_Aligned {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");

		WebDriver D = new ChromeDriver();
		D.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		D.manage().window().maximize();
		
		WebElement CheckBox1 = D.findElement(By.name("chk1"));
		int CB1 = CheckBox1.getLocation().x;
		System.out.println(CB1);
		
		WebElement CheckBox2 = D.findElement(By.name("chk2"));
		int CB2 = CheckBox2.getLocation().x;
		System.out.println(CB2);
		
		if(CB1==CB2) {
			System.out.println("CheckBoxes are aligned from left");
		}else {
			System.out.println("CheckBoxes are not aligned from left");
		}
		
		System.out.println("-------------------------------------------------");
		
		WebElement CheckBox11 = D.findElement(By.name("chk1"));
		int CB11 = CheckBox11.getLocation().y;
		System.out.println(CB11);
		
		WebElement CheckBox22 = D.findElement(By.name("chk2"));
		int CB22 = CheckBox22.getLocation().y;
		System.out.println(CB22);
		
		if(CB11==CB22) {
			System.out.println("CheckBoxes are aligned from Top");
		}else {
			System.out.println("CheckBoxes are not aligned from Top");
		}



	}

}
