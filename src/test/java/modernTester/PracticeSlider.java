package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeSlider extends BaseTest {

    @Test
    public void moveToSlider50() {

        driver.get("https://seleniumui.moderntester.pl/slider.php");

        WebElement slider50 = driver.findElement(By.cssSelector("#custom-handle"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider50, 974, 191).perform();

    }

    @Test
    public void moveToSlider80() {

        driver.get("https://seleniumui.moderntester.pl/slider.php");

        WebElement slider80 = driver.findElement(By.cssSelector("#custom-handle"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider80, 800, 0).perform();

    }

    @Test
    public void moveToSlider20() {

        driver.get("https://seleniumui.moderntester.pl/slider.php");

        WebElement slider20 = driver.findElement(By.cssSelector("#custom-handle"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider20, 200, 0).perform();

    }

    @Test
    public void moveToSlider0() {

        driver.get("https://seleniumui.moderntester.pl/slider.php");

        WebElement slider0 = driver.findElement(By.cssSelector("#custom-handle"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider0, 0, 0).perform();

    }
}
