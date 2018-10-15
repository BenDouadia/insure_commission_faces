#TSTINSC-871

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Vertriebsweg editieren
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    And Ich rufe die Vertriebsweg-Bearbeiten-Maske auf
    And Ich aendere den Vertriebsweg
    When Ich speichere die Aenderung fuer Vertriebsweg
    Then Die Aenderung fuer Vertriebsweg ist gespeichert
    And Der Vertriebsweg wird geloescht