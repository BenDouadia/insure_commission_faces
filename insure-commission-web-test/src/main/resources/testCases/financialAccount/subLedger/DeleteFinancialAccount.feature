#TSTINSC-892

Feature: Nebenbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Nebenbuch loeschen
    Given Ich lege ein Nebenbuch an
    And Ich suche nach Nebenbuch
    When Ich loesche das Nebenbuch
    Then Das Nebenbuch ist geloescht