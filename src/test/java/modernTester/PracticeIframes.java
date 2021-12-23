package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeIframes extends BaseTest {

    @Test
    public void shouldFillIframe() {

        driver.get("https://seleniumui.moderntester.pl/iframes.php");

        /** select iframe1 */
        WebElement iframe1 = driver.findElement(By.name("iframe1"));
        driver.switchTo().frame(iframe1);

        /** input first name in iframe1 */
        WebElement firstName = driver.findElement(By.cssSelector("#inputFirstName3"));
        firstName.sendKeys("Anna");

        /** input last name in iframe1 */
        WebElement lastName = driver.findElement(By.cssSelector("#inputSurname3"));
        lastName.sendKeys("Kowalska");

        /** sign in in iframe1 */
        WebElement signInButtonFrame1 = driver.findElement(By.cssSelector(".btn-primary"));
        signInButtonFrame1.click();

        /** Switch to the main frame */
        driver.switchTo().defaultContent();

        /** select iframe2 */
        WebElement iframe2 = driver.findElement(By.name("iframe2"));
        driver.switchTo().frame(iframe2);

        /** input login in iframe2 */
        WebElement login = driver.findElement(By.id("inputLogin"));
        login.sendKeys("kowal2000");

        /** input password in iframe2 */
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("CzarnyKoc12!");

        /** select continents in iframe2 */
        WebElement selectContinents = driver.findElement(By.id("inlineFormCustomSelectPref"));
        Select selectObject = new Select(selectContinents);
        selectObject.selectByValue("antarctica");

        /** select year of experience in iframe2 */
        List<WebElement> yearOfExperience = driver.findElements(By.cssSelector("[name='gridRadios']"));
        yearOfExperience.get(3).click();
        driver.findElement(By.cssSelector("#gridRadios2")).click();

        /** Switch to the main frame */
        driver.switchTo().defaultContent();

        WebElement clickBasicButton = driver.findElement(By.xpath("//a[contains(text(),'Basic')]"));
        clickBasicButton.click();
    }
}
