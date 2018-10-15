#TSTINSC-882

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Vermittlerkonto anlegen
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich gebe die Vermittlerkonto-Daten ein
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die angelegte Daten fuer Vermittlerkonto sind vorhanden
    And Der Vertriebsweg wird geloescht