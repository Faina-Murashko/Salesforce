package tests;

import models.Account;
import models.AccountFactory;
import models.ContactFactory;
import models.Contacts;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountModalPage;
import pages.ContactModalPage;

import static org.testng.Assert.*;

public class AccountTest extends BaseTest {
    @Test(description = "creating new account using LOMBOCK")
    public void accountShouldBeCreated() {
        //логин
        loginPage
                .open()
                .login("murashkofainasergeevna-lwpq@force.com", "kawasakizx636c1");
        //открыть страницу аккаунтов
        //кликнуть на кнопку нью
        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isAccountModalOpen, "Попап не открылся");
        //заполнить все поля

        Account account = AccountFactory.get();

        AccountDetailsPage isDetailsPageOpen = accountModalPage
                .create(account);
 //               .isPageOpen();
 ///       assertTrue(isDetailsPageOpen, "Страница Details не открылась");
       /* Assert.assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "/");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Fax"), account.getType(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Employees"), account.getType(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("AnnualRevenue"), account.getType(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Description"), account, "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(), "");
*/
        //проверить создание

    }
}

