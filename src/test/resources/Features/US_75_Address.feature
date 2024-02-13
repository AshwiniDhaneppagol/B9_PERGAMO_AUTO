@B9PR-75
Feature: Ich sollte als Benutzer eine neue Adresse hinzufügen können

  Background:
    Given Ich sollte zur Website "url" gehen.
    When Der Benutzer klickt auf die Einloggen button
    Then Geben Sie die Adresse "kemal@gmail.com" in das E-Mail-Feld ein.
    And Geben Sie die Adresse "Emrah12345" in das Passwort-Feld ein.
    And Klickt auf die Anmeldung button


  @B9PR-88
  Scenario: Neue Adresse hinzuzufügen
    When Der Benutzer klickt auf die Account button
    Then Der Benutzer klickt auf die Address button
    And Der Benutzer klickt auf die Add A New Adress button
    And Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.

  @B9PR-89
  Scenario: Neue Adresse aktualisieren
    When Der Benutzer klickt auf die Account button
    Then Der Benutzer klickt auf die Address button
    And Der Benutzer klickt auf die Add A New Adress button
    And Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.
    Then Der Benutzer sollte in der Lage sein, die neue Adresse zu aktualisieren

  @B9PR-90
  Scenario: Neue Adresse löschen
    When Der Benutzer klickt auf die Account button
    Then Der Benutzer klickt auf die Address button
    And Der Benutzer klickt auf die Add A New Adress button
    And Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.
    Then Der Benutzer sollte eine "Are you sure you wish to delete this address?" Warnung erhalten, wenn er die Adresse löschen möchte.


