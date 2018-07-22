package infrastructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Context {

    private static WebDriver driver;
    private static final String DEFAULT_PROPS_FILE_NAME = "testing.properties";
    private static ClassLoader classLoader = Context.class.getClassLoader();
    private static Properties props;
    public static boolean isWindows;

    public static WebDriver driver() {
        if (null == driver) {
            if (isWindows) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            } else {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            }
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void tearDown(){
        driver.quit();
        driver = null;
    }

    static {
        props = readPropertiesFile(DEFAULT_PROPS_FILE_NAME);
        isWindows = Boolean.parseBoolean(props.getProperty("isWindows"));
    }

    private static Properties readPropertiesFile(String propsFileName) {
        Properties props = new Properties();
        try (InputStream i = classLoader.getResourceAsStream(propsFileName)) {
        props.load(i);
        } catch (IOException e) {
        }
    return props;
    }

}
