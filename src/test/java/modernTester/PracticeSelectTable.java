package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeSelectTable extends BaseTest {

    @Test
    public void selectTable() {

        driver.get("https://seleniumui.moderntester.pl/selectable.php");
        Actions actions = new Actions(driver);

        WebElement first_WebElement = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
        WebElement third_WebElement = driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
        WebElement fourth_WebElement = driver.findElement(By.xpath("//*[@id='selectable']/li[4]"));

        actions.keyDown(Keys.LEFT_CONTROL)
                .click(first_WebElement)
                .click(third_WebElement)
                .click(fourth_WebElement)
                .build()
                .perform();

//        String textSuccessAppeared = driver.findElement(By.xpath("//div/p[.='#1']"))
//                .getText();
//        Assert.assertEquals(textSuccessAppeared, "#1"); // nie wiem

    }
}
