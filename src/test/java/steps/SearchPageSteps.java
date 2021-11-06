package steps;

import io.cucumber.java.en.And;
import pages.SearchPage;

public class SearchPageSteps {
    @And("the user clicks on the requested item {string}")
    public void theUserClicksOnTheRequestedItem(String itemName) {
        SearchPage.clickOnItem(itemName);
    }
}
