package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.TestBase;


public class HomePageSteps extends TestBase {

    @Before
    public void setup() {
        setDriver();
    }

    @After
    public void teardown() {
        closeDriver();
    }

    @Given("The user navigates to the nonCommerce portal")
    public void theUserNavigatesToTheNonCommercePortal() {
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
