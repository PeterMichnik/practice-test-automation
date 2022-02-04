package automatycy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FormTest2 extends BaseTest {

    @Test
    public void completeTheForm() {

        driver.get("https://programautomatycy.pl/test-page/");

        WebElement cookies = driver.findElement(By.cssSelector("#cn-accept-cookie"));
        cookies.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button = driver.findElement(By.cssSelector(".elementor-button-text"));
        button.click();

        WebElement nameBook = driver.findElement(By.cssSelector("#book-text"));
        nameBook.sendKeys("Elon Musk");

        WebElement movie = driver.findElement(By.cssSelector("#movie-text"));
        movie.sendKeys("Forrest Gump");

        List<WebElement> selectNumber = driver.findElements(By.cssSelector("[name='number']"));
        selectNumber.get(5).click();

        WebElement selectAnimal = driver.findElement(By.cssSelector("[name='animal']"));
        Select selectObjectAnimal = new Select(selectAnimal);
        selectObjectAnimal.selectByVisibleText("Pies");

        WebElement selectColor = driver.findElement(By.cssSelector("#colour-select-multiple"));
        Select selectObjectColor = new Select(selectColor);
        selectObjectColor.selectByVisibleText("Niebieski");

        WebElement inputText = driver.findElement(By.cssSelector("#text-text"));
        inputText.sendKeys("Notatka ze spotkania");

//        WebElement clickLink = driver.findElement(By.cssSelector("#courses-url"));
//        clickLink.click();

        WebElement checkAnswer = driver.findElement(By.cssSelector("[name='average[]']"));
        checkAnswer.click();

        WebElement clickSubmit = driver.findElement(By.cssSelector("#click-submit"));
        clickSubmit.click();

//        WebElement textSubmit = driver.findElement(By.cssSelector(".wpcf7-response-output"));
//        clickSubmit.getText();
//        Assert.assertEquals(textSubmit,"Wystąpił problem z wysłaniem twojej wiadomości. Spróbuj ponownie później.");

    }
}
