package com.pergamo.pages;

import com.pergamo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public WebElement searchProduct(String productName) {
        return Driver.get().findElement(By.xpath("//a[@title='" + productName + "']"));
    }

    public String productDetails(String productName) {

        return Driver.get().findElement(By.xpath("//span[text()='" + productName + "']")).getText();
    }

    @FindBy(xpath = "//button[@id='product-add-to-cart']")
    public WebElement addToCartButton;

}

