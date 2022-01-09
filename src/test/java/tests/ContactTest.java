package tests;

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
        Contacts contacts = new Contacts(
                "Faina",
                "Murashko",
                "Ms.",
                "F.WOOD.ECO",
                "WOOD",
                "+375259137994",
                "+375259137994",
                "fainka18@gmail.com",
                "Chalovskaya",
                "Borisov",
                "Minsk",
                "222512",
                "Belarus",
                "75803057",
                "7947429",
                "06/05/1994",
                "wood",
                "Belarus");
        boolean isDetailsPageOpen = contactModalPage
                .create(contacts);



    }
}
