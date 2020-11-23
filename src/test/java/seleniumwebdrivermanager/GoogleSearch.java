package seleniumwebdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();

		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("anshuman");
		d.findElement(By.name("btnK")).click();
		System.out.println("run success");
d.quit();
	}
}
