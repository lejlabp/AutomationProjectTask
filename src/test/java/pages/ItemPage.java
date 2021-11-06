package pages;

import org.openqa.selenium.By;
import utilities.Util;

public class ItemPage {

    private static final By addToCartButtonLocator = By.xpath("//*[text()='Add to cart']");
    private static final By shoppingCartItemMenuLocator = By.id("topcartlink");
    private static final By barNotificationLocator = By.id("bar-notification");

    public static void clickOnAddToCartButton() {
        Util.fluentWait(addToCartButtonLocator).click();
    }

    public static void clickOnShoppingCartItemMenu() {
        Util.fluentWait(shoppingCartItemMenuLocator).click();
    }

    public static void waitForNotification() {
        Util.fluentWait(barNotificationLocator);
    }

}
