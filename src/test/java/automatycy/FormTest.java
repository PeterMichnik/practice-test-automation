package automatycy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class FormTest extends BaseTest {

    @Test
    public void completeTheForm() {

        driver.get("https://programautomatycy.pl/test-page/");

        WebElement cookies = driver.findElement(By.cssSelector("#cn-accept-cookie"));
        cookies.click();

        WebElement firstName = driver.findElement(By.cssSelector("#firstname-text"));
        firstName.sendKeys("Anna");

        WebElement secondName = driver.findElement(By.cssSelector("#secondname-text"));
        secondName.sendKeys("Kamila");

        WebElement lastName = driver.findElement(By.cssSelector("#lastname-text"));
        lastName.sendKeys("Nowak");

        List<WebElement> optionNumber = driver.findElements(By.cssSelector("[name='option']"));
        optionNumber.get(1).click();

        WebElement selectDay = driver.findElement(By.id("day-select"));
        Select selectObject = new Select(selectDay);
        selectObject.selectByVisibleText("Czwartek");

        WebElement selectBrowser = driver.findElement(By.id("browser-select-multiple"));
        Select selectObjectBrowser = new Select(selectBrowser);
        selectObjectBrowser.selectByVisibleText("Microsoft Edge");

        WebElement text = driver.findElement(By.cssSelector("#description-text"));
        text.sendKeys("Test, test1, TEST");

        List<WebElement> selectCheckBoxC1 = driver.findElements(By.cssSelector("[name='c1[]']"));
        selectCheckBoxC1.get(0).click();

        List<WebElement> selectCheckBoxC2 = driver.findElements(By.cssSelector("[name='c2[]']"));
        selectCheckBoxC2.get(0).click();

        WebElement selectGroup = driver.findElement(By.cssSelector("[value='Grupa 2']"));
        selectGroup.click();

    }
}