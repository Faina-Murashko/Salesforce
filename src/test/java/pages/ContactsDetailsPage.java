package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsDetailsPage extends BasePage{

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
