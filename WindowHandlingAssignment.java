package seleniumpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 2. Navigate to the URL
        driver.get("https://the-internet.herokuapp.com/windows");

        // Store the original window handle
        String originalWindow = driver.getWindowHandle();

        // 3. Click the "Click Here" button
        WebElement clickHereBtn = driver.findElement(By.linkText("Click Here"));
        clickHereBtn.click();

        // 4. Switch to newly opened window
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // 5. Verify that the text "New Window" is present
        String newWindowText = driver.findElement(By.tagName("h3")).getText();
        if (newWindowText.equals("New Window")) {
            System.out.println("Verification Passed: Text 'New Window' is present.");
        } else {
            System.out.println("Verification Failed: Expected 'New Window' but got '" + newWindowText + "'");
        }

        // 6. Close new window
        //driver.close();

        // 7. Switch back to original window and verify it is active
        driver.switchTo().window(originalWindow);
        String originalTitle = driver.getTitle();
        System.out.println("Back to original window. Title is: " + originalTitle);

        // 8. Close the browser
        driver.quit();
    }
}
