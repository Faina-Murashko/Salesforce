package tests;

import models.ContactFactory;
import models.Contacts;
import org.testng.annotations.Test;
import pages.ContactModalPage;
import pages.ContactsDetailsPage;

public class ContactTest extends BaseTest{
    @Test
    public void contactShouldBeCreated(){
        loginPage
                .open()
                .login("murashkofainasergeevna-lwpq@force.com", "kawasakizx636c1");

        ContactModalPage isContactModalOpen = contactsListPage
                .open()
                .clickNew();
        Contacts contacts = ContactFactory.get();

        boolean isDetailsPageOpen = contactModalPage
                .create(contacts);





    }
}
