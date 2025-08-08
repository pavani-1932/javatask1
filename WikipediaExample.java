package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaExample {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div/span[2]")).click();
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
