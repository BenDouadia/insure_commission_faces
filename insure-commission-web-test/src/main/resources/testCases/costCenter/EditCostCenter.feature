#TSTINSC-898

Feature: Kostenstelle

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kostenstelle editieren
    Given Ich lege eine Kostenstelle an
    And Ich suche nach Kostenstelle
    And Ich rufe die Kostenstelle-Detailansicht auf
    And Ich rufe die Kostenstelle-Bearbeiten-Maske auf
    And Ich aendere die Kostenstelle
    When Ich speichere die Aenderung fuer Kostenstelle
    Then Die Aenderung fuer Kostenstelle ist gespeichert
