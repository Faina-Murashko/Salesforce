package pages;

import elements.Input;
import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage{
    public static final By CONTACT_NEW_TITLE = By.cssSelector(".slds-modal .slds-modal__title");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isPageOpen() {
        return isExist(CONTACT_NEW_TITLE);
    }

    public boolean create (Contacts contacts) {

 //       new DropDown(driver, "Salutation").selectOption(contacts.getS);
        new Input(driver, "First Name").write(contacts.getFirstName());
        new Input(driver,"Last Name").write(contacts.getLastName());
        new Input(driver,"Account Name").write(contacts.getAccountName());
        new Input(driver,"Title").write(contacts.getTitle());
        new Input(driver,"Phone").write(contacts.getPhone());
        new Input(driver,"Mobile").write(contacts.getMobile());
        new Input(driver,"Email").write(contacts.getEmail());
        new Input(driver,"Mailing Street").write(contacts.getMailingStreet());
        new Input(driver,"Mailing City").write(contacts.getMailingCity());
        new Input(driver,"Mailing State/Province").write(contacts.getMailingStateProvince());
        new Input(driver,"Mailing Zip/Postal Code").write(contacts.getMailingZipPostalCode());
        new Input(driver,"Mailing Country").write(contacts.getMailingCountry());
        new Input(driver,"Other Street").write(contacts.getOtherStreet());
        new Input(driver,"Other City").write(contacts.getOtherCity());
        new Input(driver,"Other State Province").write(contacts.getOtherStateProvince());
        new Input(driver,"Other Zip/Postal Code").write(contacts.getOtherZipPostalCode());
        new Input(driver,"Other Country").write(contacts.getOtherCountry());
        new Input(driver,"Fax").write(contacts.getFax());
        new Input(driver,"Home Phone").write(contacts.getHomePhone());
        new Input(driver,"Other Phone").write(contacts.getOtherPhone());
        new Input(driver,"Asst.Phone").write(contacts.getAsstPhone());
        new Input(driver,"Assistant").write(contacts.getAssistant());
        new Input(driver,"Department").write(contacts.getDepartment());
        new Input(driver,"Description").write(contacts.getDescription());
        return false;
    }
}
