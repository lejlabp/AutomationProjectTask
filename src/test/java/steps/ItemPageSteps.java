package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ItemPage;

public class ItemPageSteps {
    @And("the user clicks on the ADD TO CART button")
    public void theUserClicksOnTheADDTOCARTButton() {
        ItemPage.clickOnAddToCartButton();
    }

    @And("the user clicks on Shopping cart on the menu")
    public void theUserClicksOnShoppingCartOnTheMenu() {
        ItemPage.clickOnShoppingCartItemMenu();
    }

    @Then("the user waits for notification")
    public void theUserWaitsForNotification() {
        ItemPage.waitForNotification();
    }
}
