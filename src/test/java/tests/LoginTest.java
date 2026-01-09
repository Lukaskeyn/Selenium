package tests;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/*
Страница с запуском тестов авторизации.
 */
public class LoginTest extends BaseTest {
    private final String LOGIN = "Admin";
    private final String PASSWORD = "admin123";

    @Test
    public void correctLogin() {
        loginPage.openPage();
        loginPage.login(LOGIN, PASSWORD);
        assertTrue(dashboardPage.isPageOpen(), "");
    }

    @Test
    public void incorrectLogin() {
        loginPage.openPage();
        loginPage.login("user", "user123");
        assertEquals(loginPage.checkErrorMessage(), "Invalid credentials");
    }
}
