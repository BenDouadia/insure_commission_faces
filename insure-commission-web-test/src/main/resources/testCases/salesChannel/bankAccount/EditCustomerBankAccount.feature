#TSTINSC-880

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kundenkonto editieren
    Given Ich lege einen Vertriebsweg inkl. Kundenkonto an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich aendere das Kundenkonto
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die Aenderung fuer Kundenkonto ist gespeichert
    And Der Vertriebsweg wird geloescht