#TSTINSC-725

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ E-Mail anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Kommunikation-Anlage auf
    And Ich fuelle die Pflichfelder fuer Kommunikation-E-Mail aus
    When Ich speichere Kommunikation
    And Ich rufe die Kommunikation-Detailansicht auf
    Then Die angelegte Daten fuer Kommunikation-E-Mail sind vorhanden