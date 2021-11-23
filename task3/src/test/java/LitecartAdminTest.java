import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LitecartAdminTest {
    private WebDriver driverChrome;
    private WebDriver driverFirefox;
    private WebDriver driverInternetExplorer;


    @Test
    public void loginAndPasswordFieldsFilledAndPressLoginButtonWhenLoginFormOpensInChrome() {
        driverChrome = new ChromeDriver();
        extracted(driverChrome);
        driverChrome.quit();
    }

    @Test
    public void loginAndPasswordFieldsFilledAndPressLoginButtonWhenLoginFormOpensInFirefox() {
        driverFirefox = new FirefoxDriver();
        extracted(driverFirefox);
        driverFirefox.quit();
    }

    @Test
    public void loginAndPasswordFieldsFilledAndPressLoginButtonWhenLoginFormOpensInIE() {
        driverInternetExplorer = new InternetExplorerDriver();
        extracted(driverInternetExplorer);
        driverInternetExplorer.quit();
    }

    private void extracted(WebDriver driverTest) {
        driverTest.get("http://localhost/litecart/admin");

        WebElement username = driverTest.findElement(new By.ByName("username"));
        username.click();
        username.sendKeys("admin");

        WebElement password = driverTest.findElement(new By.ByName("password"));
        password.click();
        password.sendKeys("admin");

        WebElement login = driverTest.findElement(new By.ByName("login"));
        login.click();
    }

}
