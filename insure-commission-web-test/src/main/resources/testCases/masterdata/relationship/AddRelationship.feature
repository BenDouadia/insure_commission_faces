#TSTINSC-650

Feature: Zuordnung

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Zuordnung anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Zuordnung-Anlage auf
    And Ich fuelle die Pflichfelder fuer Zuordnung aus
    When Ich speichere Zuordnung
    Then Die angelegte Daten fuer Zuordnung sind vorhanden