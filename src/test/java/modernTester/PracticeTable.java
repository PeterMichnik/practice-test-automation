package modernTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeTable extends BaseTest {

    @Test
    public void shouldPrintPeaksOver4000m() {

        driver.get("https://seleniumui.moderntester.pl/table.php");

        List<WebElement> rows1 = driver.findElements(By.cssSelector("tbody tr"));
        for (WebElement row : rows1) {

            // jak wypisac ranking gór
            String peak = row.findElement(By.xpath("td[1]")).getText();
            String mountainRange = row.findElement(By.xpath("td[2]")).getText();
            String state = row.findElement(By.xpath("td[3]")).getText();
            int height = Integer.parseInt(row.findElement(By.xpath("td[4]")).getText());

            System.out.println(peak + " " + mountainRange + " " + state + " " + height);


        }

        System.out.println(" ");

        /** Print out 'Rank', 'Peak' and 'Mountain range' of mountains that are in "Switzerland" and are higher than 4000 m */
        List<WebElement> rows = driver.findElements(By.cssSelector("tbody tr"));

        for (WebElement row : rows) {
            int height = Integer.parseInt(row.findElement(By.xpath("td[4]")).getText());
            String state = row.findElement(By.xpath("td[3]")).getText();

            if (height > 4000 && state.contains("Switzerland")) {
                List<WebElement> cells = row.findElements(By.cssSelector("td"));
                List<WebElement> rank = row.findElements(By.cssSelector("th"));

                System.out.println(rank.get(0).getText() + " " + cells.get(0).getText() + " " + cells.get(1).getText());
            }
        }
    }
}
