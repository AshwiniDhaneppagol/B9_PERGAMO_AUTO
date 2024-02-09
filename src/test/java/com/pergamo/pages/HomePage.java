package com.pergamo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath="//input[@id='Search-In-Modal-Single']")
    public WebElement searchBox;

    @FindBy(xpath="//*[@class='icon-search']")
    public WebElement searchButton;

    @FindBy(xpath="//h1[contains(text(),'results found for ')]")
    public WebElement resultsFoundText;
}