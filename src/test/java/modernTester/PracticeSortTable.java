package modernTester;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeSortTable extends BaseTest {

    @Test
    public void sortTable(){

        driver.get("https://seleniumui.moderntester.pl/sortable.php");

        Actions actions = new Actions(driver);
//
//        WebElement iteam1 = driver.findElement(By.xpath("//*[@id='sortable']/li[3]/text()"));
//        WebElement iteam2 = driver.findElement(By.xpath("//*[@id='sortable']/li[5]/text()"));
//
//        actions.clickAndHold(iteam1)
//                .moveToElement(iteam2)
//                .release()
//                .perform();   nie wiem

    }
}
