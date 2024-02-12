@wip
Feature:Ich muss mich als Benutzer registrieren können

  Background:
    Given Ich sollte zur Website "url" gehen.
    When Der Benutzer klickt auf die Einloggen button
    Then Der Benutzer klickt auf die Benutzerkonto Erstellen button

  @B9PR-82
  Scenario:
    Given Der Benutzer sollte "BENUTZERKONTO ERSTELLEN" text sehen

  @B9PR-83
  Scenario:
    Given Der Benutzer klickt auf die Nächste button
    When Der Benutzer sollte ein "Please fix errors before continuing" Warnung erhalten
  @B9PR-84
  Scenario:
    Given Der Benutzer eine ungültige E-Mail-Adresse eingibt.
    When Der Benutzer sollte eine "bitte geben Sie eine gültige E-Mail Adresse an" Warnung erhalten
  @B9PR-85
  Scenario:
    Given Der Benutzer gibt "123" als Passwort ein
    When Der Benutzer sollte eine "Password is too short" erhalten
  @B9PR-86
  Scenario:
    Given Der Benutzer füllt die erforderlichen Felder mit gültigen Informationen aus
    When  Überprüfen Sie den Text "ORDER HISTORY"
