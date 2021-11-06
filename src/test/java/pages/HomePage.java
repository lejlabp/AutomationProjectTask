package pages;

import org.openqa.selenium.By;

public class HomePage extends BaseClass {

    public static void enterItemName(String itemName) {
        fluentWait(By.id("small-searchterms")).sendKeys(itemName);
    }

    public static void clickSearchButton() {
        fluentWait(By.xpath("//*[text()='Search']")).click();
    }

}
