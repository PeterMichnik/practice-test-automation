package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeResizable extends BaseTest {

    @Test
    public void resizableWindow(){
        driver.get("https://seleniumui.moderntester.pl/resizable.php");

        WebElement resizeWindow = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

        /** resize window to the right (10px) */
        Actions action = new Actions(driver);
        action.dragAndDropBy(resizeWindow,242,0).perform();
        // pixele ?

    }
}
