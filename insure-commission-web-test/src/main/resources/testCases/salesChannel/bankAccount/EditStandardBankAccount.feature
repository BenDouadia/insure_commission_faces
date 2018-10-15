#TSTINSC-878

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Standardkonto editieren
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich aendere das Standardkonto
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die Aenderung fuer Standardkonto ist gespeichert
    And Der Vertriebsweg wird geloescht