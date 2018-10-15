#TSTINSC-646

Feature: Beziehung

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Beziehung anlegen
    Given Ich lege einen Stammdatensatz an
    And Ich suche nach Stammdaten
    And Ich rufe die Stammdaten-Detailansicht auf
    And Ich rufe die Beziehung-Anlage auf
    And Ich fuelle die Pflichfelder fuer Beziehung aus
    When Ich speichere Beziehung
    Then Die angelegte Daten fuer Beziehung sind vorhanden