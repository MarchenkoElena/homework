import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LitecartAdminTest {
    private WebDriver driver;

    @Before
    public void start() {
        driver = new ChromeDriver();
    }

    @Test
    public void loginAndPasswordFieldsFilledAndPressLoginButtonWhenLoginFormOpens() {
        driver.get("http://localhost/litecart/admin");

        WebElement username = driver.findElement(new By.ByName("username"));
        username.click();
        username.sendKeys("admin");

        WebElement password = driver.findElement(new By.ByName("password"));
        password.click();
        password.sendKeys("admin");

        WebElement login = driver.findElement(new By.ByName("login"));
        login.click();
    }

    @After
    public void end() {
        driver.quit();
    }
}
