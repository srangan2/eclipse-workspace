package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlinkcountsonpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hssri\\eclipse-workspace\\coreJavaTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());;
	}

}
