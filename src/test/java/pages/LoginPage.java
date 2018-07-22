package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public static String loginUrl = "https://partner-de.sb-test1907.sisu.sh/#!/login";
    private static String idEmail = "input-email";
    private static String idPassword = "input-password";
    private static String xpathLogin = "//button[@type='submit']";
    private static String xpathError = "//div[@class='toast-message']";

    public LoginPage(WebDriver extDriver) {
        super(extDriver);
    }

    public void navigate(){
        log.info("Navigate to login page");
        driver.get(loginUrl);
    }

    public LoginPage enterUserData(String login, String password) {
        log.info("Entering user data: " + login + " " + password);
        driver.findElement(By.id(idEmail)).clear();
        driver.findElement(By.id(idEmail)).sendKeys(login);
        driver.findElement(By.id(idPassword)).clear();
        driver.findElement(By.id(idPassword)).sendKeys(password);
        return this;
    }

    public void clickLogin() {
        log.info("Click login");
        driver.findElement(By.xpath(xpathLogin)).click();
    }

    public void verifyError(String error) {
        log.info("Verify error: " + error);
        waitElementVisible(By.xpath(xpathError));
        Assert.assertEquals(error, driver.findElement(By.xpath(xpathError)).getText());
    }
}
