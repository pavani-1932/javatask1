package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignupExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.guvi.in/");
		//Thread.sleep(5000);
		
		/*driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("name")).sendKeys("Sai");
		driver.findElement(By.id("email")).sendKeys("kondurus558@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Kalyan12345");
		driver.findElement(By.id("mobileNumber")).sendKeys("9010619905");
		driver.findElement(By.id("signup-btn")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//a[@id='laterBtn']")).click();*/
		//driver.close();
		//Thread.sleep(10000);
		driver.get("https://www.guvi.in/");
		//Thread.sleep(5000);
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("kondurus558@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Kalyan12345");
		driver.findElement(By.id("login-btn")).click();


	}

}
