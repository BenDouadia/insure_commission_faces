#TSTINSC-875

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation anlegen
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich gebe die Kommunikationsdaten ein
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die angelegte Daten fuer Kommunikation sind vorhanden
    And Der Vertriebsweg wird geloescht