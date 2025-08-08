package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		System.out.println(driver.getTitle());
		
		String expected_title="STORE";
		
		String actual_title=driver.getTitle();
		
		if (actual_title.equals(expected_title)) {
		
			System.out.println("Page landed on correct website");
		}else {
			
			System.out.println("Page not landed on correct website");
		}
			

	

	}

}
