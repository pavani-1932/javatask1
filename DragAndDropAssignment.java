package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {
    public static void main(String[] args) throws InterruptedException {
        // 1. Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Navigate to URL
        driver.get("https://jqueryui.com/droppable/");

        // 3. Switch to iframe containing drag & drop elements
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // 4. Locate source ("Drag me to my target")
        WebElement source = driver.findElement(By.id("draggable"));

        // 5. Locate target ("Drop here")
        WebElement target = driver.findElement(By.id("droppable"));

        // 6. Perform drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        // Small wait to let UI update
        Thread.sleep(1000);

        // 7. Get background color after drop
        String bgColor = target.getCssValue("background");
        System.out.println("Background Color of Target: " + bgColor);
        if(bgColor.contains("255, 250, 144")) {
        	System.out.println("Background color is Light Yellow Color");
        }else {
        	System.out.println("Unknown Background color");
        }

        // 8. Verify text change
        String targetText = target.getText();
        if (targetText.equals("Dropped!")) {
            System.out.println("Drag and Drop Successful. Text changed to: " + targetText);
        } else {
            System.out.println("Drag and Drop Failed. Text is still: " + targetText);
        }

        // 9. Close browser
        driver.quit();
    }
}


