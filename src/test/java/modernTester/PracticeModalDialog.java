package modernTester;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeModalDialog extends BaseTest {

    @Test
    public void ClickCreateUser() {

        driver.get("https://seleniumui.moderntester.pl/modal-dialog.php");

        WebElement createNewUser = driver.findElement(By.cssSelector("#create-user"));
        createNewUser.click();

        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.clear();
        name.sendKeys("Jane Nowak");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.clear();
        email.sendKeys(RandomStringUtils.randomAlphabetic(10) + "@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.clear();
        password.sendKeys("Kl23asD");

        WebElement createNewAccount = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/button[.='Create an account']"));
        createNewAccount.click();

    }
}
