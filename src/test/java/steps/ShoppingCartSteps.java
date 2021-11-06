package steps;

import io.cucumber.java.en.And;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {
    @And("the user validates that the requested item is successfully added to the cart {string}")
    public void theUserValidatesThatTheRequestedItemIsSuccessfullyAddedToTheCart(String itemName) {
        ShoppingCartPage.validateShoppingCart(itemName);
    }
}
