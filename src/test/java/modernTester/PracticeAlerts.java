package modernTester;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAlerts extends BaseTest {

    @Test
    public void shouldAcceptAlerts() {

        driver.get("https://seleniumui.moderntester.pl/alerts.php");

        /** select simple alert pop up */
        driver.findElement(By.cssSelector("#simple-alert")).click(); //# oznacza iD
        driver.switchTo().alert().accept();
        //Jak to zapisac jak w practice form Webelement...->

        String textPromptAlertPopUp = driver.findElement(By.cssSelector("#simple-alert-label"))
                .getText();

        Assert.assertEquals(textPromptAlertPopUp, "OK button pressed");

        /** confirm prompt alert box */
        driver.findElement(By.cssSelector("#prompt-alert")).click();
        driver.switchTo().alert().sendKeys("Lord Vader");
        driver.switchTo().alert().accept();

        String textPromptAlertBox = driver.findElement(By.cssSelector("#prompt-label"))
                .getText();

        Assert.assertEquals(textPromptAlertBox, "Hello Lord Vader! How are you today?");

        /** confirm alert box OK */
        driver.findElement(By.cssSelector("#confirm-alert")).click();
        driver.switchTo().alert().accept();

        String textAlertBoxOk = driver.findElement(By.cssSelector("#confirm-label"))
                .getText();

        Assert.assertEquals(textAlertBoxOk, "You pressed OK!");

        /** dissmis alert box OK */
        driver.findElement(By.cssSelector("#confirm-alert")).click();
        driver.switchTo().alert().dismiss();

        String textAlertBoxCancel = driver.findElement(By.cssSelector("#confirm-label"))
                .getText();

        Assert.assertEquals(textAlertBoxCancel, "You pressed Cancel!");

//        /** delayded alert */
//        driver.findElement(By.cssSelector("#delayed-alert")).click();
//        driver.switchTo().alert()   DOKONCZYC

    }
}
