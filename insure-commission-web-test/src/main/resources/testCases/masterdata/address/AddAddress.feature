#TSTINSC-642

Feature: Adresse

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Adresse anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Adresse-Anlage auf
    And Ich fuelle die Pflichfelder fuer Adresse aus
    When Ich speichere Adresse
    And Ich rufe die Adresse-Detailansicht auf
    Then Die angelegte Daten fuer Adresse sind vorhanden