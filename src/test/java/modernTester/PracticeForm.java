package modernTester;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeForm extends BaseTest {

    @Test
    public void shouldFillFormWithSuccess() {

        driver.get("https://seleniumui.moderntester.pl/form.php");

        /** input first name */
        WebElement firstName = driver.findElement(By.id("inputFirstName3"));
        firstName.sendKeys("Anna");

        /** input last name */
        WebElement lastName = driver.findElement(By.id("inputLastName3"));
        lastName.sendKeys("Kowalska");

        /** input email */
        WebElement email = driver.findElement(By.id("inputEmail3"));
        email.sendKeys(RandomStringUtils.randomAlphabetic(10) + "@gmail.com");

        /** select sex */
        List<WebElement> genders = driver.findElements(By.cssSelector("[name='gridRadiosSex']"));
        genders.get(1).click();

        /** input age */
        WebElement age = driver.findElement(By.id("inputAge3"));
        age.sendKeys("20");

        /** select year of experience */
        List<WebElement> experience = driver.findElements(By.cssSelector("[name='gridRadiosExperience']"));
        experience.get(4).click();

        /** select profession */
        List<WebElement> profession = driver.findElements(By.cssSelector("[name='gridCheckboxProfession']"));
        profession.get(1).click();

        /** select continents */
        WebElement selectContinents = driver.findElement(By.id("selectContinents"));
        Select selectObject = new Select(selectContinents);
        selectObject.selectByVisibleText("Europe");

        /** select switch commands */
        Select selectCommands = new Select(driver.findElement(By.id("selectSeleniumCommands")));
        selectCommands.selectByValue("switch-commands");

        selectCommands.selectByVisibleText("Switch Commands");
        selectCommands.selectByIndex(2); // mozna inaczej

        /** select wait commands */
        selectCommands.selectByValue("wait-commands");
        selectCommands.selectByVisibleText("Wait Commands");
        selectCommands.selectByIndex(3);

        /** choose file */
        WebElement uploadFileInput = driver.findElement(By.cssSelector("input[type='file']"));
        String path = "C:\\Users\\pmichnik\\Desktop\\test_selenium.txt";
        uploadFileInput.sendKeys(path);

        /** additional information */
        WebElement additionalInfo = driver.findElement(By.id("additionalInformations"));
        additionalInfo.sendKeys("Hello");

        /** test file to dowland */
        WebElement testFileToDowload = driver.findElement(By.cssSelector("[class='btn btn-secondary btn-lg active']"));
        testFileToDowload.click();

        /** sign in */
        WebElement signIn = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        signIn.click();

        String textSuccessSignIn = driver.findElement(By.cssSelector("#validator-message"))
                .getText();

        Assert.assertEquals(textSuccessSignIn, "Form send with success");


    }
}
