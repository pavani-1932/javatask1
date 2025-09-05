package seleniumpackage;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAutomation {
    public static void main(String[] args) throws InterruptedException {
        // 1. Launch ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Navigate to the URL
        driver.get("https://jqueryui.com/datepicker/");

        // 3. Switch to iframe containing date picker
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // 4. Click the datepicker input field to open calendar
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        // 5. Click "Next" button on datepicker to go to next month
        WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
        nextButton.click();

        // 6. Select date "22" from next month
        WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
        date22.click();

        // 7. Capture selected date
        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected Date is: " + selectedDate);

        // 8. Close browser
        driver.quit();
    }
}

