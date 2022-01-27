package modernTester;

import modernTester.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MenuPage;
import pages.RegistrationPage;
import pages.SignInPage;

public class FormPopTest extends BaseTest {

    @BeforeMethod
    public void testSetup() {
        driver.get("http://146.59.32.4/");
    }

    @Test
    public void registrationAccount() {
        new MenuPage(driver)
                .goToSignIn()
                .goToRegistration()
                .setName("Jan")
                .selectMale()
                .setPassword("password")
                .setEmail(RandomStringUtils.randomAlphabetic(10) + "@wp.pl")
                .setLastName("Nowak")
                .acceptGdpr()
                .acceptPolicy()
                .signUpUser();

        String actualName = new MenuPage(driver).getLoggedUserName();
        Assert.assertEquals(actualName, "Jan Nowak");
    }

}