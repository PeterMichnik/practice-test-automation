package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PracticeWindowsTab extends BaseTest {

    @Test
    public void selectBrowserWindow() {
        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");

        /** select new browser window */
        WebElement selectNewBrowserWindow = driver.findElement(By.cssSelector("#newBrowserWindow"));
        selectNewBrowserWindow.click();

        /** switch to a new browser window */
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            driver.get("http://automation-practice.emilos.pl/");
        } catch (Exception e) {
            System.out.println(e);
        }
        /** get all rows from table */
        List<WebElement> rows1 = driver.findElements(By.cssSelector("tbody tr"));
        for (WebElement row : rows1) {

            String rank = row.findElement(By.cssSelector("th")).getText();
            String peak = row.findElement(By.xpath("td[1]")).getText();
            String mountainRange = row.findElement(By.xpath("td[2]")).getText();
            String state = row.findElement(By.xpath("td[3]")).getText();
            int height = Integer.parseInt(row.findElement(By.xpath("td[4]")).getText());

            System.out.println(rank + " " + peak + " " + mountainRange + " " + state + " " + height);
        }
        driver.close();
    }
    @Test
    public void selectNewMessageWindow() {

        driver.get("https://seleniumui.moderntester.pl/windows-tabs.php");

        /** select new message window */
        WebElement selectNewMessageWindow = driver.findElement(By.cssSelector("#newMessageWindow"));
        selectNewMessageWindow.click();
    }
}

