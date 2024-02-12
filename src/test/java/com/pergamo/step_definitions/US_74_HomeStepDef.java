package com.pergamo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_74_HomePage;


public class US_74_HomeStepDef {
    US_74_HomePage homePage=new US_74_HomePage();

    @When("Geben Sie die Adresse {string} in das E-Mail-Feld ein")
    public void geben_sie_die_adresse_in_das_e_mail_feld_ein(String email) {

        homePage.emailInput.sendKeys(email);

    }
    @Then("Geben Sie die Adresse {string} in das Passwort-Feld ein")
    public void geben_sie_die_adresse_in_das_passwort_feld_ein(String passwort) {
        homePage.passwordInput.sendKeys(passwort);

    }

    @Given("Der Benutzer sollte das folgende {string} sehen können")
    public void derBenutzerSollteDasFolgendeSehenKönnen(String menuName) {
        homePage.navigateMenu(menuName);
    }

    @Then("Der Benutzer bewegt sich mit der Maus über das {string} und sollte die {string} sehen können")
    public void derBenutzerBewegtSichMitDerMausÜberDasUndSollteDieSehenKönnen(String menuName,String subMenuName) {
        homePage.navigateSubMenu(menuName,subMenuName);
    }
}

