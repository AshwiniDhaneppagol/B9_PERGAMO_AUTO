@B9PR-74
Feature: Als Benutzer sollte ich auf der Startseite Kategorien und Unterkategorien auswählen können

  Background:
    Given Ich sollte zur Website "url" gehen.
  @B9PR-77
  Scenario Outline:Alle Menüs sollten sichtbar sein
    Given Der Benutzer sollte das folgende "<menü>" sehen können
    Examples:
      | menü            |
      | Home            |
      | Frühstück       |
      | Backen & Kochen |
      | Nüsse & Kerne   |
      | Shop            |
      | Aktion          |
      | Großhandel      |

  @B9PR-78
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    Then Der Benutzer bewegt sich mit der Maus über das "Frühstück" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | Milchprodukte |
      | Oliven        |
  @B9PR-78
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    And Der Benutzer bewegt sich mit der Maus über das "Shop" und sollte die "<submenü>" sehen können
    Examples:
      | submenü                 |
      | Fleisch                 |
      | Essig & Sauce           |
      | Geschenk                |
      | Gesundheitsprodukte     |
      | Olivenöl                |
      | Premium Medjool Datteln |
      | Sesampaste und Malasse  |
      | Tee und Kaffe Sorten    |
      | Trockenfrüchte          |
      | Trockenprodukte         |
      | Türkische Desserts      |
  @B9PR-78
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    Then Der Benutzer bewegt sich mit der Maus über das "Aktion" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | Angebote      |
      | Vorteilspaket |
  @B9PR-78
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    Then Der Benutzer bewegt sich mit der Maus über das "Großhandel" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | B2B Angebot   |
  @B9PR-79 @B9PR-80
  Scenario Outline:Melden Sie sich mit gültigen Zugangsdaten an
    Given Der Benutzer klickt auf die Einloggen button
    When Geben Sie die Adresse "<email>" in das E-Mail-Feld ein
    Then Geben Sie die Adresse "<password>" in das Passwort-Feld ein
    And Klickt auf die Anmeldung button

    Examples:
      | email           | password   |
      | kemal@gmail.com | Emrah12345 |

  @B9PR-79
  Scenario Outline:Alle Menüs sollten sichtbar sein
    Given Der Benutzer sollte das folgende "<menü>" sehen können
    Examples:
      | menü            |
      | Home            |
      | Frühstück       |
      | Backen & Kochen |
      | Nüsse & Kerne   |
      | Shop            |
      | Aktion          |
      | Großhandel      |

  @B9PR-80
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    Then Der Benutzer bewegt sich mit der Maus über das "Frühstück" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | Milchprodukte |
      | Oliven        |
  @B9PR-80
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    And Der Benutzer bewegt sich mit der Maus über das "Shop" und sollte die "<submenü>" sehen können
    Examples:
      | submenü                 |
      | Fleisch                 |
      | Essig & Sauce           |
      | Geschenk                |
      | Gesundheitsprodukte     |
      | Olivenöl                |
      | Premium Medjool Datteln |
      | Sesampaste und Malasse  |
      | Tee und Kaffe Sorten    |
      | Trockenfrüchte          |
      | Trockenprodukte         |
      | Türkische Desserts      |
  @B9PR-80
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    Then Der Benutzer bewegt sich mit der Maus über das "Aktion" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | Angebote      |
      | Vorteilspaket |
  @B9PR-80
  Scenario Outline:Alle Sub-Menüs sollten sichtbar sein
    Then Der Benutzer bewegt sich mit der Maus über das "Großhandel" und sollte die "<submenü>" sehen können
    Examples:
      | submenü       |
      | B2B Angebot   |






