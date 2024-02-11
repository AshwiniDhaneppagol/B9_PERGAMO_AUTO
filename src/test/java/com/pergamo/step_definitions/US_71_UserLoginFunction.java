package com.pergamo.step_definitions;

import com.pergamo.pages.LoginPage;
import com.pergamo.utilities.ConfigurationReader;
import com.pergamo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_71_UserLoginFunction {

    LoginPage loginPage = new LoginPage();

    @Given("User is in Pergamo application Homepage")
    public void user_is_in_pergamo_application_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User click on Einloggen Icon in the Pergamo homepage.")
    public void userClickOnEinloggenIconInThePergamoHomepage() {
        loginPage.einloggenIcon.click();
    }

    @And("User enters valid email and password as {string} and {string}")
    public void userEntersValidEmailAndPasswordAsAnd(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
    }

    @And("User click on ANMELDUNG button.")
    public void userClickOnANMELDUNGButton() {
        loginPage.anmeldungButton.click();
        // BrowserUtils.waitFor(20);
    }

    @Then("{string} page should be displayed.")
    public void pageShouldBeDisplayed(String expectedResult) {
        System.out.println("loginPage.MyAccountHeader.getText() = " + loginPage.MyAccountHeader.getText());
        Assert.assertEquals(expectedResult, loginPage.MyAccountHeader.getText());
    }

    @When("User enter invalid or empty data in {string} and {string}")
    public void userEnterInvalidOrEmptyDataInAnd(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);

    }

    @Then("{string} page should not be displayed.")
    public void pageShouldNotBeDisplayed(String expectedResult) {
        System.out.println("loginPage.MyAccountHeader.getText() = " + loginPage.MyAccountHeader.getText());
        Assert.assertNotEquals(expectedResult, loginPage.MyAccountHeader.getText());
    }

    @Then("The user should be able to see error message")
    public void theUserShouldBeAbleToSeeErrorMessage() {
        String msg = loginPage.emailInput.getAttribute("validationMessage");
        System.out.println(msg);

    }

    @Then("The user should be able to see {string} message")
    public void theUserShouldBeAbleToSeeMessage(String expectedMessage) {
        String actualMessage = loginPage.emailInput.getAttribute("validationMessage");
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
