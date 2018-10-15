#TSTINSC-872

Feature: Vertriebsweg

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Vertriebsweg loeschen
    Given Ich lege einen Vertriebsweg an
    And Ich suche nach Vertriebsweg
    When Ich loesche den Vertriebsweg
    Then Der Vertriebsweg ist geloescht