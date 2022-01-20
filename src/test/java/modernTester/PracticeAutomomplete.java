package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeAutomomplete extends BaseTest {

    @Test
    public void searchLetterA() throws InterruptedException {

        driver.get("https://seleniumui.moderntester.pl/autocomplete.php");

        WebElement search = driver.findElement(By.cssSelector("#search"));
        search.sendKeys("a");

//        String options = driver.findElement(By.cssSelector("#ui-id-1")).getAttribute("anders");
//        System.out.println("All options = " + options);

        String options2 = driver.findElement(By.xpath("/html/body/ul/li/div")).getText();
        System.out.println(options2);


    }

}
