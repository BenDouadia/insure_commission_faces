#TSTINSC-899

Feature: Kostenstelle

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Kostenstelle loeschen
    Given Ich lege eine Kostenstelle an
    And Ich suche nach Kostenstelle
    When Ich loesche die Kostenstelle
    Then Die Kostenstelle ist geloescht