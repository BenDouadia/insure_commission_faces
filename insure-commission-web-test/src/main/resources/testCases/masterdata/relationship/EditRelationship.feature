#TSTINSC-651

Feature: Zuordnung

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Zuordnung editieren
    Given Ich lege eine Zuordnung an
    And Ich rufe die Zuordnung-Bearbeiten-Maske auf
    And Ich aendere die Zuordnung
    When Ich speichere die Aenderung fuer Zuordnung
    Then Die Zuordnung ist geaendert