package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    LoginPage loginPage;
    WebDriver driver;
    HomePage homePage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailsPage accountDetailsPage;


    @BeforeTest
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);



    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }


}



