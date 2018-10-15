#TSTINSC-643

Feature: Adresse

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Adresse editieren
    Given Ich lege eine Adresse an
    And Ich rufe die Adresse-Detailansicht auf
    And Ich rufe die Adresse-Bearbeiten-Maske auf
    And Ich aendere die Adresse
    When Ich speichere die Aenderung fuer Adresse
    Then Die Adresse ist geaendert