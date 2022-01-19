package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @Test
    public void waitUntilTheText2() {

        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement progressBar = driver.findElement(By.cssSelector(".progress-label"));
        wait.until(ExpectedConditions.textToBePresentInElement(progressBar, "Complete!"));
        Assert.assertEquals(progressBar.getText(), "Complete!");

    }

    @Test
    public void aitUntilTheText3() {
        driver.get("https://seleniumui.moderntester.pl/progressbar.php");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.attributeContains(By.xpath("//body/main[1]/div[1]/div[1]/div[2]"), "class",
                "ui-progressbar-complete"));

        String progress = driver.findElement(By.cssSelector(".progress-label")).getText();
        Assert.assertEquals(progress, "Complete!");
    }

}
