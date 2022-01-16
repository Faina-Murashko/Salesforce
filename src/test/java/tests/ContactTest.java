package tests;

import Utils.AllureUtils;
import lombok.extern.log4j.Log4j2;
import models.ContactFactory;
import models.Contacts;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactModalPage;
import pages.ContactsDetailsPage;

import static org.testng.Assert.assertTrue;

@Log4j2
public class ContactTest extends BaseTest{
    @Test(description = "Creating new contact using LOMBOCK")
    public void contactShouldBeCreated()  {
        log.info("Start test new contact");
        loginPage
                .open()
                .login("murashkofainasergeevna-lwpq@force.com", "kawasakizx636c1");
        log.info("opened home page and next created new contact");
        AllureUtils.takeScreenshot(driver);
        boolean isContactModalOpen = contactsListPage
                .open()
                .clickNew()
                .isPageOpen();
        log.info("opening check");
        AllureUtils.takeScreenshot(driver);
        assertTrue(isContactModalOpen, "pop-up didn't opened");


        Contacts contacts = ContactFactory.get();
        log.info("created new contact");
        boolean isContactDetailsPageOpen = contactModalPage
                .create(contacts);
        log.info("verification of information");
        Assert.assertTrue(isContactDetailsPageOpen, "Details page didn't opened");
        Assert.assertEquals(contactsListPage.getFieldValueByName("Account Name"), contacts.getAccountName(), "Account Name does not math the expected");
        Assert.assertEquals(contactsListPage.getFieldValueByName("Phone"), contacts.getPhone(), "Phone number does not math the expected");
        Assert.assertEquals(contactsListPage.getFieldValueByName("Fax"), contacts.getDepartment(), "Department does not math the expected ");
        Assert.assertEquals(contactsListPage.getFieldValueByName("Employees"), contacts.getEmail(), "Email does not math the expected");
        Assert.assertEquals(contactsListPage.getFieldValueByName("Description"), contacts.getHomePhone(), "HomePhone does not math the expected");
        Assert.assertEquals(contactsListPage.getFieldValueByName("Type"), contacts.getTitle(), "Title does not math the expected");







    }
}
