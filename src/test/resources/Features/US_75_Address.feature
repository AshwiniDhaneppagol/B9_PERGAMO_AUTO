@address
Feature:Ich sollte als Benutzer eine neue Adresse hinzufügen können

  Background:

  Scenario Outline:
    Given Ich sollte zur Website "url" gehen.
    When Der Benutzer klickt auf die Einloggen button
    Then Geben Sie die Adresse "<email>" in das E-Mail-Feld ein
    And Geben Sie die Adresse "<password>" in das Passwort-Feld ein
    And Klickt auf die Anmeldung button
    And Der Benutzer klickt auf die Account button
    Then Der Benutzer klickt auf die Address button
    And Der Benutzer klickt auf die Add A New Adress button
    Examples:
      | email           | password   |
      | kemal@gmail.com | Emrah12345 |

  @B9PR-88
  Scenario :TC_012 neue Adresse hinzuzufügen

    When Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.

  @B9PR-89
  Scenario :TC_012 neue Adresse aktualisieren

    When Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.
    Then Der Benutzer sollte in der Lage sein, die neue Adresse zu aktualisieren

  @B9PR-90
  Scenario :TC_012 neue Adresse löschen

    When Der Benutzer sollte in der Lage sein, die neue Adresse hinzuzufügen, nachdem er die erforderlichen Felder ausgefüllt hat.
    Then Der Benutzer sollte eine "Are you sure you wish to delete this address?" Warnung erhalten, wenn er die Adresse löschen möchte.


