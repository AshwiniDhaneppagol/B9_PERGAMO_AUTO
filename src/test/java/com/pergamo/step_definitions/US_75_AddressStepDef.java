package com.pergamo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_75_AddressPage;

public class US_75_AddressStepDef {
    US_75_AddressPage us_06_addressPage=new US_75_AddressPage();

    @Then("Der Benutzer klickt auf die Account button")
    public void derBenutzerKlicktAufDieAccountButton() {
        us_06_addressPage.accountButton.click();
    }

    @Then("Der Benutzer klickt auf die Address button")
    public void derBenutzerKlicktAufDieAddressButton() {
        us_06_addressPage.addressBtn.click();
    }

    @And("Der Benutzer klickt auf die Add A New Adress button")
    public void derBenutzerKlicktAufDieAddANewAdressButton() {
        us_06_addressPage.addNewAdressBtn.click();
    }
    @Then("Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.")
    public void der_benutzer_sollte_in_der_lage_sein_die_neue_adresse_hinzuzufügen_nachdem_er_die_erforderlichen_felder_ausgefüllt_hat() {
       us_06_addressPage.firstNameInput.sendKeys("Akif");
       us_06_addressPage.lastNameInput.sendKeys("Yilmaz");
       us_06_addressPage.addressCompanyNewInput.sendKeys("Google");
       us_06_addressPage.address1Input.sendKeys("Berlin Straße");
       us_06_addressPage.address2Input.sendKeys("Köln Straße");
       us_06_addressPage.cityInput.sendKeys("Münich");
       us_06_addressPage.postalZipCodeInput.sendKeys("78987");
       us_06_addressPage.phoneInput.sendKeys("+4916124319754");
       us_06_addressPage.addAddressBTN2.click();


    }
    @Then("Der Benutzer sollte in der Lage sein, die neue Adresse zu aktualisieren")
    public void der_benutzer_sollte_in_der_lage_sein_die_neue_adresse_zu_aktualisieren() {
       us_06_addressPage.editButton.click();
       us_06_addressPage.addressCompanyNewInput.clear();
       us_06_addressPage.addressCompanyNewInput.sendKeys("DHL");
       us_06_addressPage.updateAdressBtn.click();
       Assert.assertEquals("DHL",us_06_addressPage.editCompanyName.getText());

    }

    @Then("Der Benutzer sollte eine {string} Warnung erhalten, wenn er die Adresse löschen möchte.")
    public void derBenutzerSollteEineWarnungErhaltenWennErDieAdresseLöschenMöchte(String expectedMessage) {
        us_06_addressPage.remove3.click();
        Assert.assertEquals(expectedMessage,us_06_addressPage.getPopUpText());
    }
}


