#TSTINSC-883

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kundenkonto anlegen
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich gebe die Kundenkonto-Daten ein
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die angelegte Daten fuer Kundenkonto sind vorhanden
    And Der Vertriebsweg wird geloescht