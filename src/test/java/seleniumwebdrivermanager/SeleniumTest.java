package seleniumwebdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup(); 
		 * WebDriver d= new ChromeDriver();
		 */

		WebDriverManager.firefoxdriver().setup();

		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("anshuman");
		d.close();

	}

}
