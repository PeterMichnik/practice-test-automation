package modernTester;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeDroppable extends BaseTest{

    @Test
    public void dragAndDropSquare(){

     driver.get("https://seleniumui.moderntester.pl/droppable.php");

        /** drag to target */
        WebElement dragSquare = driver.findElement(By.cssSelector("#draggable"));
        WebElement dropSquare = driver.findElement(By.cssSelector("#droppable"));

        Actions action = new Actions(driver);
        action.clickAndHold(dragSquare).moveToElement(dropSquare).release().perform();

        /** check that text appeared */
        String textSuccessDropped = driver.findElement(By.xpath("//div/p[.='Dropped!']"))
                .getText();
        Assert.assertEquals(textSuccessDropped, "Dropped!");
    }
}
