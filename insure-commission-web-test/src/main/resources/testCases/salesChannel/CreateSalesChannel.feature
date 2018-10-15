#TSTINSC-873

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Vertriebsweg anlegen
    Given Ich rufe die Vertriebsweg-Ansicht auf
    And Ich rufe die Vertriebsweg-Anlage auf
    And Ich fuelle die Pflichfelder fuer Vertriebsweg aus
    When Ich speichere Vertriebsweg
    Then Die angelegte Daten fuer Vertriebsweg sind vorhanden
    And Der Vertriebsweg wird geloescht