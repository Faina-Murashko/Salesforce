package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsDetailsPage extends BasePage{
    private static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }




}
