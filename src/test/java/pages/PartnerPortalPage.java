package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PartnerPortalPage extends BasePage {

    private static String xpathHeader = "//h1[text()='Partner Portal']";

    public PartnerPortalPage(WebDriver extDriver) {
        super(extDriver);
    }

    public void verifyOpened(){
        log.info("Verify partner portal page opened");
        waitElementVisible(By.xpath(xpathHeader));
        Assert.assertEquals(1, driver.findElements(By.xpath(xpathHeader)).size());
    }
}
