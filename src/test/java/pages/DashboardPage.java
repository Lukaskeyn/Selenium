package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
Класс, который описывает страничку дашборд, открывающуюся сразу после логина.
 */
public class DashboardPage extends BasePage {
    private final By ELEMENT_ADMIN = By.xpath("//*[@class='oxd-main-menu-item active']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpen() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(ELEMENT_ADMIN));
        return driver.findElement(ELEMENT_ADMIN).isDisplayed();
    }

    public void adminPageClick() {
        driver.findElement(ELEMENT_ADMIN).click();
    }
}
