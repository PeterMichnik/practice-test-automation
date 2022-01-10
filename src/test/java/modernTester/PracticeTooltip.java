package modernTester;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTooltip extends BaseTest {

    @Test
    public void printOutTheMessage() {

        driver.get("https://seleniumui.moderntester.pl/tooltip.php");

        String message = driver.findElement(By.cssSelector("#age")).getAttribute("title");
        System.out.println("Tooltip is = " + message);

        Assert.assertEquals(message, "We ask for your age only for statistical purposes.");
    }
}
