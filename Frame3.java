package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Frame3 {
    public static void main(String[] args) {
        // Set driver path if required
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/nested_frames");

        // Switch to top frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

        // Verify there are 3 frames inside top frame
        List<WebElement> framesInTop = driver.findElements(By.xpath(".//frame"));
        if (framesInTop.size() == 3) {
            System.out.println("Verified 3 frames inside top frame");
        } else {
            System.out.println("Expected 3 frames, but found: " + framesInTop.size());
        }

        // Switch to left frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));

        // Verify LEFT text
        String leftText = driver.findElement(By.xpath("//body")).getText();
        if (leftText.equals("LEFT")) {
            System.out.println("Verified LEFT frame text");
        } else {
            System.out.println("Expected 'LEFT', but got: " + leftText);
        }

        // Switch back to top frame
        driver.switchTo().parentFrame();
        System.out.println("Switched back to top frame");

        // Switch to left frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

        // Verify Middle text
        String middleText = driver.findElement(By.xpath("//body")).getText();
        if (middleText.equals("MIDDLE")) {
            System.out.println("Verified MIDDLE frame text");
        } else {
            System.out.println("Expected 'MIDDLE', but got: " + middleText);
        }

        // Switch back to top frame
        driver.switchTo().parentFrame();
        System.out.println("Switched back to top frame");
        
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
        
        //verify Right text
        String rightText = driver.findElement(By.xpath("//body")).getText();
        if (rightText.equals("RIGHT")) {
            System.out.println("Verified Right frame text");
        } else {
            System.out.println("Expected 'RIGHT', but got: " + middleText);
        }

        // Switch back to top frame
        driver.switchTo().parentFrame();
        System.out.println("Switched back to top frame");
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        
        //verify Bottom text
        String bottomText = driver.findElement(By.xpath("//body")).getText();
        if (bottomText.equals("BOTTOM")) {
            System.out.println("Verified Bottom frame text");
        } else {
            System.out.println("Expected 'BOTTOM', but got: " + middleText);
        }

        // Switch back to top frame
        driver.switchTo().parentFrame();
        
        

    }
}
