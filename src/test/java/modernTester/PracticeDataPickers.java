package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PracticeDataPickers extends BaseTest {

    @Test
    public void someNameOfTEst() {

        driver.get("https://seleniumui.moderntester.pl/datepicker.php");

        goToDate( 2,12, 2021);
        //asercja co sprawdza czy dobra data została wybrana
        goToDate(12, 01, 2022);
        //asercja co sprawdza czy dobra data została wybrana
        goToDate(5, 05, 2022);
        //asercja co sprawdza czy dobra data została wybrana
    }

    private void goToDate(int expectedDay, int expectedMonth, int expectedYear) {

        if (expectedYear > getDisplayedYear()) {

            WebElement buttonDate = driver.findElement(By.cssSelector("#datepicker"));
            buttonDate.click();

            WebElement rightArrow = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
            rightArrow.click();
            // klikaj strzalkę w prawo aż tekst w DatePickerze będzie rowny expectedMonth + expectedYear
        } else if (expectedYear < getDisplayedYear()) {

            WebElement buttonDate = driver.findElement(By.cssSelector("#datepicker"));
            buttonDate.click();

            WebElement leftArrow = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span"));
            leftArrow.click();

            // klikaj strzalkę w lewo aż tekst w DatePickerze będzie rowny expectedMonth + expectedYear
        } else if (expectedMonth > getDisplayedMonth()) {

            WebElement buttonDate = driver.findElement(By.cssSelector("#datepicker"));
            buttonDate.click();

            WebElement rightArrow = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
            rightArrow.click();

            // klikaj strzalkę w prawo aż tekst w DatePickerze będzie rowny expectedMonth + expectedYear
        } else if (expectedMonth < getDisplayedMonth()) {

            WebElement buttonDate = driver.findElement(By.cssSelector("#datepicker"));
            buttonDate.click();

            WebElement leftArrow = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span"));
            leftArrow.click();
            // klikaj strzalkę w lewo aż tekst w DatePickerze będzie rowny expectedMonth + expectedYear
        }
        selectDay(expectedDay);
    }

    public int getDisplayedYear() {

        String year = driver.findElement(By.xpath("//div/span[.='2022']"))
                .getText();

        int parse = Integer.parseInt(year);
        System.out.println(parse);
        return parse;

// pobieranie tekstu z wyświetlonego roku i zamiana na int
    }

    public int getDisplayedMonth() {
//        String month = driver.findElement(By.id * mth).getText();

        String month = driver.findElement(By.xpath("//div/span[.='January']"))
                .getText();
        return allMonths.indexOf(month) + 1;
    }

    public void selectDay(int expectedDay) {



// klikanie konkretnego dnia
    }

    private List<String> allMonths =
            Arrays.asList("January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December");


}

