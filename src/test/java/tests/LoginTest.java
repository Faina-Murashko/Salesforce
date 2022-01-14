package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static pages.BasePage.BASE_URL;
import static pages.HomePage.HOME_LINK;
import static pages.LoginPage.*;
@Log4j2
public class LoginTest extends BaseTest {
    @Test
    public void login(){
        boolean isHomePageOpened = loginPage
                .open()
                .login("murashkofainasergeevna-lwpq@force.com", "kawasakizx636c1")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
        log.info("Enabled test login closed");


    }


}
