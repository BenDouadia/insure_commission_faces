#TSTINSC-894

Feature: Hauptbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Hauptbuch suchen
    Given Ich lege ein Hauptbuch an
    When Ich suche nach Hauptbuch
    Then Das Hauptbuch ist vorhanden