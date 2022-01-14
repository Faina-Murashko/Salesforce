package tests;

import lombok.extern.log4j.Log4j2;
import models.ContactFactory;
import models.Contacts;
import org.testng.annotations.Test;
import pages.ContactModalPage;
import pages.ContactsDetailsPage;

import static org.testng.Assert.assertTrue;

@Log4j2
public class ContactTest extends BaseTest{
    @Test(description = "Creating new contact using LOMBOCK")
    public void contactShouldBeCreated() {
        log.info("Start test new contact");
        loginPage
                .open()
                .login("murashkofainasergeevna-lwpq@force.com", "kawasakizx636c1");
        boolean isContactModalOpen = contactsListPage
                .open()
                .clickNew()
                .isPageOpen();
        log.info("opening check");
        assertTrue(isContactModalOpen, "pop-up didn't open");


        Contacts contacts = ContactFactory.get();
        log.info("created new contact");
        boolean isContactDetailsPageOpen = contactModalPage
                .created(contacts);





    }
}
