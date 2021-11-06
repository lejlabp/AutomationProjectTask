package pages;

import org.openqa.selenium.By;
import utilities.Util;

public class ShoppingCartPage {
    public static void validateShoppingCart (String itemName) {
        Util.fluentWait(By.xpath("//*[text()='" + itemName + "']"));
    }
}
