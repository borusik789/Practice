package com.sdet_fast_track.step_definitions;

import com.sdet_fast_track.pages.WikipediaPage;
import com.sdet_fast_track.utilities.ConfigurationReader;
import com.sdet_fast_track.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitions {
WikipediaPage wikipediaPage=new WikipediaPage();
    @Given("user is on the wikipedia main page")
    public void user_is_on_the_wikipedia_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiUrl"));
    }

    @When("user searches for Steve Jobs")
    public void user_searches_for_steve_jobs() {
       wikipediaPage.searchInput.sendKeys("Steve Jobs");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        wikipediaPage.searchButton.click();
    }
    @Then("user should see Steve Jobs on the title")
    public void user_should_see_steve_jobs_on_the_title() {
     String expectedTitle="Steve Jobs";
     String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue("Title did not match.",actualTitle.contains(expectedTitle));
    }

    @Then("user should see Steve Jobs on the main header")
    public void user_should_see_steve_jobs_on_the_main_header() {
        String expectedHeader="Steve Jobs";
        String actualHeader=wikipediaPage.headerText.getText();
        Assert.assertEquals("Header Text did not match.",expectedHeader,actualHeader);
    }

    @Then("user should see Steve Jobs on the image")
    public void user_should_see_steve_jobs_on_the_image() {
        String expectedImageText="Steve Jobs";
        String actualImageText=wikipediaPage.imageText.getText();

        Assert.assertEquals("Image text did not match.",expectedImageText,actualImageText);
    }
}
