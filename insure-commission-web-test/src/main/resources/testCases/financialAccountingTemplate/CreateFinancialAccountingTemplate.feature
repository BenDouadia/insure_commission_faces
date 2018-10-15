#TSTINSC-890

Feature: Buchungsvorlage

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Buchungsvorlage anlegen
    Given Ich rufe die Buchungsvorlage-Ansicht auf
    And Ich rufe die Buchungsvorlage-Anlage auf
    And Ich fuelle die Pflichfelder fuer Buchungsvorlage aus
    When Ich speichere Buchungsvorlage
    Then Die angelegte Daten fuer Buchungsvorlage sind vorhanden