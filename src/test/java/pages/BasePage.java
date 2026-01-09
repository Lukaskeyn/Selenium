package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
   Страница,  в которую вынесены базовые конструкции.
   PS - saucedemo у меня( а может в январе 2026-го и у всех) не работает, нашел другой сайт для тестов.
    */
public class BasePage {

    public static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
}
