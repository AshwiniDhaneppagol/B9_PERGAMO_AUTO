package pages;


import com.pergamo.pages.BasePage;
import com.pergamo.utilities.BrowserUtils;
import com.pergamo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_75_AddressPage extends BasePage {
    @FindBy(xpath = "//span[text()='Addresses']")
    public WebElement addressBtn;

    @FindBy(xpath = "(//span[text()='Account'])[1]")
    public WebElement accountButton;

    @FindBy(xpath = "//button[contains(text(),'Add a new address')]")
    public WebElement addNewAdressBtn;

    @FindBy(xpath = "//input[@id='AddressFirstNameNew']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='AddressLastNameNew']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='AddressCompanyNew']")
    public WebElement addressCompanyNewInput;

    @FindBy(xpath = "//input[@id='AddressAddress1New']")
    public WebElement address1Input;

    @FindBy(xpath = "//input[@id='AddressAddress2New']")
    public WebElement address2Input;

    @FindBy(xpath = "//input[@id='AddressCityNew']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@id='AddressZipNew']")
    public WebElement postalZipCodeInput;

    @FindBy(xpath = "//input[@id='AddressPhoneNew']")
    public WebElement phoneInput;

    @FindBy(xpath = "//button[text()='Add address']")
    public WebElement addAddressBTN2;

    @FindBy(id = "EditFormButton_10042652950861")
    public WebElement editButton;

    @FindBy(xpath = "(//button[text()='Update address'])[2]")
    public WebElement updateAdressBtn;

    @FindBy(xpath = "//span[contains(text(),'Lidl')]")
    public WebElement editCompanyName;

    @FindBy(xpath = "//button[@aria-label='Remove 3']")
    public WebElement remove3;

    public String getPopUpText(){
        BrowserUtils.waitFor(3);
        Alert alert = Driver.get().switchTo().alert();
        String actualMessage= alert.getText();
        alert.accept();
        return actualMessage;
    }
}
