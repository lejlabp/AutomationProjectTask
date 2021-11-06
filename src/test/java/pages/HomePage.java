package pages;

import org.openqa.selenium.By;
import utilities.Util;

public class HomePage {

    private static final By searchFieldLocator = By.id("small-searchterms");
    private static final By searchButtonLocator = By.xpath("//*[text()='Search']");

    public static void enterItemName(String itemName) {
        Util.fluentWait(searchFieldLocator).sendKeys(itemName);
    }

    public static void clickSearchButton() {
        Util.fluentWait(searchButtonLocator).click();
    }

}
