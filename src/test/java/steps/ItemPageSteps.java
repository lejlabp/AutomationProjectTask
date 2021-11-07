package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ItemPage;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class ItemPageSteps extends TestBase {
    @And("the user clicks on the ADD TO CART button")
    public void theUserClicksOnTheADDTOCARTButton() throws InterruptedException {
        ItemPage.clickOnAddToCartButton();
        TimeUnit.SECONDS.sleep(5);
    }

    @Then("the user clicks on Shopping cart on the menu")
    public void theUserClicksOnShoppingCartOnTheMenu() {
        ItemPage.clickOnShoppingCartItemMenu();
    }

}
