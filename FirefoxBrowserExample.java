package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
		driver.quit();

	}

}
