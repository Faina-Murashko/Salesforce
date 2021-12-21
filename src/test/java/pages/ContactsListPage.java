package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsListPage extends BasePage{
    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    public ContactsListPage open(){
        driver.get(BASE_URL + "/lightning/o/Contact/list");
        return this;
    }

    @Override
    protected boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }

    public ContactModalPage clickNew(){
        //       wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        return new ContactModalPage(driver);
    }
}