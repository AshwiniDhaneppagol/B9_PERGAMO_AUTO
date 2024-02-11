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

}
