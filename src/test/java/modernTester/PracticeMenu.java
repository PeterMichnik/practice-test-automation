package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeMenu extends BaseTest {

    @Test
    public void musicSelection() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/menu-item.php");

        WebElement music = driver.findElement(By.cssSelector("#ui-id-9"));
        music.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement typeOfMusic = driver.findElement(By.cssSelector("#ui-id-13"));
        typeOfMusic.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement typeOfJazz = driver.findElement(By.cssSelector("#ui-id-16"));
        typeOfJazz.click();
    }
}
