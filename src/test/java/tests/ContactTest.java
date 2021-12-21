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
                .login("fainka18-jwhv@force.com", "kawasakizx636c1");

        ContactModalPage isContactModalOpen = contactsListPage
                .open()
                .clickNew();
        Contacts contacts = new Contacts(
                "Ms.",
                "Faina",
                "Murashko",
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
                "Stroiteley",
                "Borisov",
                "Minsk",
                "222120",
                "Belarus",
                "+733674972",
                "88845732",
                "666634791",
                "1234556",
                "fun",
                "woods",
                "Manufacture of wooden products");
        boolean isContactDetailPageOpen = contactModalPage
                .create(contacts);



    }
}
