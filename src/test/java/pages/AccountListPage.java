package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
@Log4j2
public class AccountListPage extends BasePage{

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() throws InterruptedException {
        return isExist(BREADCRUMBS_LABEL);
    }
    @Step("Opening account page")
    public AccountListPage open(){
        driver.get(BASE_URL + "/lightning/o/Account/list");
        return this;
    }

    @Step("Click on new button for created new account")
    public AccountModalPage clickNew(){
 //       wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
}
