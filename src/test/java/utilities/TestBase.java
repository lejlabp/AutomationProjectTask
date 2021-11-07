package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    private static final String url = "https://demo.nopcommerce.com/";
    private static final String webDriverPath = "src/test/resources/chromedriver";

    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
    }

    public static void closeDriver() {
        driver.quit();
    }

    public static void openNonCommercePortal() {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
