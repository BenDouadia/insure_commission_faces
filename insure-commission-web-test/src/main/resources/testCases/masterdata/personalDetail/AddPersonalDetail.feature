#TSTINSC-715

Feature: Personaldetail

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Personaldetail anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Personaldetail-Detailansicht auf
    And Ich rufe die Personaldetail-Anlage auf
    And Ich fuelle die Pflichfelder fuer Personaldetail aus
    When Ich speichere Personaldetail
    Then Die angelegte Daten fuer Personaldetail sind vorhanden