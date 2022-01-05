package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeMenu extends BaseTest {

    @Test
    public void musicSelection() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/menu-item.php");

        WebElement music = driver.findElement(By.cssSelector("#ui-id-9"));
        music.click();

        Thread.sleep(1000);

        WebElement typeOfMusic = driver.findElement(By.cssSelector("#ui-id-13"));
        typeOfMusic.click();

        Thread.sleep(1000);

        WebElement typeOfJazz = driver.findElement(By.cssSelector("#ui-id-16"));
        typeOfJazz.click();
    }
}
