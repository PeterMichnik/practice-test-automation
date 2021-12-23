package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeAlerts extends BaseTest {

    @Test
    public void shouldConfirmAlertPopUp() {

        driver.get("https://seleniumui.moderntester.pl/alerts.php");

        /** select simple alert pop up */
        WebElement selectSimpleAlert = driver.findElement(By.cssSelector("#simple-alert"));
        selectSimpleAlert.click();
        driver.switchTo().alert().accept();

        /** check text has been show */
        String textPromptAlertPopUp = driver.findElement(By.cssSelector("#simple-alert-label"))
                .getText();
        Assert.assertEquals(textPromptAlertPopUp, "OK button pressed");
    }

    @Test
    public void shouldConfirmPromptAlertBox() {

        driver.get("https://seleniumui.moderntester.pl/alerts.php");

        /** confirm prompt alert box */
        WebElement selectPromptPopUp = driver.findElement(By.cssSelector("#prompt-alert"));
        selectPromptPopUp.click();
        driver.switchTo().alert().sendKeys("Lord Vader");
        driver.switchTo().alert().accept();

        /** check text has been show */
        String textPromptAlertBox = driver.findElement(By.cssSelector("#prompt-label"))
                .getText();
        Assert.assertEquals(textPromptAlertBox, "Hello Lord Vader! How are you today?");
    }

    @Test
    public void shouldConfirmAlertBox() {

        driver.get("https://seleniumui.moderntester.pl/alerts.php");

        /** confirm alert box OK */
        WebElement selectConfirmPopUp = driver.findElement(By.cssSelector("#confirm-alert"));
        selectConfirmPopUp.click();
        driver.switchTo().alert().accept();

        /** check text has been show */
        String textAlertBoxOk = driver.findElement(By.cssSelector("#confirm-label"))
                .getText();
        Assert.assertEquals(textAlertBoxOk, "You pressed OK!");

        /** dissmis alert box OK */
        driver.findElement(By.cssSelector("#confirm-alert")).click();
        driver.switchTo().alert().dismiss();

        /** check text has been show */
        String textAlertBoxCancel = driver.findElement(By.cssSelector("#confirm-label"))
                .getText();
        Assert.assertEquals(textAlertBoxCancel, "You pressed Cancel!");
    }

    @Test
    public void shouldConfirmDelayedAlert() {

        driver.get("https://seleniumui.moderntester.pl/alerts.php");

        WebElement selectDelayedAlert = driver.findElement(By.cssSelector("#delayed-alert"));
        selectDelayedAlert.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
