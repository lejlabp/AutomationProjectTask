package pages;

import org.openqa.selenium.By;

public class SearchPage extends BaseClass {
    public static void clickOnItem(String itemName) {
        fluentWait(By.xpath("//*[text()='" + itemName + "']")).click();
    }
}
