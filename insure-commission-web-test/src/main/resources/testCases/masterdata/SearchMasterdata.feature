#TSTINSC-66

Feature: Stammdaten

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Stammdaten suchen
    Given Ich lege einen Stammdatensatz an
    When Ich suche nach Stammdaten
    Then Der Stammdatensatz ist vorhanden
