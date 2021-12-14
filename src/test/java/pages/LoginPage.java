package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By BUTTON_LOGIN = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BUTTON_LOGIN);
    }

    public LoginPage open(){
        driver.get(BASE_URL);
        return this;
    }
    public HomePage login(String userName, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(BUTTON_LOGIN).click();
        return new HomePage(driver);
    }
}
