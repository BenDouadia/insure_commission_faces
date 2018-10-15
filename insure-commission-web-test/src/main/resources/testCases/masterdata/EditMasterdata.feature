#TSTINSC-65

Feature: Stammdaten

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Stammdaten editieren
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Stammdaten-Bearbeiten-Maske auf
    And Ich aendere die Stammdaten
    When Ich speichere die Aenderung fuer Stammdaten
    Then Die Aenderung fuer Stammdaten ist gespeichert
