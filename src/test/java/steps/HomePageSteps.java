package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.BaseClass;


public class HomePageSteps extends BaseClass {

    @Given("The user navigates to the nonCommerce portal")
    public void theUserNavigatesToTheNonCommercePortal() {
        setDriver();
        openNonCommercePortal();
    }

    @When("the user enters item name {string} in the search field")
    public void theUserEntersItemNameInTheSearchField(String itemName) {
        HomePage.enterItemName(itemName);
    }

    @And("the user clicks on the Search button")
    public void theUserClicksOnTheSearchButton() {
        HomePage.clickSearchButton();
    }

}
