package steps;

import io.cucumber.java.en.And;
import pages.ShoppingCartPage;
import utilities.BaseClass;

public class ShoppingCartSteps extends BaseClass {
    @And("the user validates that the requested item is successfully added to the cart {string}")
    public void theUserValidatesThatTheRequestedItemIsSuccessfullyAddedToTheCart(String itemName) {
        ShoppingCartPage.validateShoppingCart(itemName);
        closeDriver();
    }
}
