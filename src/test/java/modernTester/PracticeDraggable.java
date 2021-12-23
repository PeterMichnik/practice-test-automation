package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class PracticeDraggable extends  BaseTest{

    @Test
    public void dragSquare(){

        driver.get("https://seleniumui.moderntester.pl/draggable.php");

        /** drag square to upper right */
        WebElement dragSquare = driver.findElement(By.cssSelector("#draggable"));
        Actions action = new Actions(driver);
        action.clickAndHold(dragSquare).moveByOffset(1000,-80).release().perform();
        //jak przeciagnac np. w prawy dolny rog ?

    }
}
