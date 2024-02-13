package com.pergamo.step_definitions;

import com.pergamo.pages.US_72_RegisterPage;
import com.pergamo.utilities.BrowserUtils;
import com.pergamo.utilities.ConfigurationReader;
import com.pergamo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US_72_RegisterStepDef {
    US_72_RegisterPage registerPage = new US_72_RegisterPage();

    @Given("Ich sollte zur Website {string} gehen.")
    public void ich_sollte_zur_website_gehen(String url) {

        Driver.get().get(ConfigurationReader.get(url));
    }

    @Given("Der Benutzer klickt auf die Einloggen button")
    public void derBenutzerKlicktAufDieAccountButton() {
        registerPage.einLoggenButton.click();
    }

    @When("Der Benutzer klickt auf die Benutzerkonto Erstellen button")
    public void der_benutzer_klickt_auf_die_benutzerkonto_erstellen_button() {
        registerPage.benutzerkontoErstellen.click();
    }

    @Then("Klickt auf die Anmeldung button")
    public void klickt_auf_die_anmeldung_button() {
        registerPage.anmeldungButton.click();
        BrowserUtils.waitFor(20);

    }

    @Given("Der Benutzer sollte {string} text sehen")
    public void der_benutzer_sollte_text_sehen(String bnutzrkontoErstllnText) {
        Assert.assertEquals(bnutzrkontoErstllnText, registerPage.bnutzrkontoErstllnText.getText());

    }

    @Given("Der Benutzer klickt auf die Nächste button")
    public void der_benutzer_klickt_auf_die_nächste_button() {
        registerPage.nächsteButton.click();

    }

    @When("Der Benutzer sollte ein {string} Warnung erhalten")
    public void der_benutzer_sollte_ein_warnung_erhalten(String errorMessage) {
        Assert.assertEquals(errorMessage, registerPage.errorLeerMessage.getText());
    }

    @Given("Der Benutzer eine ungültige E-Mail-Adresse eingibt.")
    public void der_benutzer_eine_ungültige_e_mail_adresse_eingibt() {
        registerPage.nameFirmaField.sendKeys("Netto");
        registerPage.straßenadresseField.sendKeys("Berliner Straße");
        registerPage.apartmentField.sendKeys("11");
        registerPage.stadtField.sendKeys("Köln");
        registerPage.selectCountry("Deutschland");
        registerPage.postleitzahlField.sendKeys("34654");
        registerPage.nächsteButton.click();
        registerPage.neinBox.click();
        registerPage.ichStimmeBox.click();
        registerPage.nächsteButton.click();
        registerPage.emailAdresseInput.sendKeys("a");
        registerPage.benutzerkontoErstellenBtn2.click();
    }

    @When("Der Benutzer sollte eine {string} Warnung erhalten")
    public void der_benutzer_sollte_eine_warnung_erhalten(String emailErrorMessage) {
        Assert.assertEquals(emailErrorMessage, registerPage.errorEmailMessage.getText());
    }

    @Given("Der Benutzer gibt {string} als Passwort ein")
    public void der_benutzer_gibt_als_passwort_ein(String password2) {
        registerPage.nameFirmaField.sendKeys("Netto");
        registerPage.straßenadresseField.sendKeys("Berliner Straße");
        registerPage.apartmentField.sendKeys("11");
        registerPage.stadtField.sendKeys("Köln");
        registerPage.selectCountry("Deutschland");
        registerPage.postleitzahlField.sendKeys("34654");
        registerPage.nächsteButton.click();
        registerPage.neinBox.click();
        registerPage.ichStimmeBox.click();
        registerPage.nächsteButton.click();
        registerPage.vornameInput.sendKeys("Ali");
        registerPage.nachnameInput.sendKeys("Yilmaz");
        registerPage.telefonnummerInput.sendKeys("017682012323");
        registerPage.emailAdresseInput.sendKeys("rtwtkali@gmail.com");
        registerPage.emailAdresseBestätigenInput.sendKeys("rtwtkali@gmail.com");
        registerPage.passwortInput2.sendKeys(password2);
        registerPage.bestätigePasswortInput.click();

    }

    @When("Der Benutzer sollte eine {string} erhalten")
    public void der_benutzer_sollte_eine_erhalten(String shortMessage) {
        Assert.assertEquals(shortMessage, registerPage.passwordShortMessage.getText());

    }

    @Given("Der Benutzer füllt die erforderlichen Felder mit gültigen Informationen aus")
    public void der_benutzer_füllt_die_erforderlichen_felder_mit_gültigen_informationen_aus() {
        registerPage.nameFirmaField.sendKeys("Netto");
        registerPage.straßenadresseField.sendKeys("Berliner Straße");
        registerPage.apartmentField.sendKeys("11");
        registerPage.stadtField.sendKeys("Köln");
        registerPage.selectCountry("Deutschland");
        registerPage.postleitzahlField.sendKeys("34654");
        registerPage.nächsteButton.click();
        registerPage.neinBox.click();
        registerPage.ichStimmeBox.click();
        registerPage.nächsteButton.click();
        registerPage.vornameInput.sendKeys("Ali");
        registerPage.nachnameInput.sendKeys("Yilmaz");
        registerPage.telefonnummerInput.sendKeys("017682012323");
        registerPage.emailAdresseInput.sendKeys("rtwtkali@gmail.com");
        registerPage.emailAdresseBestätigenInput.sendKeys("rtwtkali@gmail.com");
        registerPage.passwortInput2.sendKeys("Ali12345");
        registerPage.bestätigePasswortInput.sendKeys("Ali12345");
        registerPage.benutzerkontoErstellenBtn2.click();

    }

    @When("Überprüfen Sie den Text {string}")
    public void überprüfen_sie_den_text(String orderText) {
        Assert.assertEquals(orderText, registerPage.orderText.getText());
    }

}



