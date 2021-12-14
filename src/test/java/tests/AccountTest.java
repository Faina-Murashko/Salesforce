package tests;

import models.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest extends BaseTest {
    @Test
    public void accountShouldBeCreated() {
        //логин
        loginPage
                .open()
                .login("fainka18-jwhv@force.com", "kawasakizx636c1");
        //открыть страницу аккаунтов
        //кликнуть на кнопку нью
        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isAccountModalOpen, "Попап не открылся");
        //заполнить все поля
        Account account = new Account(
                "F.WOOD.ECO",
                "www.instagram.com/m.faina.s.wood/",
                "Investor",
                "+375259137994",
                "+1775362845",
                "60",
                "12",
                "Other",
                "Manufacture of wooden products",
                "fbufguywb@.com",
                "Chalovskoy",
                "Borisov",
                "Minsk",
                "Borisov",
                "Minsk",
                "222512",
                "Belarus",
                "222512",
                "Belarus");

        //нажать на кнопку сейв
        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        assertTrue(isDetailsPageOpen, "Страница Details не открылась");
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
        System.out.println("!");
    }
}

