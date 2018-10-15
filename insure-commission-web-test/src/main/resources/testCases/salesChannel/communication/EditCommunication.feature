#TSTINSC-874

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kommunikation editieren
    Given Ich lege einen Vertriebsweg inkl. Kundenkonto an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich aendere die Kommunikation
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die Aenderung fuer Kommunikation ist gespeichert
    And Der Vertriebsweg wird geloescht