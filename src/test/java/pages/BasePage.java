package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public static final String BASE_URL = "https://tmsqa09onl2.my.salesforce.com/";
    public static final By NEW_BUTTON = By.xpath("//a[@title='New']");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");
//    public static final By SAVE_BUTTON_CONTACTS = By.xpath("//body/div[4]/div[@class='DESKTOP uiContainerManager']/div[1]/div[@role='dialog']//div[@class='modal-body scrollable slds-modal__content slds-p-around--medium']//records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker//records-lwc-detail-panel/records-base-record-form//force-form-footer//runtime_platform_actions-actions-ribbon/ul[@class='slds-button-group-row']//runtime_platform_actions-action-renderer[@title='Save']/runtime_platform_actions-executor-lwc-headless//lightning-button/button[@name='SaveEdit']");
    public static final By SAVE_BUTTON_CONTACTS = By.xpath("//button[@name='SaveEdit']");
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
    protected abstract boolean isPageOpen();

    protected boolean isExist(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException ex){
            System.out.println(">>> !!! " + ex.getMessage());
            return false;
        }
    }

}
