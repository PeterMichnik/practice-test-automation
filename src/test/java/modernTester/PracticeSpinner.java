package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeSpinner extends BaseTest {

    @Test
    public void selectToggleWidget() {

        driver.get("https://seleniumui.moderntester.pl/spinner.php");

        WebElement clickToggleWidget = driver.findElement(By.cssSelector("#destroy"));
        clickToggleWidget.click();

        WebElement selectAValue = driver.findElement(By.cssSelector("#spinner"));
        selectAValue.sendKeys("12");
    }

    @Test
    public void selectSpinnerUp() {

        driver.get("https://seleniumui.moderntester.pl/spinner.php");

        WebElement spinnerUp = driver.findElement(By.xpath("//span/a[contains(@class,'ui-spinner-up')]"));
        spinnerUp.click();

        int value = 10;
        for (int i = 1; i < value; i++) {
            spinnerUp.click();
        }
    }

    @Test
    public void selectSpinnerDown() {

        driver.get("https://seleniumui.moderntester.pl/spinner.php");

        WebElement spinnerUp = driver.findElement(By.xpath("//span/a[contains(@class,'ui-spinner-down')]"));
        spinnerUp.click();

        int value = 9;
        for (int i = 0; i < value; i++) {
            spinnerUp.click();
        }

        WebElement disable = driver.findElement(By.cssSelector("#disable"));
        disable.click();

        WebElement setValueTo5 = driver.findElement(By.cssSelector("#setvalue"));
        setValueTo5.click();

        WebElement getValue = driver.findElement(By.cssSelector("#getvalue"));
        getValue.click();
        driver.switchTo().alert().accept();
    }
}
