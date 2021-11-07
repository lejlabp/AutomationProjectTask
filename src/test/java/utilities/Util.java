package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;

public final class Util extends TestBase {

    private static final int timeoutDuration = 10;
    private static final int pollingFrequency = 2;

    private Util() {
        throw new UnsupportedOperationException();
    }

    public static WebElement fluentWait(final By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutDuration))
                .pollingEvery(Duration.ofSeconds(pollingFrequency))
                .ignoring(NoSuchElementException.class);

        WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return webElement;
    }
}
