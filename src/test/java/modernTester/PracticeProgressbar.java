package modernTester;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeProgressbar extends BaseTest {

    @Test
    public void waitUntilTheText() {

        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String text = driver.findElement(By.xpath("//*[@id='progressbar']/div[.='Complete!']"))
                .getText();
        Assert.assertEquals(text, "Complete!");

    }
}
