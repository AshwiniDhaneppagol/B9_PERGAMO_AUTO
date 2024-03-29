@B9PR-72
Feature:Ich muss mich als Benutzer registrieren können

  Background:
    Given Ich sollte zur Website "url" gehen.
    When Der Benutzer klickt auf die Einloggen button
    Then Der Benutzer klickt auf die Benutzerkonto Erstellen button

  @B9PR-82
  Scenario:verifizieren Text sehen
    Given Der Benutzer sollte "BENUTZERKONTO ERSTELLEN" text sehen

  @B9PR-83
  Scenario:verifizieren Warnung erhalten
    Given Der Benutzer klickt auf die Nächste button
    When Der Benutzer sollte ein "Please fix errors before continuing" Warnung erhalten
  @B9PR-84
  Scenario:verifizieren Email warnung erhalten
    Given Der Benutzer eine ungültige E-Mail-Adresse eingibt.
    When Der Benutzer sollte eine "bitte geben Sie eine gültige E-Mail Adresse an" Warnung erhalten
  @B9PR-85
  Scenario:verifizieren Password warnung erhalten
    Given Der Benutzer gibt "123" als Passwort ein
    When Der Benutzer sollte eine "Password is too short" erhalten
  @B9PR-86
  Scenario:verifizieren text sehen
    Given Der Benutzer füllt die erforderlichen Felder mit gültigen Informationen aus
    When  Überprüfen Sie den Text "ORDER HISTORY"
