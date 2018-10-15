#TSTINSC-726

Feature: Kommunikation

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation vom Typ Soziale Netzwerke anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Kommunikation-Anlage auf
    And Ich fuelle die Pflichfelder fuer Kommunikation-Soziale-Netzwerke aus
    When Ich speichere Kommunikation
    And Ich rufe die Kommunikation-Detailansicht auf
    Then Die angelegte Daten fuer Kommunikation-Soziale-Netzwerke sind vorhanden