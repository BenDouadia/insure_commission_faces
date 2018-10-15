#TSTINSC-870

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Vertriebsweg anzeigen
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    When Ich rufe die Vertriebsweg-Detailansicht auf
    Then Der Vertriebsweg ist angezeigt
    And Der Vertriebsweg wird geloescht
