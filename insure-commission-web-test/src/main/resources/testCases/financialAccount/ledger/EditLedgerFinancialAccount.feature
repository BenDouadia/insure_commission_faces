#TSTINSC-895

Feature: Hauptbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Hauptbuch editieren
    Given Ich lege ein Hauptbuch an
    And Ich suche nach Hauptbuch
    And Ich rufe die Hauptbuch-Detailansicht auf
    And Ich rufe die Hauptbuch-Bearbeiten-Maske auf
    And Ich aendere das Hauptbuch
    When Ich speichere die Aenderung fuer Hauptbuch
    Then Die Aenderung fuer Hauptbuch ist gespeichert
