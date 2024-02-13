package com.pergamo.step_definitions;

import com.pergamo.pages.CartPage;
import com.pergamo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_70_CartIconFunction {
    CartPage cartPage = new CartPage();

    @And("User hover over on product")
    public void userHoverOverOnProduct() {
        BrowserUtils.hover(cartPage.searchProduct("Weißer Trauben-Essig"));
    }

    @And("User click on IN DEN WARENKORB button")
    public void userClickOnINDENWARENKORBButton() {
        cartPage.addToCartButton.click();
    }

    @Then("User should see product description")
    public void userShouldSeeProductDescription() {
        String actualResult = cartPage.productDescription().getAttribute("innerText");
        String expectedResult = "Weißer Trauben-Essig";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("User closes WARENKORB page")
    public void userClosesWARENKORBPage() {
        cartPage.cartCloseButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("User click on cart icon in the homepage")
    public void userClickOnCartIconInTheHomepage() {
        BrowserUtils.waitForClickablility(cartPage.cartIcon, 5);
        cartPage.cartIcon.click();
        BrowserUtils.waitFor(5);
    }

    @And("User click on pergamo icon")
    public void userClickOnPergamoIcon() {
        cartPage.pergamoIcon.click();
    }

    @Then("User should see product photo")
    public void userShouldSeeProductPhoto() {
        cartPage.productPhoto.click();
    }

    @Then("User can increase product quantity in cart")
    public void userCanIncreaseProductQuantityInCart() {
        cartPage.plusSignToIncreaseQuantity.click();
        BrowserUtils.waitFor(5);
    }

    @Then("product Quantity should be increased by one")
    public void productQuantityShouldBeIncreasedByOne() {
        String actualQuantity = cartPage.productQuantity().getAttribute("value");
        String expectedQuantity = "2";
        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    @Then("product Quantity should be decreased by one")
    public void productQuantityShouldBeDecreasedByOne() {
        String actualQuantity = cartPage.productQuantity().getAttribute("value");
        String expectedQuantity = "1";
        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    @And("User can decrease product quantity in cart")
    public void userCanDecreaseProductQuantityInCart() {
        cartPage.minusSignToIncreaseQuantity.click();
        BrowserUtils.waitFor(5);
    }

    @And("User click on remove product button")
    public void userClickOnRemoveProductButton() {
        BrowserUtils.waitFor(5);
        cartPage.removeButton.click();
    }

    @Then("Product total price should be displayed")
    public void productTotalPriceShouldBeDisplayed() {
        String actualTotalPrice = cartPage.totalPrice().getText();
        String expectedTotalPrice = "€5,90";
        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @And("User check the Ich stimme den checkbox")
    public void userCheckTheIchStimmeDenCheckbox() {
        cartPage.ichStimmeDenCheckbox.click();
    }

    @And("User click on the KASSE button")
    public void userClickOnTheKASSEButton() {
        cartPage.KasseButton.click();
    }

    @Then("Express checkout page should be displayed")
    public void expressCheckoutPageShouldBeDisplayed() {
        String actualHeader = cartPage.checkOutPage().getText();
        String expectedHeader = "Express Checkout";
        Assert.assertEquals(expectedHeader, actualHeader);
    }
}
