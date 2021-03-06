package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountListPage extends BasePage{

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }

    public AccountListPage open(){
        driver.get(BASE_URL + "/lightning/o/Account/list");
        return this;
    }


    public AccountModalPage clickNew(){
        //       wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
}