#TSTINSC-879

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Vermittlerkonto editieren
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich aendere das Vermittlerkonto
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die Aenderung fuer Vermittlerkonto ist gespeichert
    And Der Vertriebsweg wird geloescht