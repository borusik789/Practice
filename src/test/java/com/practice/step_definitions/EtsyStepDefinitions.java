package com.practice.step_definitions;

import com.practice.pages.EtsyPage;
import com.practice.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EtsyStepDefinitions {
    EtsyPage etsyPage = new EtsyPage();

    @Given("user is on etsy main page")
    public void user_is_on_etsy_main_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user verifies that title is Etsy")
    public void user_verifies_that_title_is_etsy() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Title did not match. ", expectedTitle, actualTitle);
    }

    @When("user types wooden spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
     etsyPage.searchBox.sendKeys("Wooden Spoon");
     etsyPage.searchButton.click();
    }

    @Then("user should verify that title contains the keyword")
    public void user_should_verify_that_title_contains_the_keyword() {
        String expectedTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue("Title did not match. ",actualTitle.contains(expectedTitle));
    }

}
