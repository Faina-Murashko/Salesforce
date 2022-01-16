package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsDetailsPage extends BasePage{
    String fieldValueContacts = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lighting-formatted-text";

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public String getFieldValueByName(String fieldName) {
        return driver. findElement(By.xpath(String.format(fieldValueContacts, fieldName))).getText();


    }




}