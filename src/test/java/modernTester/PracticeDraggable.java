package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeDraggable extends BaseTest {

    @Test
    public void dragSquare() {

        driver.get("https://seleniumui.moderntester.pl/draggable.php");

        /** drag square to upper right */
        WebElement dragSquare = driver.findElement(By.cssSelector("#draggable"));
        Actions action = new Actions(driver);
        int dragSquareX = dragSquare.getLocation().getX();
        int dragSquareWidth = dragSquare.getSize().getWidth();
        int browserWindowWidth = driver.manage().window().getSize().width;
        action
                .clickAndHold(dragSquare)
                .moveByOffset(browserWindowWidth - (dragSquareX + dragSquareWidth), 0)
                .release()
                .perform();
    }
}
