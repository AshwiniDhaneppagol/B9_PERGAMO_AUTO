package com.pergamo.pages;



import com.pergamo.utilities.BrowserUtils;
import com.pergamo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class US_74_HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='customer_email']")
    public WebElement emailInput;

    @FindBy(id = "customer_password")
    public WebElement passwordInput;
    public void navigateMenu(String menuName) {

        WebElement menü = Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']"));
        BrowserUtils.verifyElementDisplayed(menü);

    }

    public void navigateSubMenu(String menuName, String subMenuName) {

        WebElement menü = Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']"));
        BrowserUtils.hover(menü);

        WebElement subMenu = Driver.get().findElement(By.xpath("//*[text()='" + subMenuName + "']"));
        BrowserUtils.verifyElementDisplayed(subMenu);


    }
}


