#TSTINSC-900

Feature: Kostenstelle

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kostenstelle anlegen
    Given Ich rufe die Kostenstelle-Ansicht auf
    And Ich rufe die Kostenstelle-Anlage auf
    And Ich fuelle die Pflichfelder fuer Kostenstelle aus
    When Ich speichere Kostenstelle
    Then Die angelegte Daten fuer Kostenstelle sind vorhanden