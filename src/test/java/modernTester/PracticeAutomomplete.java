package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeAutomomplete extends BaseTest {

    @Test
    public void searchLetterA() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/autocomplete.php");

        WebElement search = driver.findElement(By.cssSelector("#search"));
        search.sendKeys("a");

        Thread.sleep(10000);
    }

}
