package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BaseClass{
    public static void validateShoppingCart (String itemName) {
        fluentWait(By.xpath("//*[text()='" + itemName + "']"));
    }
}
