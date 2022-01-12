package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeSelectmenu extends BaseTest {

    @Test
    public void selectSpeed() {

        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");

        WebElement speedButton = driver.findElement(By.cssSelector("#speed-button"));
        speedButton.click();

        WebElement slow = driver.findElement(By.cssSelector("#ui-id-2"));
        slow.click();
    }

    @Test
    public void selectAFile() {

        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");

        WebElement speedButton = driver.findElement(By.cssSelector("#files-button"));
        speedButton.click();

        WebElement files = driver.findElement(By.cssSelector("#ui-id-2"));
        files.click();

    }

    @Test
    public void selectANumber() {

        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");

        WebElement numberButton = driver.findElement(By.cssSelector("#number-button"));
        numberButton.click();

        WebElement number = driver.findElement(By.cssSelector("#ui-id-12"));
        number.click();

    }

    @Test
    public void selectATitle() {

        driver.get("https://seleniumui.moderntester.pl/selectmenu.php");

        WebElement titleButton = driver.findElement(By.cssSelector("#salutation-button"));
        titleButton.click();

        WebElement title = driver.findElement(By.cssSelector("#ui-id-2"));
        title.click();

    }
}
