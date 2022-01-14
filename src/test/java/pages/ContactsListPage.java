package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class ContactsListPage extends BasePage {

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }
    
    @Step("Opening contact page")
    public ContactsListPage open(){
        driver.get(BASE_URL + "/lightning/o/Contact/list");
        return this;
    }

    public ContactModalPage clickNew() {
        log.info("Click on new button for created new contact");
  //      wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        log.info("successful created new contact");
        return new ContactModalPage(driver);
    }
       

    
}
