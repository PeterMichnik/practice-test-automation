package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dataPickerTest extends BaseTest {

    @Test
    public void test() {

        driver.get("https://seleniumui.moderntester.pl/datepicker.php");

        String year = "2023";
        String month = "February";
        String day = "8";

        WebElement buttonData = driver.findElement(By.cssSelector("#datepicker"));
        buttonData.click();

        while (true) {
            String textYear = driver.findElement(By.cssSelector(".ui-datepicker-year"))
                    .getText();

            String textMonth = driver.findElement(By.cssSelector(".ui-datepicker-month"))
                    .getText();

            if (textYear.equals(year) && (textMonth.equals(month))) {
                break;

            } else {
                WebElement rightArrow = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
                rightArrow.click();
            }
        }
        driver.findElement(By.xpath("//tbody/tr/td/a[contains(text()," + day + ")]"))
                .click();
    }
}
