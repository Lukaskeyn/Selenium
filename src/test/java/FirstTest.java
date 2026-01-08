import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {
    @Test
    public void getDeliveryCoast() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cdek.ru/ru/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Thread.sleep(4000);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        WebElement element;
        element = driver.findElement(By.xpath("//label[.//div[text()='Откуда']]/input[@class='cdek-input__input']"));
        element.click();
        element.sendKeys("abc");
        //xpath //a[@id='navbarDropdown']
        //css   [id='navbarDropdown']
        //css   #navbarDropdown
        ////label[@class='cdek-input__control cdek-input__control_user-event']//div[text()='Куда']
        //css локатор [class='cdek-input__input']
        ////label[.//div[text()='Откуда']]/input[@class='cdek-input__input']
        ////div[@class='autocomplete-city autocomplete-city--error order-widget-input']//button[text()='Санкт-Петербург']
        // //label[@class ='cdek-input__control cdek-input__control_user-event']/input[1]

    }
}
