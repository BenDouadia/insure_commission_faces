#TSTINSC-889

Feature: Buchungsvorlage

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Buchungsvorlage loeschen
    Given Ich lege eine Buchungsvorlage an
    And Ich suche nach Buchungsvorlage
    When Ich loesche die Buchungsvorlage
    Then Die Buchungsvorlage ist geloescht