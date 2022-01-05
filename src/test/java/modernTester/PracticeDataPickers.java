package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeDataPickers extends BaseTest{

    @Test
    public void selectDate30102018() throws InterruptedException{

        driver.get("https://seleniumui.moderntester.pl/datepicker.php");

        WebElement date = driver.findElement(By.cssSelector("#datepicker"));
        date.click();

        Thread.sleep(10000);


    }


}
