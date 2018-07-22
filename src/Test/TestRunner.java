package Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRunner {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//driver//geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle : " + actualTitle);
		
		driver.findElement(By.xpath("//input[@value='Google Search']"));
		
		driver.close();
	}

}
