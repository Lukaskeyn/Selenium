package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
Этот класc описывает страницу авторизации.
 */
public class LoginPage extends BasePage {
    private final By LOGIN_BTN = By.xpath("//*[@class ='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    private final By LOGIN_FIELD = By.xpath("//*[@name ='username']");
    private final By PASSWORD_FIELD = By.xpath("//*[@name ='password']");
    private final By ERROR_MSG = By.xpath("//*[text()='Invalid credentials']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL);
    }

    public void login(String login, String password) {
        driver.findElement(LOGIN_FIELD).sendKeys(login);
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BTN).click();
    }

    public String checkErrorMessage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(ERROR_MSG));
        return driver.findElement(ERROR_MSG).getText();
    }
}
