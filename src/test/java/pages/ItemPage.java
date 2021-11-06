package pages;

import org.openqa.selenium.By;

public class ItemPage extends BaseClass {
    public static void clickOnAddToCartButton() {
        fluentWait(By.xpath("//*[text()='Add to cart']")).click();
    }

    public static void clickOnShoppingCartItemMenu() {
        fluentWait(By.id("topcartlink")).click();
    }

    public static void waitForNotification() {
        fluentWait(By.id("bar-notification"));
    }

}
