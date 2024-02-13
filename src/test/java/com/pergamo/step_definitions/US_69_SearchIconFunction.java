package com.pergamo.step_definitions;

import com.pergamo.pages.HomePage;
import com.pergamo.utilities.ConfigurationReader;
import com.pergamo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_69_SearchIconFunction {

    HomePage homePage = new HomePage();

    @When("User enter product name in search box")
    public void userEnterProductNameInSearchBox() {
        homePage.searchBox.sendKeys("Essig");
    }

    @And("User click on search button")
    public void userClickOnSearchButton() {
        homePage.searchButton.click();
    }

    @Then("User should see search {string} for the product.")
    public void userShouldSeeSearchForTheProduct(String expectedResult) {
        Assert.assertNotEquals(expectedResult, homePage.resultsFoundText.getText());
    }

    @When("User enter product name in search box which is not their in website")
    public void userEnterProductNameInSearchBoxWhichIsNotTheirInWebsite() {
        homePage.searchBox.sendKeys("iPhone15");
    }

    @When("User keep search box empty")
    public void userKeepSearchBoxEmpty() {
        homePage.searchBox.sendKeys("");
    }

    @Then("User should be in the homepage of the application {string}")
    public void userShouldBeInTheHomepageOfTheApplication(String expectedUrl) {
        Assert.assertEquals(expectedUrl, ConfigurationReader.get("url"));
    }
}