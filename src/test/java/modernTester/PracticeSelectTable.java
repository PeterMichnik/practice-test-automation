package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeSelectTable extends BaseTest {

    @Test
    public void selectTable(){

        driver.get("https://seleniumui.moderntester.pl/selectable.php");

        WebElement selectIteam1 = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
        WebElement selectIteam3 = driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
//
//        action.keyDown(Keys.CONTROL)
//                .click(el1)
//                .click(el2)
//                .click(el3)
//                .perform();
//        https://stackoverflow.com/questions/53581400/how-to-select-multiple-elements-in-selenium-not-select-option









    }
}
