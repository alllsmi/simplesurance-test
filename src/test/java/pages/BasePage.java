package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {

    protected WebDriver driver;
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    public BasePage(WebDriver extDriver){
        this.driver = extDriver;
    }

    protected void waitElementVisible(By by){
        new WebDriverWait(driver, 10, 50).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
