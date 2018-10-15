#TSTINSC-64

Feature: Stammdaten

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Stammdaten anlgen
    Given Ich rufe die Stammdatensatz-Anlage auf
    And Ich fuelle die Pflichfelder fuer Stammdatensatz aus
    When Ich speichere Stammdaten
    Then Die angelegte Daten fuer Stammdaten sind vorhanden
