package Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRunner {
	
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir"));
		System.out.println(file);
		
//		System.setProperty("webdriver.gecko.driver",file+"//driver//geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver",file+"//driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle : " + actualTitle);
		
		driver.findElement(By.xpath("//input[@value='Google Search']"));
		 driver.close();
	}

}
