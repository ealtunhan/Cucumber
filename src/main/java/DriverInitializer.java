import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class DriverInitializer {
    private static Properties properties = null;

    static {
        try {
            properties = new Properties();
            properties.load(DriverInitializer.class.getClassLoader().getResourceAsStream("application.properties"));
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.path"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        WebDriver driver = null;
        String browser_option = getProperty("browser");
        switch (browser_option) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        return driver;
    }

    public static String getProperty(String key) {
        return properties == null ? null : properties.getProperty(key, "");
    }
}
