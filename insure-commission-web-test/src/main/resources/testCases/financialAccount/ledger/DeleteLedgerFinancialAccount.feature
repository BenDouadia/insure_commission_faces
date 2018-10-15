#TSTINSC-896

Feature: Hauptbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Hauptbuch loeschen
    Given Ich lege ein Hauptbuch an
    And Ich suche nach Hauptbuch
    When Ich loesche das Hauptbuch
    Then Das Hauptbuch ist geloescht