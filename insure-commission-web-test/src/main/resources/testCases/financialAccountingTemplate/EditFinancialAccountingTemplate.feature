#TSTINSC-888

Feature: Buchungsvorlage

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Buchungsvorlage editieren
    Given Ich lege eine Buchungsvorlage an
    And Ich suche nach Buchungsvorlage
    And Ich rufe die Buchungsvorlage-Detailansicht auf
    And Ich rufe die Buchungsvorlage-Bearbeiten-Maske auf
    And Ich aendere die Buchungsvorlage
    When Ich speichere die Aenderung fuer Buchungsvorlage
    Then Die Aenderung fuer Buchungsvorlage ist gespeichert
