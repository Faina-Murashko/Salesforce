package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage{
    private static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'slds-modal__header')]/h2");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public boolean created (Contacts contacts) {

        new DropDown(driver, "Salutation").selectOptionsContact(contacts.getSalutation());
        new Input(driver, "First Name").writeContact(contacts.getFirstName());
        new Input(driver, "Last Name").writeContact(contacts.getLastName());
        new Input(driver, "Phone").writeContact(contacts.getPhone());
        new Input(driver, "Mobile").writeContact(contacts.getMobile());
        new Input(driver, "Account Name").writeContactAccount(contacts.getAccountName());
        new Input(driver, "Title").writeContact(contacts.getTitle());
        new Input(driver, "Email").writeContact(contacts.getEmail());
        new TextArea(driver, "Mailing Street").writeContact(contacts.getMailingStreet());
        new Input(driver, "Mailing City").writeContact(contacts.getMailingCity());
        new Input(driver, "Mailing State/Province").writeContact(contacts.getMailingStateProvince());
        new Input(driver, "Mailing Country").writeContact(contacts.getMailingCountry());
        new Input(driver, "Mailing Zip/Postal Code").writeContact(contacts.getMailingZipPostalCode());
        new Input(driver, "Home Phone").writeContact(contacts.getHomePhone());
        new Input(driver, "Other Phone").writeContact(contacts.getOtherPhone());
        new Input(driver, "Department").writeContact(contacts.getDepartment());
        new Input(driver, "Birthdate").writeContact(contacts.getBirthdate());
        new TextArea(driver, "Description").writeContact(contacts.getDescription());
        driver.findElement(SAVE_BUTTON_CONTACTS).click();


        return false;
    }

}

