#TSTINSC-657

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Telefon anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Kommunikation-Anlage auf
    And Ich fuelle die Pflichfelder fuer Kommunikation-Telefon aus
    When Ich speichere Kommunikation
    And Ich rufe die Kommunikation-Detailansicht auf
    Then Die angelegte Daten fuer Kommunikation-Telefon sind vorhanden