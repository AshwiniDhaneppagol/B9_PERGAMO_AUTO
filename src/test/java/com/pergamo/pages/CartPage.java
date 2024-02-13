package com.pergamo.pages;

import com.pergamo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public WebElement searchProduct(String productName) {
        return Driver.get().findElement(By.xpath("//a[@title='" + productName + "']"));
    }

    @FindBy(xpath = "//button[@id='product-add-to-cart']")
    public WebElement addToCartButton;

    public WebElement productDescription() {
        return Driver.get().findElement(By.xpath("//a[@class='previewCartItem-name link-underline']/span[@class='text']"));
    }

    @FindBy(xpath = "//button[@class='halo-sidebar-close button-effect' and @aria-label='Schließen']")
    public WebElement cartCloseButton;

    @FindBy(xpath = "(//span[text()='Cart'])[1]")
    public WebElement cartIcon;

    @FindBy(xpath = "//a[@class='header__heading-link focus-inset 2']/img[@class='header__heading-logo']")
    public WebElement pergamoIcon;

    @FindBy(xpath = " //a[@class='previewCartItem-image']//img")
    public WebElement productPhoto;

    @FindBy(xpath = "//a[@class='plus btn-quantity']")
    public WebElement plusSignToIncreaseQuantity;

    @FindBy(xpath = "//button[@class='previewCartItem-remove']")
    public WebElement removeButton;

    public WebElement productQuantity() {
        return Driver.get().findElement(By.id("upsell-update-44883199525166"));
    }

    @FindBy(xpath = "//a[@class='minus btn-quantity']")
    public WebElement minusSignToIncreaseQuantity;

    public WebElement totalPrice() {
        return Driver.get().findElement(By.xpath("(//div[@class='previewCartTotals-value'])[3]"));
    }

    @FindBy(xpath = "//label[@class='global-checkbox--label form-label--checkbox']")
    public WebElement ichStimmeDenCheckbox;

    @FindBy(xpath = "//button[@class='button button-1 button-checkout']")
    public WebElement KasseButton;

    public WebElement checkOutPage() {
        return Driver.get().findElement(By.xpath("//h2[text()='Express Checkout']"));
    }
}

