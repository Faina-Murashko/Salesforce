package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.util.concurrent.TimeUnit;
@Log4j2

public abstract class BaseTest {
    LoginPage loginPage;
    WebDriver driver;
    HomePage homePage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailsPage accountDetailsPage;
    ContactsListPage contactsListPage;
    ContactModalPage contactModalPage;


    @BeforeTest

    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactsListPage = new ContactsListPage(driver);
        contactModalPage = new ContactModalPage(driver);


    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }


}