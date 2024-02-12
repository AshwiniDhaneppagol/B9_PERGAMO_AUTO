package com.pergamo.pages;



import com.pergamo.utilities.BrowserUtils;
import com.pergamo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class US_72_RegisterPage extends BasePage {

    @FindBy(xpath = "(//span[text()='Einloggen'])[1]")
    public WebElement einLoggenButton;

    @FindBy(xpath = "//span[text()='Passwort vergessen?']")
    public WebElement whatsappText;

    @FindBy(xpath = "//input[@value='Anmeldung']")
    public WebElement anmeldungButton;

    @FindBy(xpath = "//h2[contains(text(),'Order history')]")
    public WebElement orderText;

    @FindBy(xpath = "//a[text()='Benutzerkonto erstellen']")
    public WebElement benutzerkontoErstellen;

    @FindBy(xpath = "//h1[text()='Benutzerkonto erstellen']")
    public WebElement bnutzrkontoErstllnText;

    @FindBy(xpath = "(//div[text()='bitte geben Sie eine gültige E-Mail Adresse an'])[1]")
    public WebElement errorEmailMessage;

    @FindBy(xpath = "(//span[text()='Please fix errors before continuing'])[1]")
    public WebElement errorLeerMessage;

    @FindBy(xpath = "//input[@id='105435']")
    public WebElement nameFirmaField;

    @FindBy(xpath = "//input[@id='549449']")
    public WebElement straßenadresseField;

    @FindBy(xpath = "//input[@id='102771']")
    public WebElement apartmentField;

    @FindBy(xpath = "//input[@id='115461']")
    public WebElement stadtField;

    public void selectCountry(String country) {

        WebElement countryDropdown = Driver.get().findElement(By.xpath("//select[@id='143607']"));
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(country);
    }

    @FindBy(xpath = "//input[@id='649081']")
    public WebElement postleitzahlField;

    @FindBy(xpath = "//span[text()='Nächste']")
    public WebElement nächsteButton;

    @FindBy(xpath = "//span[text()='Nein']")
    public WebElement neinBox;

    @FindBy(xpath = "//span[text()='Ich stimme den Großhandelsbedingungen zu']")
    public WebElement ichStimmeBox;

    @FindBy(xpath = "//input[@id='554233']")
    public WebElement vornameInput;

    @FindBy(xpath = "//input[@id='105979']")
    public WebElement nachnameInput;

    @FindBy(xpath = "//input[@id='145399']")
    public WebElement telefonnummerInput;

    @FindBy(xpath = "//input[@id='156535']")
    public WebElement emailAdresseInput;

    @FindBy(xpath = "//input[@id='384374']")
    public WebElement emailAdresseBestätigenInput;

    @FindBy(xpath = "(//div[text()='Password is too short'])[1]")
    public WebElement passwordShortMessage;

    @FindBy(xpath = "//input[@id='121294']")
    public WebElement passwortInput2;

    @FindBy(xpath = "//input[@id='707382']")
    public WebElement bestätigePasswortInput;

    @FindBy(xpath = "//span[text()='Benutzerkonto erstellen']")
    public WebElement benutzerkontoErstellenBtn2;

    public String getPopUpText(){
        BrowserUtils.waitFor(3);
        Alert alert = Driver.get().switchTo().alert();
        String actualMessage= alert.getText();
        alert.accept();
        return actualMessage;
    }












    @FindBy(xpath = "//div[text()='darf nicht leer sein']")
    public WebElement errorMessage;

    @FindBy(xpath = "//p[contains(text(),'Die E-Mail-Adresse oder das Passwort ist falsch')]")
    public WebElement passwordErrorMessage;


}


