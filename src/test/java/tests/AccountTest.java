package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Log4j2
public class AccountTest extends BaseTest {
    @Test(description = "creating new account using LOMBOCK")
    public void accountShouldBeCreated()  {
        log.info("Start tests login");
        loginPage
                .open()
                .login("murashkofainasergeevna-lwpq@force.com", "kawasakizx636c1");

        log.info("new account should be created");
        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .clickSave()
                .isPageOpen();
        log.info("that account modal opened");
        assertTrue(isAccountModalOpen, "Попап не открылся");
        log.info("that account don't opened");

        Account account = AccountFactory.get();

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
                log.info("account should be created");
        assertTrue(isDetailsPageOpen, "Страница Details не открылась");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(), "Phone number does not math the expected");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Fax"), account.getFax(), "Fax does not math the expected ");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Employees"), account.getEmployees(), "Employees does not math the expected");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Description"), account, "Description does not math the expected");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "Type does not math the expected");


    }
}

