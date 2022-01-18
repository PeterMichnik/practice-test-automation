package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeSlider extends BaseTest {

    @Test
    public void shouldMoveSlider() {
        driver.get("https://seleniumui.moderntester.pl/slider.php");
        moveTo(50);
        moveTo(80);
        moveTo(80);
        moveTo(20);
    }

    public void moveTo(int expectedSliderValue) {
        if (getSliderValue() < expectedSliderValue) {
            moveSlider(expectedSliderValue, Keys.ARROW_RIGHT);
        } else {
            moveSlider(expectedSliderValue, Keys.ARROW_LEFT);
        }
        Assert.assertEquals(getSliderValue(), expectedSliderValue);
    }

    public void moveSlider(int expectedSliderValue, Keys key) {
        while (getSliderValue() != expectedSliderValue) {
            driver.findElement(By.cssSelector("#slider")).sendKeys(key);
        }
    }

    public int getSliderValue() {
        String sliderValue = driver.findElement(By.cssSelector("#custom-handle"))
                .getText();


        return Integer.parseInt(sliderValue);
    }
}
