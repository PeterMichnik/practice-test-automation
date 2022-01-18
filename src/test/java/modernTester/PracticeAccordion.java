package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAccordion extends BaseTest {

    @Test
    public void showTextSection1() {

        driver.get("https://seleniumui.moderntester.pl/accordion.php");

        WebElement section1 = driver.findElement(By.cssSelector("#ui-id-1"));
        section1.click();

        String textSection1 = driver.findElement(By.cssSelector("#ui-id-2"))
                .getText();

        Assert.assertEquals(textSection1, "Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. " +
                "Integer ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh. " +
                "Donec suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.");
    }

    @Test
    public void openSection2() {

        driver.get("https://seleniumui.moderntester.pl/accordion.php");

        WebElement section2 = driver.findElement(By.cssSelector("#ui-id-3"));
        section2.click();
    }

    @Test
    public void openSection3() {

        driver.get("https://seleniumui.moderntester.pl/accordion.php");

        WebElement section3 = driver.findElement(By.cssSelector("#ui-id-5"));
        section3.click();
    }

    @Test
    public void openSection4() {

        driver.get("https://seleniumui.moderntester.pl/accordion.php");

        WebElement section4 = driver.findElement(By.cssSelector("#ui-id-7"));
        section4.click();
    }
}
