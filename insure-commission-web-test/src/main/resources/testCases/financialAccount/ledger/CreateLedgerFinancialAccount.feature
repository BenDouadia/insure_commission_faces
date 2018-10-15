#TSTINSC-897

Feature: Hauptbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Hauptbuch anlegen
    Given Ich rufe die Hauptbuch-Ansicht auf
    And Ich rufe die Hauptbuch-Anlage auf
    And Ich fuelle die Pflichfelder fuer Hauptbuch aus
    When Ich speichere Hauptbuch
    Then Die angelegte Daten fuer Hauptbuch sind vorhanden