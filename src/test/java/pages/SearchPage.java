package pages;

import org.openqa.selenium.By;
import utilities.Util;

public class SearchPage {
    public static void clickOnItem(String itemName) {
        Util.fluentWait(By.xpath("//*[text()='" + itemName + "']")).click();
    }
}
