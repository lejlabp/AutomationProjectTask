package pages;

import org.openqa.selenium.By;

public class HomePage extends BaseClass{

    public static void enterItemName(String itemName){
        driver.findElement(By.id("small-searchterms")).sendKeys(itemName);
    }

    public static void clickSearchButton(){
        //driver.findElement(By.id(btnSubmit)).click();
        driver.findElement(By.xpath("//*[text()='Search']")).click();
    }

}
